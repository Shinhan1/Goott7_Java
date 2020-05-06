package d20200103_AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTEx10_Action extends Frame implements ActionListener, WindowListener {
	
	Button bt1, bt2;
	
	public AWTEx10_Action() {
		super("Action Test");
		setSize(400, 300);
		setLocation(600, 400);
		setLayout(null);
		
		this.addWindowListener(this);
		
		bt1 = new Button("RED");
		bt2 = new Button("BLUE");
		
		// 컨테이너에 추가
		add(bt1); add(bt2);
		
		bt1.setSize(200, 100);
		bt1.setLocation(0, 200);
		
		bt2.setSize(200, 100);
		bt2.setLocation(200, 200);
		
		setVisible(true);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new AWTEx10_Action();
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
		String cmd = e.getActionCommand();
		//System.out.println(cmd);
		
		if(cmd.equals("RED")) {
			this.setBackground(Color.RED);
			
		}else if(cmd.equals("BLUE")) {
			this.setBackground(Color.BLUE);
		}
		
	} 
	

}
