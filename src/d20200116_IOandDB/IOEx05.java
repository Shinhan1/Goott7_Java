package d20200116_IOandDB;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 키보드 입력을 저장
// 콘솔에 입력을 하면 콘솔에 출력을 하며 지정한 경로에 파일이 생김

public class IOEx05 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\goott7-15\\IOTest\\keyboard.txt");
		
		// output
		FileOutputStream fos = new FileOutputStream(f);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// input : 사용자 입력을 읽어들이기 - 콘솔창을 통해서
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.println("입력하세요 :	(종료키 : ctrl + z)");
		
		int v = 0;
		while((v = isr.read()) != -1) {
			bos.write(v);
			System.out.println((char)v);
		}
		
		bos.flush();
		bos.close();
		
		System.out.println("종료되었습니다.");
		
		
		
	}

}
