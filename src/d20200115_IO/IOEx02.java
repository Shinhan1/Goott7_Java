package d20200115_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx02 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\goott7-15\\IOTest\\good.txt");
		File f2 = new File("C:\\Users\\goott7-15\\IOTest\\CopyHello.java");
		
		// 파일에 접근해서 읽어오는 클래스
		FileInputStream fis = new FileInputStream(f);
		
		// 파일에 접근해서 읽어오는 클래스
		FileOutputStream fos = new FileOutputStream(f2);
		
		// 접근 속도 향상 시킬 수 있는 입력클래스 - buffer 이용
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// 접근 속도 향상 시킬 수 있는 출력클래스 - buffer 이용
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int v = 0;
		
		String str = "";
		
		while((v=bis.read()) != -1) {
			System.out.print((char)v);
		}
		
		bos.flush();	// buffer에 내용이 가득차지 않아도 내려쓰게 하는 메소드
		
	}

}
