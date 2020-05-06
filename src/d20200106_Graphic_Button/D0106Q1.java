package d20200106_Graphic_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D0106Q1 extends Frame implements KeyListener{
	
	Button bt1, bt2, bt3, bt4, bt5, bt6;
	
	public D0106Q1() {
		// TODO Auto-generated constructor stub
		super("HELLO");
		setSize(800, 600);
		setLayout(null);
		setVisible(true);
		
		bt1 = new Button("^ㅁ^");	// 머리
		bt2 = new Button();			// 몸통
		bt3 = new Button();			// 왼팔
		bt4 = new Button();			// 오른팔
		bt5 = new Button();			// 왼다리
		bt6 = new Button();			// 오른다리
		
		bt1.setBounds(300, 200, 50, 50);
		bt2.setBounds(295, 260, 60, 100);
		bt3.setBounds(200, 240, 80, 40);
		bt4.setBounds(370, 240, 80, 40);
		bt5.setBounds(280, 375, 40, 80);
		bt6.setBounds(330, 375, 40, 80);
		
		add(bt1); add(bt2); add(bt3); add(bt4);
		add(bt5); add(bt6);
		
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
		new D0106Q1();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int key = e.getKeyCode();
		
		int x1 = bt1.getX();
		int y1 = bt1.getY();
		
		int x2 = bt2.getX();
		int y2 = bt2.getY();
		
		int x3 = bt3.getX();
		int y3 = bt3.getY();
		
		int x4 = bt4.getX();
		int y4 = bt4.getY();
		
		int x5 = bt5.getX();
		int y5 = bt5.getY();
		
		int x6 = bt6.getX();
		int y6 = bt6.getY();
		
		if(key == 37) {
			x1 -= 10;
			x2 -= 10;
			x3 -= 10;
			x4 -= 10;
			x5 -= 10;
			x6 -= 10;
		}else if(key == 38) {
			y1 -= 10;
			y2 -= 10;
			y3 -= 10;
			y4 -= 10;
			y5 -= 10;
			y6 -= 10;			
		}else if(key == 39) {
			x1 += 10;
			x2 += 10;
			x3 += 10;
			x4 += 10;
			x5 += 10;
			x6 += 10;
		}else if(key == 40) {
			y1 += 10;
			y2 += 10;
			y3 += 10;
			y4 += 10;
			y5 += 10;
			y6 += 10;
		}
		bt1.setLocation(x1,y1);
		bt2.setLocation(x2,y2);
		bt3.setLocation(x3,y3);
		bt4.setLocation(x4,y4);
		bt5.setLocation(x5,y5);
		bt6.setLocation(x6,y6);
		
		if(key == 32) {
			for(int i = 0; i < 7; i ++) {
				
				try {
					Thread.sleep(20);		// milli : 1/1000초
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
				bt1.setLocation(bt1.getX()+10, bt1.getY()-10);
				bt2.setLocation(bt2.getX()+10, bt2.getY()-10);
				bt3.setLocation(bt3.getX()+10, bt3.getY()-10);
				bt4.setLocation(bt4.getX()+10, bt4.getY()-10);
				bt5.setLocation(bt5.getX()+10, bt5.getY()-10);
				bt6.setLocation(bt6.getX()+10, bt6.getY()-10);
			}
			for(int i = 0; i < 7; i ++) {
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				bt1.setLocation(bt1.getX()+10, bt1.getY()+10);
				bt2.setLocation(bt2.getX()+10, bt2.getY()+10);
				bt3.setLocation(bt3.getX()+10, bt3.getY()+10);
				bt4.setLocation(bt4.getX()+10, bt4.getY()+10);
				bt5.setLocation(bt5.getX()+10, bt5.getY()+10);
				bt6.setLocation(bt6.getX()+10, bt6.getY()+10);
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
				bt4.setLocation(bt4.getX()+10,bt4.getY());
			}
			for(int i = 0; i < 11; i++) {
				try {
					Thread.sleep(20);		// milli : 1/1000초
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				bt4.setLocation(bt4.getX()-10,bt4.getY());	
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}