package d20200106_Graphic_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MovingButton extends Frame implements MouseMotionListener {
	
	Button bt1;
	Label lb;
	
	public MovingButton() {
		super("MovingButton");
		setBounds(30, 30, 1200, 800);
		setLayout(null);
		setVisible(true);
		
		bt1 = new Button("^>^");
		lb = new Label("Catch me if you can..");
		
		bt1.setBounds(80, 60, 80, 60);
		lb.setBounds(100, 200, 200, 40);
		
		add(bt1); add(lb);
		
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new MovingButton();
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		// 마우스 현재 좌표
		
		int x = e.getX();
		int y = e.getY();
		
		// 버튼의 현재 좌표
		int bx = bt1.getX();
		int by = bt1.getY();
		
		// 버튼 기준점 --> 중앙 좌표
		bx += 40;
		by += 30;

		// System.out.println(x + " : " + y);
		
		// 마우스와 현재 버튼 사이 거리 : a² + b² = c²
		
		double dis = Math.sqrt((bx-x)*(bx-x) + (by-y)*(by-y));	
		// sqrt() : double type값을 return
		
		/*
		if(dis < 90) {
			System.out.println("거의 가까이 옴");
		}else {
			System.out.println("아직 멀다");
		}
		*/
		
		if(dis < 90) {
			bt1.setLocation((int)(Math.random()*1000), (int)(Math.random()*700));
		}
		System.out.println("두 좌표의 거리 : " + dis);
		
		
	}

}
