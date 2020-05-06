package d20200114_SwingThread;

public class GameTestMain {
	
	public static void main(String[] args) {
		GameTest gt = new GameTest();
		GameThread gr = new GameThread(gt);
		
		Thread tr = new Thread(gr);
		
		tr.start();
		
	}

}
