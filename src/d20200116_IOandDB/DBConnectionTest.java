package d20200116_IOandDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
	public static void main(String[] args) {
		
		// cf) mysql : com.mysql.jdbc.Driver
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		// cf) mysql : jdbc:mysql//localhost:3306:DBname
		// url -> ~~@ip주소:포트번호
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		String user = "scott";
		
		String password = "tiger";
		
		try {
			Class.forName(driver);
			
			Connection conn = 
					DriverManager.getConnection(url, user, password);
			
			System.out.println("conn : " + conn);
			System.out.println("DBMS에 연결이 되었습니다.");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
