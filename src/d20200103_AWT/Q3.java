package d20200103_AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Q3 extends Frame implements ActionListener, WindowListener{
	
	Button btn1, btn2;
	
	// 클릭 횟수 변수
	int bc = 0;
	
	Q3() {
		super("신호등?");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		setLayout(null);
		this.addWindowListener(this);
		
		btn1 = new Button("NEXT");
		btn2 = new Button("EXIT");
		
		add(btn1); add(btn2);
		
		btn1.setSize(200, 100);
		btn2.setSize(200, 100);
		
		btn1.setLocation(0, 200);
		btn2.setLocation(200, 200);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		new Q3();
	}
	

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("종료합니다.");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("click");
		Object ob = e.getSource();
		
		if(ob == btn1) {
			System.out.println("NEXT click");
			if(bc == 0) {
				System.out.println(bc);
				this.setBackground(Color.RED);
				System.out.println("빨간색");
				bc++;
			}else if(bc == 1) {
				System.out.println(bc);
				this.setBackground(Color.YELLOW);
				System.out.println("노란색");
				bc++;
			}else if(bc == 2) {
				System.out.println(bc);
				this.setBackground(Color.GREEN);
				System.out.println("초록색");
				bc = 0;
			}
			
			// click -> color change
			
			
		}else {
			System.out.println("EXIT click");
			System.exit(0);
		}
		
		
	}

}
