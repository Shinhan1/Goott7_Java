package d20200106_Graphic_Button;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsEx04_Image extends Frame implements MouseListener {
	
	
	Image img;
	int x, y, x1, y1, x2, y2, w, h;
	
	public GraphicsEx04_Image() {
		// TODO Auto-generated constructor stub
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();
		
		// System.out.println(d.width + " : " + d.height);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		x = d.width/2 - 400;				// 모니터 가운데 맞추기 위한 x좌표
		y = d.height/2 - 300;				// 모니터 가운데 맞추기 위한 y좌표
		
		img = tool.getImage("src/images/dreamstime_2020.jpg");		// 이미지 가져옴 
		
		setBounds(x, y, 800, 600);
		
		x1 = -100;
		y1 = -100;
		x2 = -200;
		y2 = -200;
		w = 80;
		h = 80;
		
		addMouseListener(this);
		
		
		
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawImage(img, 0, 0, 800, 600, this);
		g.setColor(Color.YELLOW);
		g.drawOval(x1, y1, w, h);
		
	}
	
	public static void main(String[] args) {
		new GraphicsEx04_Image();
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		w = e.getX() - x1;
		h = e.getY() - y1;
		
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
