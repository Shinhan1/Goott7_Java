package d20200114_SwingThread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JFrame;

public class GameTest extends JFrame implements KeyListener {
	
	int x1 = 200;
	int y1 = 200;		// 내가 움직이는 애
	int x2 = 100;
	int y2 = 100;		// 따라오는 애
	
	public GameTest() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);		// X눌르면 꺼짐
		setBounds(1100, 300, 500, 500);			// 창 크기
		setLayout(null);		// 레이아웃 설정
		
		this.addKeyListener(this);		// 키보드를 입력받으면 실행
				
		setVisible(true);		
	}
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.BLACK);		// 검은색 
		g.fillOval(x1, y1, 10, 10);		// 원 좌표, 크기 설정
		
		g.setColor(Color.YELLOW);
		g.fillOval(x2, y2, 10, 10);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
//		System.out.println("key : " + key);
		
		
		if(key == 37) {
			x1 -= 10;
		}else if (key == 38) {
			y1 -= 10;
		}else if (key == 39) {
			x1 += 10;
		}else if (key == 40) {
			y1 += 10;
		}
//		else if (key == 37 && key == 38) {
//			x1 -= 10;
//			y1 -= 10;
//		}else if (key == 38 && key == 39) {
//			x1 += 10;
//			y1 -= 10;
//		}else if (key == 39 && key == 40) {
//			x1 += 10;
//			y1 += 10;
//		}else if (key == 40 && key == 37) {
//			x1 -= 10;
//			y1 += 10;
//		}
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
