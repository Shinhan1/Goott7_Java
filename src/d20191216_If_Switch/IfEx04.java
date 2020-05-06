package d20191216_If_Switch;

import java.io.IOException;			// System.in.read()를 받는 클래스 선언

// 사용자로부터 문자 한자를 입력받은 후
// 소문자는 대문자로, 대문자는 소문자로 변경해보세요

// 힌트 : a = 97, z = 122
// 힌트 : A = 65, Z = 90

public class IfEx04 {
	
	public static void main(String[] args) throws IOException {
		

		System.out.println("문자 입력 : ");
		int value = System.in.read();			// 문자 한개를 받을 수 있음
		
		System.out.println("처음 입력한 값 : "+ value);
		
		int cha;
		
		if(value >= 97 && value <= 122) {		// a부터 z 사이이면
			cha = value - 32;					// cha에 value - 32를 대입
			System.out.println((char)cha);		// cha 변수가 문자로 나와야 하므로 char형 씌움
		}else if(value >= 65 && value <= 90) {	// A부터 Z 사이이면
			cha = value + 32;					// cha에 value + 32를 대입
			System.out.println((char)cha);		// cha 변수가 문자로 나와야 하므로 char형 씌움
		}else
			System.out.println("잘못 입력하셨습니다.");
		
		/*

		System.out.println("문자 입력 : ");
		int value = System.in.read();			// 문자 한개를 받을 수 있음
		
		System.out.println("처음 입력한 값 : "+ value);
		
		System.in.read();						
		System.in.read();						// 입력 받을 시에 엔터키 삭제
		
		System.out.println("문자를 입력하세요 :");
		
		int val = System.in.read();
		int cha;
		
		
		if(val >= 97 && val <= 122) {
			cha = val - 32;
			System.out.println((char)cha);
		}else if(val >= 65 && val <= 90) {
			cha = val + 32;
			System.out.println((char)cha);
		}
		
		
		*/	
		
		
	}

}
