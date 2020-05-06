package goottJava;

public class ObstacleMain {
	public static void main(String[] args) {
		ObstacleGame og = new ObstacleGame();
		ObstacleThread ot = new ObstacleThread(og);
		ObstacleThread1 ot1 = new ObstacleThread1(og);
		
		
		Thread tr = new Thread(ot);
		Thread tr1 = new Thread(ot1);
		
		tr.start();
//		tr1.start();
		
	}

}
