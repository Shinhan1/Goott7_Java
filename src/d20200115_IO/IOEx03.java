package d20200115_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// char stream ex) 문서

public class IOEx03 {
	public static void main(String[] args) throws IOException {
		
		IOEx03 io = new IOEx03();
		io.fc();
	}
	
	public void fc() throws IOException {
		File f = new File("C:\\Users\\goott7-15\\IOTest\\fighting.txt");
		File f2 = new File("C:\\Users\\goott7-15\\IOTest\\copyfighting.txt");
		
		// 파일객체 접근해서 char 단위로 입력 클래스
		FileReader fr = new FileReader(f);
		
		// 파일객체 접근해서 char 단위로 출력 클래스
		FileWriter fw = new FileWriter(f2);
		
		int v = 0;
		
		while((v=fr.read()) != -1) {
			System.out.println((char)v);
			fw.write(v);
		}
		// char stream은 내부적으로 buffer를 사용하고 있음
		fw.flush();
		fw.close();
	}

}
