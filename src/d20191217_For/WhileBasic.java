package d20191217_For;

public class WhileBasic {
	
	public static void main(String[] args) {
		//for문 9단 출력해보세요
		int dan = 9;
		
		System.out.println(dan + "단");
		for(int i = 1; i <= 9; i++) {			// for문 9단 출력식
			System.out.println(dan + " * "+ i + " = " + dan*i);
			
		}
		System.out.println("---------------------------");
		int num = 1;		// num변수 1로 초기화
		System.out.println();
		System.out.println(dan + "단");	// 단수 출력
		
		while(num <= 9) {		// num이 9보다 작다면 while문 반복 실행
			System.out.println(dan + " * "+ num + " = " + dan*num);		// 출력문
			num++;				// num을 증가 시켜야 무한루프에 빠지지 않음
		}		
		
		System.out.println("---------------------------");
		System.out.println();
		
		int k = 1;
		System.out.println(dan + "단");
		do {			// do ~~ while문은 무조건 한번 실행한 후 마지막 조건문이 true이면 반복
			System.out.println(dan + " * "+ k + " = " + dan*k);		// 최소 한번 실행 후 조건이 맞다면 반복 실행
			k++;
		}while(k<=9);	// 이 조건이 맞지 않으면 한 번 실행후 종료
		
		
		
	}
}
