package d20200109_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//이벤트 처리
//1. 이벤트 소스 결정
//2. 감지기 설정
//3. 핸들러 작성

public class SwingEx01 extends JFrame implements ActionListener{

	JButton jbtn;
	
	public SwingEx01() {
		// TODO Auto-generated constructor stub
		super("action event");
		setSize(500, 500);

		setDefaultCloseOperation(EXIT_ON_CLOSE);	//Frame의 x를 누르면 끄고 나가겠다.
		
		jbtn = new JButton("click");
		add(jbtn);
		
		jbtn.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx01();
	}//main() end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Swing action");
	}

}
