package d20200106_Graphic_Button;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsEx01 extends Frame {
	
	public GraphicsEx01 () {
		setBounds(50, 50, 800, 600);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		
	}// 생성자 end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		// Graphics g : 붓
		
		// 두 좌표 사이의 직선
		g.drawLine(100, 100, 200, 200);
		g.drawLine(200, 100, 100, 200);
		
		// 사각형
		g.drawRect(300, 300, 150, 150);
		
		// 곡선
		// 반원 : Arc(x, y, 너비, 높이, 시작각, 종료각);
		g.drawArc(150, 150, 100, 100, 0, 180);
		
		g.drawOval(200, 200, 100, 100);
		
		// 사각형 채우기
		g.setColor(Color.pink);
		g.fillRect(400, 400, 50, 50);
		
		// 글자
		// g.setColor(Color.black);
		g.drawString("오늘부터 비가 와요", 250, 150);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new GraphicsEx01();
	}
	
	
	

}
