package d20200106_Graphic_Button;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class GraphicsEx02_Random extends Frame {
	
	public GraphicsEx02_Random() {
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
	}	// 생성자 end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		// 실습 : 랜덤하게 원 200개 그려보세요.
		// (위치, 크기, 색상 --> 모두 랜덤)
		
		// 색 : Color (255, 255, 255)
		
		// Color c = new Color(255, 255, 255);
		
		Random rnd = new Random();
		
		for(int i = 0; i < 200; i++) {
			
			int x = rnd.nextInt(800);
			int y = rnd.nextInt(600);
			int w = rnd.nextInt(800);
			int h = rnd.nextInt(600);
			
			
			int red = rnd.nextInt(255);
			int green = rnd.nextInt(255);
			int blue = rnd.nextInt(255);
			
			Color c = new Color(red, green, blue);
			g.setColor(c);
			g.drawOval(x, y, w, h);
		}
		
		
		
		
		
		
	}	// paint end
	
	public static void main(String[] args) {
		new GraphicsEx02_Random();
	}	// main end

}
