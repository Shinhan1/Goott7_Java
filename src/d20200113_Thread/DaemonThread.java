package d20200113_Thread;

/*
 * 	daemon thread ?
 * 	일반 쓰레드 (non-daemon thread)의 작업을 돕는
 * 	  보조적인 역할의 쓰레드 : daemon thread
 * 
 * 	일반 쓰레드가 모두 종료되면 자동적으로 종료된다
 * 	
 * 	ex) 가비지 컬렉터, 자동 저장(log 기록), 화면 자동 갱신 등에 사용된다
 * 	
 */

public class DaemonThread extends Thread {
	static boolean save;
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(save) {
				save();
			}
			
		}
	}
	public void save() {
		System.out.println("log 저장되었습니다.");
	}
	
	
	
	
	public static void main(String[] args) {
		// 데몬 쓰레드 동작
		DaemonThread dt = new DaemonThread();
		
		dt.setDaemon(true);
		dt.start();
		
		for(int i = 1; i < 20; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
			save = true;
		}
		System.out.println("프로그램 종료");
		
		
	}
	
	
	
}
