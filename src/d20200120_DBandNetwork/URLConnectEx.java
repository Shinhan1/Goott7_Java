package d20200120_DBandNetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectEx {
	public static void main(String[] args) {
		
		try {
			URL daum = new URL("https://www.daum.net/");	// 인터넷 주소 객체
			URLConnection uc = daum.openConnection();		// 인터넷 연결 객체 생성
			//System.out.println(uc);
			InputStream is = uc.getInputStream();		// Byte 단위
			InputStreamReader ir = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(ir);
			
			String line = "";
			
			while(true) {
				line = br.readLine();
				
				if(line == null) {
					break;
				}
				System.out.println(line);
				
			}
			is.close();
			ir.close();
			br.close();
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("URL 데이터 오류 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결 오류");
		}
		
	}

}
