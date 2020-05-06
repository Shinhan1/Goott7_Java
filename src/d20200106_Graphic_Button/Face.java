package d20200106_Graphic_Button;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Face extends Frame{
	public Face() {
		setBounds(100, 100, 800, 600);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
			
		});
	} // 생성자 end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);			// g : 일종의 뜻
		
		g.drawOval(200, 100, 400, 400);
		g.drawOval(260, 210, 80, 80);
		g.fillOval(270, 220, 60, 60);
		
		g.drawOval(450, 210, 80, 80);
		g.fillOval(460, 220, 60, 60);
		
		g.fillRect(260, 170, 80, 30);
		g.fillRect(450, 170, 80, 30);
		
		g.drawArc(330, 300, 150, 150, 0, -180);
		
		
	}
	
	public static void main(String[] args) {
		new Face();
	}
}
