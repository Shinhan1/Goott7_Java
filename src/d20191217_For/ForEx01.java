package d20191217_For;

import java.util.Scanner;

public class ForEx01 {
	public static void main(String[] args) {
		// 사용자로부터 숫자를 하나 입력 받아 해당 구구단을 출력하세요
		
		System.out.println("숫자를 하나 입력하세요.");
		Scanner scan = new Scanner(System.in);		// scanner 함수로 데이터 받기
		int num = scan.nextInt();					// 수  입력
		
		for (int i = 1; i < 10; i++) {		// for문 1부터 9까지 반복
			System.out.println(num + " * " + i + " = " + num*i); // 반복문 9번 실행
		}
		
		/* 
		  int dan = System.in.read();		read 함수로 문자 하나 받음
		  
		  dan -= 48;					2~9의 ASCII코드 값이 50~ 57 이므로 -48
		  
		  for(int i = 1; i <= 9; i++) {			for문 1부터 9까지 반복
		  		System.out.println(dan + " * " + i + " = " + dan*i);  		출력
		  }
		  
		 */
	}

}
