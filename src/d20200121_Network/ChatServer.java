package d20200121_Network;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatServer extends JFrame implements ActionListener{
	// GUI 관련 요소
	JButton jb1;
	JTextArea jta1;
	JScrollPane jsp;
	Font f;

	// 채팅 관련 요소
	ArrayList<MTServer> list = new ArrayList<MTServer>();
	
	ServerSocket ss;
	PrintWriter pw;
	BufferedReader br;
	

	public ChatServer() {
		// TODO Auto-generated constructor stub
		super("Chat Servber ver1.01");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(30, 30, 800, 600);

		jb1 = new JButton("Exit");
		f = new Font("고딕", ABORT, 30);
		jta1 = new JTextArea();
		jta1.setFont(f);
		add(jb1, "South");
		add(jta1, "Center");

		jsp = new JScrollPane(jta1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(jsp, "Center");

		jb1.addActionListener(this);
		

		setVisible(true);
		startChat();
		
	}	// 생성자 end
	
	// 채팅 관련 메소드
	private void startChat() {
		// 서버 소켓 생성하고 port 열기
		
		try {
			ss = new ServerSocket(5000);
			// 다중 사용자 생성 - 소켓 정보 얻어오기
			while(true) {
				Socket client = ss.accept();
				
				// 쓰레드 처리
				MTServer ms = new MTServer(client);
				list.add(ms);
				ms.start();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		new ChatServer();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		int result = JOptionPane.showConfirmDialog(this, "종료합니까?", "real", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			System.out.println("종료합니다.");
			System.exit(0);
		}

	}	// actionPerformed end
	
	// inner class
	class MTServer extends Thread{
		Socket client;
		PrintWriter pw;
		BufferedReader br;
		String ip;
		
		MTServer(Socket client) {
			this.client = client;
			
			try {
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
				InetAddress inet = client.getInetAddress();
				ip = inet.getHostAddress();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} // MTServer 생성자 end
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			// 잃고 쓰는 기능
			String msg = null;
			while(true) {
				try {
					msg = br.readLine();
					
					jta1.append("[" + ip + "] : " + msg + "\n");
					JScrollBar bar = jsp.getVerticalScrollBar();
					bar.setValue(bar.getMaximum());
					
					
					// 각 사용자에게 모두 전달
					broadcast("[" + ip + "]" + msg);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					list.remove(this);
					e.printStackTrace();
				}
				
			}// while() end
			
	
			
		}// run() end
		
		void broadcast(String msg) {
			// Arraylist에 있는 모든 client 객체들을 꺼내서 사용
			for(MTServer ms : list) {
				ms.pw.println(msg);
				ms.pw.flush();
			}
			
			
		}
		
	}

	

}
