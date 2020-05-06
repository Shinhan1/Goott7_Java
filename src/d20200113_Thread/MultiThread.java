package d20200113_Thread;

public class MultiThread {
	
	static long startTime = 0;	
	
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();			// ThreadDemo 클래스의 인스턴스 생성
		td.start();		// start() 호출
		
		startTime = System.currentTimeMillis();		// 현재 시간 millis 단위로 표현
		
		for(int i = 0; i < 100; i++) {
			System.out.println("*");
			
		}
		
		System.out.println("수행 시간 : " + (System.currentTimeMillis() - startTime));
		
		
	}

}	// class end

class ThreadDemo extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i ++) {
			System.out.println("#");
			
		}
		
		System.out.println("수행 시간 : " + (System.currentTimeMillis() - MultiThread.startTime));
		
		
	}
	
}
