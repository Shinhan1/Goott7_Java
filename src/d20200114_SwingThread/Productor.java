package d20200114_SwingThread;

// 생산자

public class Productor implements Runnable {
	
	private Car car;		// 캡슐화  private로 정보 은닉
	
	public Productor(Car car) {		
		this.car = car;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 20; i ++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String name = car.getCar();		// Car클래스에 있는 getCar메소드의 리턴값을 name에다 넣음
			car.push(name);					// name을 Car클래스 push()메소드에 전달
			
		}
		
	}
	
}
