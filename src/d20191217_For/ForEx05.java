package d20191217_For;

public class ForEx05 {
	public static void main(String[] args) {
		/*
		 * 다음 식을 만족하는 모든 A와 B의 조합을 구하세요
		 * 
		 * 		A	B
		 * +	B	A
		 * -----------------
		 * 		9	9
		 */
		
	
	for(int i = 1; i <= 9; i++) {			// i가 1부터 9까지 1씩 증가하면서 반복
		for(int j = 1; j <=9; j++) {		// j가 1부터 9까지 1씩 증가하면서 반복
			if(i+j == 9) {			// 만약 i + j 가 9라면 if문 실행
				System.out.println("A = " + i +", B = "+ j); //출력문
			}
		}
		
	}
	
	System.out.println("\n");
	
	for(int i = 1; i <= 9; i++) {
		for(int j =1; j<=9; j++) {
			if((i*10)+i + (j*10)+j == 99) {
				System.out.println("A = " + i +", B = "+ j);
			}
		}
	}
	
		
		
	}
	

}
