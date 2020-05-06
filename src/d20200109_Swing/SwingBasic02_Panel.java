package d20200109_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingBasic02_Panel extends JFrame{

	public SwingBasic02_Panel() {
		super("pannel 부착");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); 	//Frame의 x를 누르면 끄고 나가겠다.
		
		Container panel = getContentPane();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.YELLOW);	//Frame의 색을 YELLOW로 지정
		 
		JButton jbtn1 = new JButton("jbtn1");	//버튼을 지정하지 않으면 라벨(jbtn1)의 크기만큼 나옴
		JButton jbtn2 = new JButton("jbtn2");
		JButton jbtn3 = new JButton("jbtn3");
				
		setSize(300, 300);
		setVisible(true);
		
		panel.add(jbtn1);
		panel.add(jbtn2);	//FlowLayout이므로 버튼이 버튼 옆으로 가서 붙음
		panel.add(jbtn3);	
	
	}
	
	
	
	
	public static void main(String[] args) {
		new SwingBasic02_Panel();
	}
}
