package d20200103_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class D20200103_Test1 extends Frame implements ActionListener, WindowListener {
	
	Button bt1, bt2;
	
	public D20200103_Test1() {
		super("Action Test");
		setSize(400, 300);
		setLocation(600, 400);
		setVisible(true);
		
		this.addWindowListener(this);
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		bt1 = new Button("GuGuDan");
		
		// 컨테이너에 추가
		add(bt1, bl.SOUTH);
		
		
		
		
		bt1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new D20200103_Test1();
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
		
		int dan = (int)(Math.random()*9+1);
		System.out.println(dan + "단");
		for(int i = 2; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		
	} 
	

}
