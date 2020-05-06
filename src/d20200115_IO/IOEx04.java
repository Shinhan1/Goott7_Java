package d20200115_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// char stream - buffer

public class IOEx04 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\goott7-15\\IOTest\\fighting.txt");
		File f2 = new File("C:\\Users\\goott7-15\\IOTest\\copyfighting.txt");
		
		// 파일객체 접근해서 char 단위로 입력 클래스
		FileReader fr = new FileReader(f);
		
		// 파일객체 접근해서 char 단위로 출력 클래스
		FileWriter fw = new FileWriter(f2);
		
		// 버퍼 추가
		BufferedReader br = new BufferedReader(fr);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s = null;
		
		while((s=br.readLine()) != null) {
			bw.write(s);
			System.out.println(s);
		}
		
		bw.flush();
		bw.close();
		
	}
	

}
