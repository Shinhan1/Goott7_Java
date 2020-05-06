package d20200113_Thread;

import javax.swing.JOptionPane;

public class SingleThread2 {
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("내용을 입력하세요");
		
		System.out.println("입력값 : " + input);
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
