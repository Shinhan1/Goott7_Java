package d20200106_Graphic_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonControl extends Frame implements KeyListener{
	
	Button bt1;
	
	public ButtonControl() {
		super("ButtonControl");
		setSize(800, 600);
		setLayout(null);
		setVisible(true);
		
		bt1 = new Button("^>^");
		/*
		bt1.setSize(50, 50);
		bt1.setLocation(400, 300);
		*/
		
		
		bt1.setBounds(400, 300, 50, 50);		// setLocation, setSize를 한번에 쓰는 방법
		
		add(bt1);
		
		this.addKeyListener(this);
		
		this.addWindowListener(new WindowAdapter() {			// 윈도우 인터페이스를 다 가져오면 너무 많아서 필요한 것만 가져옴
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		});
		
		
	}// 생성자 end
	
	public static void main(String[] args) {
		new ButtonControl();
	}// main end
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("e : " + e);
		int key = e.getKeyCode();			// 아스키 코드로 들어옴
		System.out.println("key : " + key);
		
		// 현재 버튼 좌표
		int x = bt1.getX();
		int y = bt1.getY();
		// System.out.println("" + x + " , " + y);
		
		if(key == 37) {
			// System.out.println("left click");
			x -= 10;
		}else if(key == 38) {
			y -= 10;
		}else if(key == 39) {
			x += 10;
		}else if(key == 40) {
			y += 10;
		}
		bt1.setLocation(x, y);
		
		if(key == 32) {
			for(int i = 0; i < 7; i ++) {
				
				try {
					Thread.sleep(20);		// milli : 1/1000초
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
				bt1.setLocation(bt1.getX()+10, bt1.getY()-10);
			}
			for(int i = 0; i < 7; i ++) {
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				bt1.setLocation(bt1.getX()+10, bt1.getY()+10);
			}
		}	// if end
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	
	
}
