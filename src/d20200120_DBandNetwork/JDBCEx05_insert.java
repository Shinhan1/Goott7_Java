package d20200120_DBandNetwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import d20200117_DB.MakeConnection;

// 사용자가 입력한 내용을 DBMS에 저장
public class JDBCEx05_insert {
	public static void main(String[] args) {
		
		Connection conn = MakeConnection.getConnection();
		
		// System.out.println("conn : " + conn);
		
		// sql
		StringBuffer sb = new StringBuffer();
		sb.append("insert into member ");
		sb.append("values (MEM_MEMNO_SEQ.nextval, ");
		sb.append(" ?, ?, ?, ?, sysdate ) ");
		
		// 사용자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("ID 입력 : ");
		String id = sc.nextLine();
		System.out.println("PW 입력 : ");
		String pw = sc.nextLine();
		System.out.println("TEL 입력 : ");
		String tel = sc.nextLine();
		
		System.out.println(id + " " + pw + "\n" + tel + " " + name);
		
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sb.toString());
			// ? 지정
			ps.setString(1, id);
			ps.setString(2,  pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			
			ps.executeUpdate();		// select를 제외한 나머지는 update로 써야함 // 실행해라
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				
				if(ps != null) ps.close();
				if(conn != null) conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}

}
