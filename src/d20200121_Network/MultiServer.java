package d20200121_Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		// 1. 서버 쪽 소켓 생성 - 포트 지정
		
		try {
			ServerSocket ss = new ServerSocket(5000);
			
			// 소켓 연결을 반복 : 다중 사용자 처리 위해
			while(true) {
				// 2. 클라이언트 접속 대기
				System.out.println("사용자 접속 대기 중 ............");
				// 3. 클라이언트 소켓 얻어오기
				Socket s = ss.accept();
				
				// 각 클라이언트가 각각 수행 (멀티쓰레드) => 클라이언트 동작(정보) 전달
				MServer ms = new MServer(s);
				ms.start();
				
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
