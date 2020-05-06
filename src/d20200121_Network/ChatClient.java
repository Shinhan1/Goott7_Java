package d20200121_Network;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ChatClient extends JFrame implements ActionListener, KeyListener, Runnable {
	
	// GUI 관련요소
	JButton jb1, jb2, jb3;
	JPanel jp1, jp2, jp3;
	JTextField jt1, jt2;
	JTextArea jta;
	JLabel jl;
	JScrollPane jsp;
	CardLayout layout;
	
	// 채팅관련요소
	Socket s;
	PrintWriter pw;
	BufferedReader br;
	
	// ip
	String ip;
	
	public ChatClient() {
		// TODO Auto-generated constructor stub
		setBounds(1100, 400, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		layout = new CardLayout();
		setLayout(layout);
		
		jb1 = new JButton("Login");
		jb2 = new JButton("Exit");
		jb3 = new JButton("Insert");
		
		jb1.setBounds(60, 200, 80, 50);
		jb2.setBounds(180, 200, 60, 50);
		
		jl = new JLabel("I D : ");
		jl.setBounds(40, 60, 60, 50);
		
		jt2 = new JTextField(25);
		
		jta = new JTextArea();
		
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		jt1 = new JTextField("192.168.0.14");
		jt1.setBounds(100, 60, 150, 40);
		
		jp1 = new JPanel();
		jp1.setLayout(null);
		jp1.add(jb1); jp1.add(jb2); jp1.add(jt1); jp1.add(jl); 
		
		Color c1 = new Color(29, 219, 22);
		jp1.setBackground(c1);
		
		add(jp1, "Login View");
		
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jp2.setLayout(new BorderLayout());
		jp2.add(jsp, "Center");
		
		add(jp2, "Chat");
		
		Color c2 = new Color(241, 232, 92);
		jp3.setBackground(c2);
		jp3.add(jt2);
		jp3.add(jb3);
		
		jp2.add(jp3, "South");
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		jt2.addKeyListener(this);
		
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ChatClient();
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		
		if(ob == jb1) {
			System.out.println("login");
			ip =jt1.getText();
			layout.show(getContentPane(), "Chat");
			
			// client 채팅 기능 시작
			Thread th = new Thread(this);
			th.start();
			
			
			
			
			
			
		}else if(ob == jb2) {
			int result = JOptionPane.showConfirmDialog(
					this, "종료합니까?", "real", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
		}
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_ENTER) {
			String msg = jt2.getText();
			jta.append(msg + "\n");
			
			pw.println(msg);
			pw.flush();
			
			jt2.setText("");
			
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 소켓 IO
		try {
			s = new Socket(ip, 5000);
			
			pw = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									s.getOutputStream())));
			
			br = new BufferedReader(
					new InputStreamReader(
							s.getInputStream()));
			
			String msg = null;
			while(true) {
				msg = br.readLine();
				
				jta.append(msg + "\n");
				JScrollBar bar = jsp.getVerticalScrollBar();
				bar.setValue(bar.getMaximum());
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
