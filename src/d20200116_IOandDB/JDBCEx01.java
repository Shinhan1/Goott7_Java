package d20200116_IOandDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx01 {
	public static void main(String[] args) {
		// 0. 변수 설정
		String driver = "oracle.jdbc.driver.OracleDriver";
		// @~~ 세 가지 1. localhost 2. 127.0.0.1 3.host ID
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		// 1. 드라이버 로딩
		try {
			Class.forName(driver);
			
			// 2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			// System.out.println("conn : " + conn);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DBMS 로그인 실패");
		}
		
		// 3. 사용할 SQL문장 작성
		String sql = "select * from dept";
		
		// 4. 문장 객체를 선언
		try {
			pstmt = conn.prepareStatement(sql);
			
			// 5. 실행
			// DBMS가 실행 후 결과값을 리턴해주면 되돌려 받을 자바 객체가 필요함 : ResultSet
			rs = pstmt.executeQuery();
			
			// 6. 레코드 별로 로직 처리
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.println("부서번호 : " + deptno);
				System.out.println("부서이름 : " + dname);
				System.out.println("부서위치 : " + loc);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 7. 자원 반납
		
		finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
