package d20191217_For;

public class ForEx03 {
	public static void main(String[] args) {
		/*
		for(초기식; 조건식; 증감식) {
			문장 ...
		}
		*/
		// 1부터 16까지 짝수만 출력해보세요.
		
		for(int i = 1; i <= 16; i++) {				// for문 i가 1부터 16까지 1씩 증가하면서 반복
			if(i%2 == 0)			// 만약 i를 2로 나눈 나머지가 0이라면 if문 실행 (짝수)
				System.out.println("짝수 : "+ i);		// 실행문
		}
		System.out.println("\n");		// 엔터
		
		for(int i = 2; i<= 16; i +=2) {				// for문 i가 2부터 16까지 2씩 증가하면서 반복 (짝수)
			System.out.println("짝수 : " + i);		// 실행문
		}
		
		System.out.println("----------------------");
		
		for(int i = 1; i <= 9; i++) {				// 이 때의 i를 지역변수라고 함
			System.out.print(i + " ");				// 1부터 9까지 옆으로 출력
			// (print)ln : 엔터기능(개행)이 들어있음
		}
		
		System.out.println();			// 엔터
		System.out.println("-------------------------");
		
		
		// 1부터 10까지 합을 출력
		int  sum = 0;			// sum을 0으로 초기화
		for (int i = 1; i <= 10; i++) {		// 1부터 10 까지 1씩 증가하면서 반복
			sum += i;						// sum에 i를 더해가면서 반복
		}
		System.out.println(sum);			// 따라서 1+2+3+...+10 의 결과값이 출력
		
		
		
		
	}
	

	
}