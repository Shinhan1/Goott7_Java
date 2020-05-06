package goottJava;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ObstacleGame extends JFrame implements KeyListener{
	Random rd = new Random();
	
	
	int x1 = 150;
	int y1 = 350;
	int x[] = new int[10];
	int y[] = new int[10];
	
	
	public void pos() {
		for(int i = 0; i < 10; i++) {
			x[i] = (rd.nextInt(280)+1);
			y[i] = 35;
		}
		
	}
	
	JPanel jp;
	
	public ObstacleGame() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 300, 300, 400);
		setLayout(null);
		
		jp = new JPanel();
		jp.setSize(300, 400);
		jp.setBackground(Color.YELLOW);
		jp.setLayout(new FlowLayout());
		
		add(jp);
		
		addKeyListener(this);
		
		setVisible(true);
	}
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(x1, y1, 10, 10);
		
		
		for(int i = 0; i < 10; i++) {
			g.setColor(Color.RED);
			g.fillOval(x[i], y[i], 10, 10);
			
		}
		
		
	}

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		
		if(key == 37) {
			x1 -= 10;
		}else if (key == 38) {
			y1 -= 10;
		}else if (key == 39) {
			x1 += 10;
		}else if (key == 40) {
			y1 += 10;
		}
		
		repaint();
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
