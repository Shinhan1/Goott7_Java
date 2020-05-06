package d20200110_Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RPSgame extends JFrame implements ActionListener{
	JLabel jl1, jl2, jl3;
	ImageIcon img1, img2, img3;
	JButton jb1, jb2, jb3;
	JLabel[] msg;
	JPanel jp = new JPanel();
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	
	public RPSgame() {
		super("Rock Paper Scissors Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(400, 300, 500, 700);
		setLayout(null);
		
		
		
		jp.setBounds(160, 10, 150, 50);		//패널 위치
		jp1.setBounds(100, 100, 300, 200);
		jp2.setBounds(-10, 400, 500, 500);
		jp.setLayout(new FlowLayout());
		jp1.setLayout(new FlowLayout());
		jp2.setLayout(new FlowLayout());
		
		msg = new JLabel[3];
		
		add(jp);
		add(jp1);
		add(jp2);
		
		msg[0] = new JLabel("COMPUTER");
		msg[1] = new JLabel("VS");
		msg[2] = new JLabel("USER");
		
		for(int i = 0; i < msg.length; i++) {
			jp.add(msg[i]);
		}
		
		jl1 = new JLabel("가위 바위 보!");
		jl2 = new JLabel();
		jl3 = new JLabel();
		
		jp1.add(jl1);
	
		
		img1 = new ImageIcon("src/images/bawi.jpg");
		img2 = new ImageIcon("src/images/kawi.jpg");
		img3 = new ImageIcon("src/images/bo.jpg");
		
		
		jb1 = new JButton(img1);
		jb2 = new JButton(img2);
		jb3 = new JButton(img3);
		
		
		jp1.add(jl2);
		jp1.add(jl3);
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new RPSgame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		Random rd = new Random();
		int rnd;
		
		if(ob == jb1) {
			rnd = rd.nextInt(3);
			jl2.setIcon(img1);
			if(rnd == 0) {
				jl1.setIcon(img1);
				jl3.setText("무승부 !");
			}else if(rnd == 1) {
				jl1.setIcon(img2);
				jl3.setText("승리 !");
			}else if(rnd == 2) {
				jl1.setIcon(img3);
				jl3.setText("패배 !");
			}
			
		}else if(ob == jb2) {
			rnd = rd.nextInt(3);
			jl2.setIcon(img2);
			if(rnd == 0) {
				jl1.setIcon(img1);
				jl3.setText("패배 !");
			}else if(rnd == 1) {
				jl1.setIcon(img2);
				jl3.setText("무승부 !");
			}else if(rnd == 2) {
				jl1.setIcon(img3);
				jl3.setText("승리 !");
			}
		}else if(ob ==jb3) {
			rnd = rd.nextInt(3);
			jl2.setIcon(img3);
			if(rnd == 0) {
				jl1.setIcon(img1);
				jl3.setText("승리 !");
			}else if(rnd == 1) {
				jl1.setIcon(img2);
				jl3.setText("패배 !");
			}else if(rnd == 2) {
				jl1.setIcon(img3);
				jl3.setText("무승부 !");
			}
		}
		
	}
	
	

}
