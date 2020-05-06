package d20200121_Network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


// client
public class NetEx02_Client {
	public static void main(String[] args) {
		// Socket : 다른 소켓과 데이터를 송수신하는 객체
		
		try {
			Socket s = new Socket("192.168.0.14", 5000);		// 소켓을 통하여 양방향 통신 // 5000 : 포트번호
			
			// IO class
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			os.write(65);			// ASCII로 전달	-->    A로 전달
			
			//byte stream	--------- bridge ----------		char stream
			//					InputStreamReader
			//					OutputStreamWriter
			
			// -------------------------------------------------
			
			// 서버가 리턴한 메시지를 받기 위한 객체를 선언
			InputStreamReader isr1 = new InputStreamReader(is);		// bridge
			BufferedReader br = new BufferedReader(isr1);		// 서버가 리턴한 메시지는 br이 받음
			
			// 클라이언트에서 키보드로 작성한 데이터를 서버로 보낼 객체를 선언
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);		
			
			PrintWriter pw = new PrintWriter(bw);
			
			// 클라이언트가 키보드에 작성한 데이터를 읽어들이는 객체
			System.out.println("입력하세요 : ");
			InputStreamReader isr2 = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(isr2);
			
			// --------------------------------------------------------//
			String msg = null;
			String message = null;
			
			while((msg = keyboard.readLine()) != null) {
				System.out.println("내가 입력한 내용 : " + msg);
				
				pw.println("클라이언트 메시지 " + msg);
				pw.flush();
				

				System.out.println(message);
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
