package d20191218_Arr;

// 369게임에서 박수가 필요한 숫자에서 짝이라고 표현해보세요
// (단 100까지)

public class Game369 {
	public static void main(String[] args) {
		
		
		int num = 1;	// 100까지 수를 세기 위한 변수
		for(int i = 0; i <= 9; i++) {	// 십의 자리 
			for(int j = 1; j <= 10; j++) {	// 일의 자리
				if(i%3 == 0 && i != 0) {	// 십의 자리 i가 3의 배수이고 0이 아닐때
					System.out.println(num + " 짝");		// 짝 출력
					if(j%3 == 0) {			// 십의 자리와 일의 자리가 모두 3 6 9 일 때 
						System.out.println(num + " 짝짝");	// 짝짝 출력
					}
				}else if (j%3 == 0) {		// 일의 자리 j가 3의 배수일 때
					System.out.println(num + " 짝");		// 짝 출력
				
					
				}else if (num == 30 || num == 60 || num == 90) { // 일의자리가 1에서 10이므로 30은 십의 자리 2 일의자리 10 으로 계산 되어 예외 처리
					System.out.println(num + " 짝"); 	// 짝 출력
					
				}else {		// 그 외에는 수를셈
					
					System.out.println(num);	// 수 출력
				}
				
				num++;			// 수 증가
				
			}
			
			
		}
		
		
		/*
		int ten = 0;
		int re = 0;
		
		// 1. 숫자 1부터 100까지 출력
		for(int i = 1; i<= 100; i++) {
			ten = i/10;
			re = i%10;
			// 2. 십의 자리수가 3, 6, 9 체크
			if((ten == 3) || (ten == 6) || (ten == 9)) {
				// 3. 일의 자리수와 동시 (33, 66, 99) 처리
				if((re == 3) || (re == 6) || (re == 9)) {
					System.out.println(i + " 짝짝");
				}else {
					System.out.println(i + " 짝");
				}
			}else if((re == 3) || (re == 6) || (re == 9)) {
				System.out.println(i + " 짝");
			}else
				System.out.println(i);
		}
		*/
		
	}
	

}


