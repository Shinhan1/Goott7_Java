package d20200103_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Q2 extends Frame implements ActionListener, WindowListener {
	
	Button bt1, bt2;
	
	public Q2() {
		super("Action Test");
		setSize(400, 300);
		setLocation(600, 400);
		setVisible(true);
		
		this.addWindowListener(this);
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		bt1 = new Button("Lotto");
		
		// 컨테이너에 추가
		add(bt1, bl.SOUTH);
		
		
		
		
		bt1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Q2();
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
		
		int []ran = new int[6];
		for(int i = 0; i < 6; i++) {
			ran[i] = (int)((Math.random())*45+1);
			for(int j = 0; j <= i; j++) {
				if(ran[i] == ran[j])
					ran[i] = (int)((Math.random())*45+1);
			}
			System.out.println(ran[i]);
		}
		System.out.println();
	} 
	

}
