package d20200113_Thread;

import javax.swing.JOptionPane;

// 10초 동안 입력하지 않으면 종료되는 프로그램

public class MultiThread3_10초후종료 {
	static boolean chk = false;

	public static void main(String[] args) {
		ThreadDemo02 td2 = new ThreadDemo02();
		ThreadDemo03 td3 = new ThreadDemo03();
		
		td3.start();
		td2.start();
		
	}
}

// 10초 수행 후 프로그램 종료코드
class ThreadDemo02 extends Thread {
	@Override
	public void run() {
		MultiThread3_10초후종료 mt3 = new MultiThread3_10초후종료();
		for(int i = 10; i >= 0; i--) {
			if(mt3.chk) {
				System.out.println(mt3.chk);
				return;
			}
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	// for end
		System.out.println("10초가 지났습니다. 프로그램을 종료합니다.");
		System.exit(0);
		
		
	}
}

// 사용자로부터 입력값을 부여받는 코드
class ThreadDemo03 extends Thread {
	@Override
	public void run() {
		
		System.out.println("10초 안에 입력하세요!!!");
		String input = JOptionPane.showInputDialog("인증번호를 입력하세요.");
		
		MultiThread3_10초후종료 mt3 = new MultiThread3_10초후종료();
		
		if(input != null) 
			mt3.chk = true;
		else
			mt3.chk = false;
		
		System.out.println("입력 값 : " + input);
		
	}
}


