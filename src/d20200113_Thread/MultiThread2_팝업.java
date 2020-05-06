package d20200113_Thread;

import javax.swing.JOptionPane;

// 현 클래스를 실행하면 팝업창을 띄우면서 동시에 반복문을 구동해보세요

public class MultiThread2_팝업 {
	public static void main(String[] args) {
		MulThread mt = new MulThread();		// 쓰레드 생성
		mt.start();
		
		String input = JOptionPane.showInputDialog("내용을 입력하세요");			// 팝업창 실행 코드 
		
		System.out.println("입력값 : " + input);		// 출력
		
		
	}
	
}
class MulThread extends Thread{
	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
