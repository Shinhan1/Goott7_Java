package d20200115_IO;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File f = new File("C:\\Hello.java");
		// \는 제어문자, \\(2개)가 문자 \로 인식
		// System.out.println("f : " + f);
		
		// 파일 존재 여부
		if(f.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {
			System.out.println("파일이 없습니다.");
			// f.createNewFile();		// 이런 이름의 파일을 만들수 있다
		}
		
		System.out.println("----------------------------");
		
		// 파일 객체 여부
		if(f.isFile()) {
			System.out.println("파일입니다");
		}else {
			System.out.println("디렉토리입니다.");
		}
		
		System.out.println("----------------------------");
		
		// 파일 경로 열기
		// String path = f.getPath();
		String path = f.getAbsolutePath();
		System.out.println("파일 경로 : " + path);
		
		System.out.println("---------------------");
		
		File f2 = new File("C:\\eclipse");
		
		// System.out.println("f2 : " + f2);
		
		if(f2.isDirectory()) {
			System.out.println("디렉토리입니다.");
			
			String[] list = f2.list();
			
			for(String str : list) {
				System.out.println(str);
			}
			
			
		}else {
			System.out.println("파일입니다.");
		}
		
		
		
		
	}
	

}
