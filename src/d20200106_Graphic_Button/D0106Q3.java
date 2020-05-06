package d20200106_Graphic_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D0106Q3 extends Frame implements ActionListener{
	
	Button bt1, bt2;
	Label lb1, lb2;
	TextField tf1, tf2;
	
	
	public D0106Q3() {
		// TODO Auto-generated constructor stub
		super("로그인");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		setLayout(null);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		bt1 = new Button("Log In");
		bt2 = new Button("Register");
		lb1 = new Label("ID");
		lb2 = new Label("PW");
		tf1 = new TextField();
		tf2 = new TextField();
		
		bt1.setBounds(0, 200, 200, 100);
		bt2.setBounds(200, 200, 200, 100);
		
		lb1.setBounds(50, 50, 50, 50);
		lb2.setBounds(50, 100, 50, 50);
		
		tf1.setBounds(100, 61, 150, 30);
		tf2.setBounds(100, 111, 150, 30);
		
		add(bt1); add(bt2); add(lb1); add(lb2);
		add(tf1); add(tf2);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new D0106Q3();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		
		if(ob == bt1) {
			// DBMS에 접근해서 비교한 후 로그인 기능 수행...
			
			System.out.println(tf1.getText() + "님이 로그인 하셨습니다.");
			System.out.println("비밀번호 " +tf2.getText() + "를 입력하셨습니다.");
			
			String str = tf1.getText();
			bt1.setLabel(str);
		}else
			System.out.println("회원가입 하십시오");
		
		
	}

}
