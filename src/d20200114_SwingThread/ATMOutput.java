package d20200114_SwingThread;

public class ATMOutput implements Runnable {

	private Account ant;
	
	public ATMOutput(Account ant) {
		// TODO Auto-generated constructor stub
		this.ant = ant;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1001);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int value = ant.getMoney();
			ant.output(value);
		}
		
	}
	

}
