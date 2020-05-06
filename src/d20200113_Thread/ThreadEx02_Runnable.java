package d20200113_Thread;

import java.util.Random;

/*
 * 	멀티 쓰레드 처리 - 2가지
 * 	 2. Runnable Interface 구현
 *    1) Runnable Interface 구현
 *    2) run() override => 동시에 수행할 로직을 넣어두기
 *    3) Thread 클래스의 매개변수로 사용
 *    4) 그 Thread 클래스를 통해 start()를 구현
 */

public class ThreadEx02_Runnable implements Runnable {
	String name;			// 이름을 지정하기 위한 변수 선언
	
	public ThreadEx02_Runnable(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;	// 이름 지정
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		for(int i = 0; i < 100; i++) {		// 1 ~ 100 반복문
			System.out.println(name + " : " + i);
			try {
				// Thread 재우기 : sleep(millis);     millis = 1/1000초		100을 넣으면 1/1000*100
				// Thread.sleep(100);				// Thread를 상속받지 않았기 때문에 Thread. 을 찍어야 함  
				Thread.sleep(rnd.nextInt(500));		// Random함수를 준 이유는 언젠 빠르고 언젠 느리게 하기 위해
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadEx02_Runnable st1 = new ThreadEx02_Runnable("1번마 천둥");		// Thread Runnable 인스턴스 생성
		ThreadEx02_Runnable st2 = new ThreadEx02_Runnable("2번마 번개");
		
		Thread th1 = new Thread(st1);		// Thread Runnable 인스턴스를 Thread 인스턴스로 생성
		Thread th2 = new Thread(st2);		// 그래야 start메소드 호출 가능
		
		th1.start();		// start() 호출
		// th1.yield();		// 현재 쓰레드 실행을 중단하고 다른 쓰레드가 실행될 수 있도록 양보
		
		th2.start();		// start() 호출
		
		try {
			th1.join();					// 다른 쓰레드가 die할 때 까지 기다리기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
















