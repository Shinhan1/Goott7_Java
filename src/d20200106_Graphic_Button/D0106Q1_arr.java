package d20200106_Graphic_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D0106Q1_arr extends Frame implements KeyListener{
	
	Button []bt = new Button[6];
	
	public D0106Q1_arr() {
		// TODO Auto-generated constructor stub
		super("HELLO");
		setSize(800, 600);
		setLayout(null);
		setVisible(true);
		
		for(int i = 0; i < 6; i++) {
			bt[i] = new Button();
		}
		
		bt[0].setBounds(300, 200, 50, 50);
		bt[1].setBounds(295, 260, 60, 100);
		bt[2].setBounds(200, 240, 80, 40);
		bt[3].setBounds(370, 240, 80, 40);
		bt[4].setBounds(280, 375, 40, 80);
		bt[5].setBounds(330, 375, 40, 80);
		
		for(int i = 0; i < 6; i++) {
			add(bt[i]);
		}
		
		this.addKeyListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		
	}	// 생성자 end
	
	public static void main(String[] args) {
		new D0106Q1_arr();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int key = e.getKeyCode();
		
		int x[] = new int[6];
		int y[] = new int[6];
		
		for(int i = 0; i < 6; i++) {
			x[i] = bt[i].getX();
			y[i] = bt[i].getY();
		}
		
		
		if(key == 37) {
			for(int i = 0; i < 6; i++) {
				x[i] -= 10;
			}
			
		}else if(key == 38) {
			for(int i = 0; i < 6; i++) {
				y[i] -= 10;
			}		
		}else if(key == 39) {
			for(int i = 0; i < 6; i++) {
				x[i] += 10;
			}
		}else if(key == 40) {
			for(int i = 0; i < 6; i++) {
				y[i] += 10;
			}
		}
		
		for(int i = 0; i < 6; i++) {
			bt[i].setLocation(x[i], y[i]);
		}
		
		if(key == 32) {
			for(int i = 0; i < 7; i ++) {
				
				try {
					Thread.sleep(20);		// milli : 1/1000초
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
				for(int j = 0; j < 6; j++) {
					bt[j].setLocation(bt[j].getX()+10, bt[j].getY()-10);
				}
			}
			for(int i = 0; i < 7; i ++) {
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for(int j = 0; j < 6; j++) {
					bt[j].setLocation(bt[j].getX()+10, bt[j].getY()+10);
				}
			}
		}
		if(key == 90) {
			for(int i = 0; i < 11; i++) {
				try {
					Thread.sleep(20);		// milli : 1/1000초
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				bt[3].setLocation(bt[3].getX()+10,bt[3].getY());
			}
			for(int i = 0; i < 11; i++) {
				try {
					Thread.sleep(20);		// milli : 1/1000초
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				bt[3].setLocation(bt[3].getX()-10,bt[3].getY());	
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}