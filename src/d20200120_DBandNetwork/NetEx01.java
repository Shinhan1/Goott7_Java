package d20200120_DBandNetwork;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

// java.net package
public class NetEx01 {
	public static void main(String[] args) throws UnknownHostException {
		
		// ip
		InetAddress inet = InetAddress.getLocalHost();
		
		System.out.println(inet);
		System.out.println(inet.getHostAddress());
		System.out.println(inet.getHostName());
		
		System.out.println("------------------------------------");
		
		// 외부 ip 정보 얻어오기
		InetAddress inet2 = InetAddress.getByName("www.daum.net");
		
		System.out.println(inet2.getHostName());
		System.out.println(inet2.getHostAddress());
		
		System.out.println("-------------------------------------");
		
		// 인터넷 주소를 통해 정보 얻어보기
		try {
			URL daum = new URL("https://www.daum.net/");
			System.out.println(daum.getHost());
			System.out.println(daum.getProtocol());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
