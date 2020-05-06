package d20200113_Thread;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ThreadTest_Q1 extends JFrame {
	static JLabel jl = new JLabel();
	
	public ThreadTest_Q1() {
		// TODO Auto-generated constructor stub
		super("Thread 활용");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 300, 300, 200);
		
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setFont(new Font("고딕", Font.BOLD, 50));
		
		add(jl);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ThreadTest_Q1();
		
		ThreadEx te = new ThreadEx();
		te.start();
	}
	
}


class ThreadEx extends Thread {
	int i = 0;
	@Override
	public void run() {
		while(true) {
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ThreadTest_Q1.jl.setText("" + i);
			System.out.println(i);
			i++;
		}
		
	}
	
}
