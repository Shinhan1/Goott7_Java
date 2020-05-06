package d20200114_SwingThread;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTest_Q1_2 extends JFrame {
	
	JLabel jlb;
	
	
	public ThreadTest_Q1_2() {
		super ("thread test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100, 300, 500, 500);
		setLayout(new FlowLayout());
		
		
		jlb = new JLabel("Go");
		jlb.setFont(new Font("Gothic", Font.BOLD, 50));
		
		TimeThread tt = new TimeThread(jlb);
		Thread te = new Thread(tt);
		
		add(jlb);
		
		te.start();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ThreadTest_Q1_2();
	}
	
}	// ThreadLabel class end

class TimeThread implements Runnable {			// Runnable 인터페이스로 구현

	JLabel jlb;
	
	public TimeThread(JLabel jlb) {
		// TODO Auto-generated constructor stub
		this.jlb = jlb;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true) {
			jlb.setText("" + i);			// String.valueOf(i)
			i++;							// Integer.toString(i)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}




