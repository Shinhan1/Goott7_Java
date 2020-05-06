package d20200114_SwingThread;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

// progressbar

public class SwingThreadEx extends JFrame implements Runnable, ActionListener {

	JProgressBar jpb;
	JButton jbt;
	
	public SwingThreadEx() {
		// TODO Auto-generated constructor stub
		super("progressbar test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100, 300, 400, 100);
		setLayout(new FlowLayout());
		
		jpb = new JProgressBar();
		
		Border border = BorderFactory.createTitledBorder("압축을 푸는중 .....");		// Border? 테두리
		jpb.setBorder(border);
		jpb.setStringPainted(true);
//		jpb.setValue(jpb.getMaximum());				// 최대치인 100%부터 시작
		
	
		
		jbt = new JButton("압출풀기");
		jbt.addActionListener(this);
		
		add(jpb); add(jbt);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new SwingThreadEx();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		if(ob == jbt) {
			Thread te = new Thread(this);
			te.start();
			
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = jpb.getMinimum(); i <= jpb.getMaximum(); i++) {
			jpb.setValue(jpb.getMinimum()+i);			// 0부터 100까지
//			jpb.setValue(jpb.getMaximum()-i);			// 100부터 0까지
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
