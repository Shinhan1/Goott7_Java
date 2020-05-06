package d20191217_For;

public class ForEx04 {
	
	public static void main(String[] args) {
		// 1. 구구단
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		// 2. 짝수단 출력
		
		for(int i = 2; i <= 9; i += 2) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		// 3. 2단은 2*2까지 ... 8단은 8*8
		
		for(int i = 2; i <= 9; i++) {		// i가 2부터 9까지 1씩 증가 하면서 반복
			
			if(i%2 == 0) {		// i를 2로 나눠 나머지가 0일 경우 if문 실행
				System.out.println(i + "단");
				
				for(int j = 1; j <= i; j++) {	// j가 1부터 i까지 1씩 증가하면서 반복
					System.out.println(i + " * " + j + " = " + i*j);
				}
			
				System.out.println();
			}
		}
		
		
		
		
		
	}

}
