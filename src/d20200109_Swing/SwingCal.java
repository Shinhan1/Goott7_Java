package d20200109_Swing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingCal extends JFrame implements ActionListener{
	
	JButton[] jb = new JButton[16];
	JLabel jl;
	JTextField jt;
	String str;
	StringBuilder sb = new StringBuilder();
	
	
	public SwingCal() {
		super("계산기");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(600, 350);
		setLayout(null);
		
		jb[0] = new JButton("7");
		jb[1] = new JButton("8");
		jb[2] = new JButton("9");
		jb[3] = new JButton("+");
		jb[4] = new JButton("4");
		jb[5] = new JButton("5");
		jb[6] = new JButton("6");
		jb[7] = new JButton("-");
		jb[8] = new JButton("1");
		jb[9] = new JButton("2");
		jb[10] = new JButton("3");
		jb[11] = new JButton("*");
		jb[12] = new JButton("C");
		jb[13] = new JButton("0");
		jb[14] = new JButton("=");
		jb[15] = new JButton("/");
		jt = new JTextField();
		
		setSize(300, 400);
		jb[0].setBounds(20, 100, 50, 50);
		jb[1].setBounds(80, 100, 50, 50);
		jb[2].setBounds(140, 100, 50, 50);
		jb[3].setBounds(200, 100, 50, 50);
		jb[4].setBounds(20, 160, 50, 50);
		jb[5].setBounds(80, 160, 50, 50);
		jb[6].setBounds(140, 160, 50, 50);
		jb[7].setBounds(200, 160, 50, 50);
		jb[8].setBounds(20, 220, 50, 50);
		jb[9].setBounds(80, 220, 50, 50);
		jb[10].setBounds(140, 220, 50, 50);
		jb[11].setBounds(200, 220, 50, 50);
		jb[12].setBounds(20, 280, 50, 50);
		jb[13].setBounds(80, 280, 50, 50);
		jb[14].setBounds(140, 280, 50, 50);
		jb[15].setBounds(200, 280, 50, 50);
		jt.setBounds(20, 30, 230, 50);
		
		
		for(int i = 0; i < jb.length; i++) {
			add(jb[i]);
			jb[i].addActionListener(this);
		}
		add(jt);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SwingCal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object ob = e.getSource();
		String sb1 = sb.toString();
		int sum = 0;
		int mul = 1;
		
		
		for(int i = 0; i < jb.length; i++) {
			if(ob == jb[i]) {
				sb.append(jb[i].getText());
				jt.setText("" + sb);
//				System.out.println(sb);
			}
		}
			if(ob == jb[12]) {
				sb.delete(0, sb1.length()+1);
				jt.setText("");
				
			}
			
			if(ob == jb[14]) {
				if(sb1.contains("+")) {
					int pos = sb1.indexOf('+');
					sum += Integer.parseInt(sb1.substring(0, pos));
					sum += Integer.parseInt(sb1.substring(pos+1, sb1.length()));
					jt.setText("" + sum);
//					System.out.println(sum);
					sb.append(sum);
			
				}
				
				if(sb1.contains("-")) {
					int pos1 = sb1.indexOf('-');
					sum += Integer.parseInt(sb1.substring(0, pos1));
					sum -= Integer.parseInt(sb1.substring(pos1+1, sb1.length()));
					jt.setText("" + sum);
//					System.out.println(sum);
					sb.append(sum);
				}
				
				if(sb1.contains("*")) {
					int pos2 = sb1.indexOf('*');
					mul *= Integer.parseInt(sb1.substring(0, pos2));
					mul *= Integer.parseInt(sb1.substring(pos2+1, sb1.length()));
					jt.setText("" + mul);
//					System.out.println(mul);
					sb.append(mul);
				}
				
				try {
					if(sb1.contains("/")) {
						int pos3 = sb1.indexOf('/');
						sum += Integer.parseInt(sb1.substring(0, pos3));
						sum /= Integer.parseInt(sb1.substring(pos3+1, sb1.length()));
						jt.setText("" + sum);
//						System.out.println(sum);
						sb.append(sum);
					}
				}catch(ArithmeticException e1) {
					System.out.println(e1.getMessage());
					System.out.println("0으로는 나눌 수 없어요");
				}
				
				sb.delete(0, sb1.length()+1);
				
			}	
			
			
			
		
		
	}

}
