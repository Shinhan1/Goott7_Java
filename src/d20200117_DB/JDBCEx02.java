package d20200117_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// EMP 테이블의 모든 정보를 조회해보세요

public class JDBCEx02 {
	public static void main(String[] args) {
		// 0. 변수 설정
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pw = "tiger";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 1. 드라이버 로딩
		
		try {
			Class.forName(driver);
			
			// 2. Connection 객체 생성 - 연결
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 3. 사용할 SQL 문장 작성
		String sql = "select * from emp";
		
		// 4. 문장 객체 선언
		try {
			pstmt = conn.prepareStatement(sql);
			
			// 5. 실행 - return
			rs = pstmt.executeQuery();
			
			// 6. 레코드별로 로직 처리
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				int mgr = rs.getInt(4);
				String job = rs.getString(3);
				String hiredate = rs.getString(5);
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				int deptno = rs.getInt(8);
				
				System.out.println(empno);
				System.out.println(ename);
				System.out.println(mgr);
				System.out.println(job);
				System.out.println(hiredate);
				System.out.println(sal);
				System.out.println(comm);
				System.out.println(deptno);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 7. 자원 반납
		
		finally{
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
