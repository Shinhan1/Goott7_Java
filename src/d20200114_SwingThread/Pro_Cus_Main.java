package d20200114_SwingThread;

public class Pro_Cus_Main {
	public static void main(String[] args) {
		Car car = new Car();
		
		// 제조회사
		Productor pd = new Productor(car);
		
		// 고객주문
		Customer ct = new Customer(car);
		
		// 멀티쓰레드 동작
		Thread th1 = new Thread(pd);
		Thread th2 = new Thread(ct);
		
		th1.start();
		th2.start();
		
	}

}
