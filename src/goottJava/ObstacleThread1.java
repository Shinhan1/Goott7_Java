package goottJava;

import java.util.Random;

public class ObstacleThread1 implements Runnable {
	private ObstacleGame og;
	
	public ObstacleThread1(ObstacleGame og) {
		// TODO Auto-generated constructor stub
		this.og = og;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(og.y[2] < 400) {
				og.y[2] += 10;
			}else {
				og.y[2] = 30;
				og.x[2] = (rd.nextInt(280) + 1);
			}
			og.repaint();
			double dis1 = Math.sqrt((og.x[2]-og.x1)*(og.x[2]-og.x1) + (og.y[2]-og.y1)*(og.x[2]-og.y1));

			if(dis1 < 10) {
				System.exit(0);
			}
			
		}
		
	}

}
