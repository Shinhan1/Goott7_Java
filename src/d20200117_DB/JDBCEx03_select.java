package d20200117_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// 사용자로부터 입력받은 사원의 사번, 이름, 연봉 조회하기

public class JDBCEx03_select {
	public static void main(String[] args) {
		System.out.println("검색할 사원의 사번 입력 : ");
		Scanner scan = new Scanner(System.in);
		
		int empno = scan.nextInt();
		
		//System.out.println("empno : " + empno);
		
		// 4. SQL 문장 작성 => 선언부에 두는 것이 나중에 관리가 편함
		StringBuffer sql = new StringBuffer();
		sql.append("select empno, ename, sal*12 annsal ");
		sql.append("from emp ");
		sql.append("where empno = ? ");		// ? : 매번 바뀌는 값 (변수처리)
			

//		"select empno, ename, sal
//		from emp
//		where empno = " + empno;
		
		// 1. 변수 설정
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pw = "tiger";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 2. 드라이버 로딩
		try {
			Class.forName(driver);
			// 3. Connection 객체
			
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("conn : " + conn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결 실패");
		}
		
		
		// 5. 문장 객체 생성
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, empno);
			
			// 6. 실행
			rs = pstmt.executeQuery();
			
			// 7. 로직 처리
			rs.next();
			
			String name = rs.getString("ename");
			
			// 표현식(연산식)은 원테이블의 컬럼에 없으므로 별칭을 주고 그 별칭으로 받아오기
			int annual = rs.getInt("annsal");
			
			System.out.println(empno + "\t" + name + "\t" + annual);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 8. 자원 반납
		finally {
			if(rs != null) {
				try {
					rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
	}

}
