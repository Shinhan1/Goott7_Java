package d20191217_For;

// 제어문 (반복문)
// 1. for (초기식; 조건식; 증감식) {
// 		문장 ....
//
// }

public class ForBasic {
	public static void main(String[] args) {
		// 1부터 3까지 출력해 보세요
		System.out.println(1);			// 일반 출력
		System.out.println(2);
		System.out.println(3);
		
		System.out.println("--------------------");	
		
		for(int i = 1; i <= 3; i ++) {		// for문 i가 1부터 3까지 증가하면서 반복
			System.out.println("for 반복문 : "+ i);		// 총 3번 반복 i = 1, i = 2, i = 3 일 때
		}
		
		System.out.println("---------------------------");
		
		int j = 3;		// 구구단 3단 출력
		for(int i = 1; i < 10; i++ ) {		// for문 i가 1부터 9까지 증가하면서 반복
			System.out.println(j + " * " + i + " = " + j*i);		// 9번 반복 출력문
		}
		
		System.out.println("---------------------------");
		
		int dan = 5;	// 구구단 5단
		for(int i = 1; i < 10; i++ ) {		// for문 i가 1부터 9까지 증가하면서 반복
			System.out.println(dan + " * " + i + " = " + dan * i );		// 9번 반복 출력문
		}
		
	}

}
