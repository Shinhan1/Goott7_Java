package d20200114_SwingThread;

import java.util.Random;

// 소비자가 5초 안에 1번씩 구매 - 20번 구매
public class Customer implements Runnable {

	private Car car;			// 캡슐화
	Random rd = new Random(2);	// Random(Seed)  --> Seed
	
	public Customer(Car car) {	// 인자로 들어온 car를 Car형 car에다 전달
		this.car = car;
	}
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 20; i++) {
			
			try {
				Thread.sleep((rd.nextInt(5)*1000)+1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			car.pop();
			
		}
		
	}
	
	
	

}
