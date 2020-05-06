package d20200113_Thread;

// Multi Thread 처리
// 1. Thread class 상속
//	1) Thread class 상속
//	2) run() override ==> 동시에 처리하고 싶은 logic 넣어두기
// 	3) 구현 클래스에서 start() 호출

public class ThreadEx01_run extends Thread{
	// String name;					별도로 선언하지 않아도 됨
	
	public ThreadEx01_run(String name) {
		// this.name = name;	// 별도로 선언하지 않아도 됨
		super(name);			// super 생성자 호출로 이름 지정이 가능함
	}		// 생성자 end
	
//	void sprint() {
//		for(int i = 0; i <= 100; i++) {
//			System.out.println(name + " : " + i);
//		}
//	}
	
	@Override
	public void run() {		// Thread만의 main 메소드를 오버라이딩 한 것.  run 메소드로 쓰레드 생성하는 것 
		for(int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);			// 현재 실행을 받은 것
			try {
				sleep(100);				// 실행속도 늦추기 위함
			}catch(InterruptedException e) {
				e.printStackTrace();				// printStackTrace 호출을 통해 예외가 발생한 정확한 위치를 확인
			}										// 뿐만 아니라 예외가 전달되어 온 과정도 확인 가능
		}
		
	}		// run end
	
	public static void main(String[] args) {
//		new ThreadEx01("1번마 천둥").sprint();
//		new ThreadEx01("2번마 번개").sprint();
		ThreadEx01_run st1 = new ThreadEx01_run("1번마 천둥");			// 쓰레드 인스턴스 생성
		ThreadEx01_run st2 = new ThreadEx01_run("2번마 번개");			// 쓰레드 인스턴스 생성
		st1.start();
		st2.start();
	}

}
