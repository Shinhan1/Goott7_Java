package d20200114_SwingThread;

public class GameThread implements Runnable {
	private GameTest gt;
	
	public GameThread(GameTest gt) {
		// TODO Auto-generated constructor stub
		this.gt = gt;
		
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(gt.x1 >= gt.x2) {
				gt.x2 += 5;
			}else {
				gt.x2 -= 5;
			}
			
			if(gt.y1 >= gt.y2) {
				gt.y2 += 5;
			}else {
				gt.y2 -= 5;
			}
			gt.repaint();
			
			if(gt.x1 == gt.x2 && gt.y1 == gt.y2) {
				System.exit(0);
			}
			
		}
		
		
	}

}
