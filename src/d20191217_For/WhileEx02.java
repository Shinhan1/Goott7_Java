package d20191217_For;

public class WhileEx02 {
	
	public static void main(String[] args) {
		// 1부터 100까지의 합(while문)
		
		int i = 1;
		int sum = 0;
		while (i <= 100) {		// i가 100보다 작거나 같을 때 반복문 실행
			sum += i;			// sum에 sum + i를 대입
			i++;				// i를 1씩 증가 , 이 식을 넣지 않으면 무한 루프
		}
		System.out.println(sum);
		
		System.out.println("---------------------");
		
		// 1부터 100까지 출력 (while)
		// 100부터 1까지 출력 (do ~ while)
		
		int num = 1;
		
		while(num <= 100) {				// i가 100보다 작거나 같을 때 반복문 실행
			System.out.println(num);
			num++;						// i를 1씩 증가 , 이 식을 넣지 않으면 무한 루프
		}
		System.out.println("-----------------------");
		
		
		do {				// do ~ while 문 시작 // 최소 한번 실행
			num--;			// num을 1씩 감소
			System.out.println(num);		//출력문
		}while(num>0);		// do ~ while 문 종료 // num이 0보다 크면 반복
	}

}
