package d20200113_Thread;

// (최대한) +, - 기호가 반복해서 출력되도록 해보세요
// (100번)

public class ThreadTest {
	public static void main(String[] args) {
		ThreadAdd ta = new ThreadAdd();
		ThreadSub ts = new ThreadSub();
		
		ta.setPriority(10);				// ta.setPriority(Thread.MAX_PRIORITY)	최대한의 우선순위를 줌
		ts.setPriority(1);				// ta.setPriority(Thread.MIN_PRIORITY)	최소한의 우선순위를 줌
		
		ta.start();
		ts.start();
		
	}
	
}

class ThreadAdd extends Thread { 
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("+ : " + i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
	}
}

class ThreadSub extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("- : " + i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
