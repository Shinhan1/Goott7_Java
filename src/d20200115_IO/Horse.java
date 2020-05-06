package d20200115_IO;

import java.util.Random;

import javax.swing.JButton;

public class Horse extends Thread {
	JButton jbtn;
	
	public Horse(JButton jbtn) {
		this.jbtn = jbtn;
	}
	
	@Override
	public void run() {
		Random rnd = new Random();
		
		for(int i = 0; i < 120; i++) {
			int interval = rnd.nextInt(400);
			
			try {
				sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jbtn.setLocation(jbtn.getX()+10, jbtn.getY());
			
		}
		
		
	}

}
