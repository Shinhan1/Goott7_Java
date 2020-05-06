package d20200116_IOandDB;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// IOEx05에서 키보드 입력을 받았더니 한글이 깨져요... 바로 잡아 보세요

public class IOEx06 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\goott7-15\\IOTest\\keyboard2.txt");
		
		// 알파벳, 숫자	----> 1byte
		// 한글		----> 2byte ====> char
		
		
		// output
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// input : 사용자 입력을 읽어들이기 - 콘솔창을 통해서
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.println("입력하세요 :	(종료키 : ctrl + z)");
		
		int v = 0;
		while((v = isr.read()) != -1) {
			bw.write(v);
			System.out.println((char)v);
		}
		
		bw.flush();
		bw.close();
		
		System.out.println("종료되었습니다.");
		
	}

}
