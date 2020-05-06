package d20200117_DB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// 로그인 여부 확인

public class Login extends JFrame implements ActionListener {
	
	JButton jbt1, jbt2;
	JLabel jlb1, jlb2;
	JTextField jtf1;
	JPasswordField jpf;
	
	public Login() {
		// TODO Auto-generated constructor stub
		super("java login test");
		setBounds(1100, 300, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		jbt1 = new JButton("Login");
		jbt2 = new JButton("Register");
		
		jbt1.setBounds(80, 200, 100, 40);
		jbt2.setBounds(200, 200, 100, 40);
		
		add(jbt1); add(jbt2);
		
		jlb1 = new JLabel("I D");
		jlb2 = new JLabel("P W");
		
		jlb1.setBounds(30, 60, 70, 40);
		jlb2.setBounds(30, 120, 70, 40);
		
		add(jlb1); add(jlb2);
		
		jtf1 = new JTextField(30);
		jpf = new JPasswordField(30);
		
		jtf1.setBounds(100, 60, 150, 40);
		jpf.setBounds(100, 130, 150, 40);
		
		add(jtf1); add(jpf);
		
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		if(ob == jbt1) {
			// dbms에 접근해서 id, pw가 일치하는지 확인(비교)
			// System.out.println("click");
			
			String id = jtf1.getText();
			String pw = jpf.getText();
			
			// System.out.println("id : " + id + ", pw : " + pw);
			
			// dbms에 접근해서 id, pw가 일치하는지 확인(비교)
			Connection conn = MakeConnection.getConnection();
			
			StringBuffer sb = new StringBuffer();
			sb.append("select * from login ");
			sb.append("where id = ? and pw = ? ");
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				
				rs = pstmt.executeQuery();
				
				// 간단한 회원여부 check
				if(rs.next()) {
					System.out.println("존재하는 회원");
					System.out.println(rs.getString(1) + "님 어서오세요");
					
				}else System.out.println("회원가입 하세요");
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
		}else if(ob == jbt2) {
			// 회원가입창으로 이동 (호출)
			System.out.println("회원가입하세요");
			System.exit(0);
		}
		
		
		
		
	}
	
	

}
