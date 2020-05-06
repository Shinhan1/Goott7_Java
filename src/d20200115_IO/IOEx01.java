package d20200115_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Byte Stream ex) 동영상, 이미지...

public class IOEx01 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\goott7-15\\IOTest\\good.txt");
		File f2 = new File("C:\\Users\\goott7-15\\IOTest\\good3.txt");
		
		// 파일 객체에 접근해서 내용을 읽어오기
		FileInputStream fis = new FileInputStream(f);
		
		// 파일 객체에 접근해서 내용을 쓰기
		FileOutputStream fos = new FileOutputStream(f2);
		
//		System.out.println("fis : " + fis);
//		
//		for(int i = 0; i < 10; i++) {
//			int value = fis.read();
//			System.out.print((char)value);
//			
//			
//		}
		
		int v = 0;
		
		// EOF (End Of File) : -1
		// 파일의 끝에는 -1이 들어있다
		while((v=fis.read()) != -1) {		// v에 fis.read()를  넣고 v가 -1(EOF)이 아닐때 반복
			System.out.print((char)v);
			fos.write(v);
			
		}
		
	}

}
