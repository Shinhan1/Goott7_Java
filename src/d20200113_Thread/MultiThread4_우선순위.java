package d20200113_Thread;

/*
 * 	쓰레드에는 우선순위가 있음
 * 	우선순위에 따라 쓰레드 실행시간이 달라짐
 * 
 * 	개발자는 작업의 중요도나 순서 배치를 쓰레드의 우선 순위를 다르게 하여
 * 	특정 쓰레드가 더 많은 작업시간을 갖도록 할 수 있음
 * 
 * 	쓰레드 우선 순위 범위 : 1 ~ 10
 * 	 - 숫자가 높을 수록 우선순위가 높음
 */

public class MultiThread4_우선순위 {
	public static void main(String[] args) {
		ThreadDemo04 td4 = new ThreadDemo04();
		ThreadDemo05 td5 = new ThreadDemo05();
		
		td5.setPriority(10);		// 우선순위 부여 방법
		
		System.out.println("td4 우선순위 : " + td4.getPriority());		// 우선순위를 주지 않으면 기본값으로 5가 들어간다
		System.out.println("td5 우선순위 : " + td5.getPriority());		
		
		
		td4.start();
		td5.start();
		
	}

}	// class end

class ThreadDemo04 extends Thread {
	
	@Override
	public void run() {
		for(int i =0; i < 100; i++) {
			System.out.println("*");
			
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


class ThreadDemo05 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("#");
			
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}









