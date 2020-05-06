package goottJava;

import java.util.Random;

public class ObstacleThread implements Runnable {
	private ObstacleGame og;
	
	public ObstacleThread(ObstacleGame og) {
		// TODO Auto-generated constructor stub
		this.og = og;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		double dis;
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i = 0; i < 10; i++) {
				
				if(og.y[i] < 400) {
					og.y[i] += 10;
				}else {
					og.y[i] = 35;
					og.x[i] = (rd.nextInt(280) + 1);
				}
				og.repaint();
//				dis = Math.sqrt((og.x[i]-og.x1)*(og.x[i]-og.x1) + (og.y[i]-og.y1)*(og.x[i]-og.y1));
//				if(dis < 10) {
//					System.exit(0);
//				}
				
				if(og.x[i] == og.x1 && og.y[i] == og.y1) {
					System.exit(0);
				}
				
			}
				
			
		}
		
	}

}
