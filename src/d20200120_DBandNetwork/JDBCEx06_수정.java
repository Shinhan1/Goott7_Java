package d20200120_DBandNetwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import d20200117_DB.MakeConnection;

// (로그인 성공했다고 하고)
// 홍길동 회원이 자신의 ID를 gildong, PW를 2345로 수정할 수 있도록 해보세요

public class JDBCEx06_수정 {
	
	public static void main(String[] args) {
		
		Connection conn = MakeConnection.getConnection();
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("update member ");
		sb.append("set id = ?, pw = ? ");
		sb.append("where id = 'hong' ");
		
		String id = "gildong";
		String pw = "2345";
		
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sb.toString());
			ps.setString(1, id);
			ps.setString(2, pw);
			
			ps.executeUpdate();
			
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
