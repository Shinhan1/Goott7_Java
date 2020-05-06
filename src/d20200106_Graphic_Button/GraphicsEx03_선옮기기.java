package d20200106_Graphic_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsEx03_선옮기기 extends Frame implements ActionListener {
	
	int x1, y1, x2, y2;
	Button bt1;
	
	public GraphicsEx03_선옮기기() {
		// TODO Auto-generated constructor stub
		setBounds(50, 50, 800, 600);
		
		
		x1 = 200;
		y1 = 200;
		x2 = 300;
		y2 = 300;
		
		setLayout(null);
		setVisible(true);
		
		bt1 = new Button("click");
		bt1.setBounds(100, 50, 100, 50);
		
		add(bt1);
		bt1.addActionListener(this);
		
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
		
		g.drawLine(x1, y1, x2, y2);
		
		// paint() : 시스템 내부적으로 호출
		// 		   : 윈도우 창이 바뀔 때 움직임이 생김
		
	}
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		super.update(g);
		
		// 이미지 출력 작업(화면)을 갱신하고 싶을 때 사용
		// update() --------  paint()
		// 내용 갱신	-------->  그리기
		
		paint(g);
		
	}
	
	public static void main(String[] args) {
		new GraphicsEx03_선옮기기();
	}	// main end
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// 개발자는 paint()와 update()를 repaint() 통해 사용 가능
		x1 += 20;
		x2 += 20;
		repaint();
		
	}
	
	
	

}	// class end
