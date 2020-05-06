package d20191219_For;

import java.util.Scanner;

public class ForTest01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);				// 데이터 입력
		System.out.print("숫자를 입력하시오 (홀수, 양수) : ");		// 출력문
		int num = scan.nextInt();				// 수 입력
		
		// 정삼각형 그리기
		
		/*
		for(int row = 1; row <= num; row += 2) {		// row행이 1부터 입력받은 수 num까지 row가 2씩 증가 하면서 반복
			for(int space = 1; space <= (num-row)/2; space++) {		// space가 1부터 (입력받은 수-행수)/2: 수에서 행수만큼 빼야 다음행으로
																	// 가면서 하나씩 줄어듬
																	// 까지 1씩 증가하면서 반복
				System.out.print(" ");								// 빈칸 입력
			}
			
			for(int col = 1; col<= row ; col++) {			// col열이 1부터 row행까지 1씩 증가하면서 반복
				System.out.print("*");						// -> 따라서 1행에서 별이 1개, 그다음 for문은 row가 2증가하므로
			}												//    2행이지만 row는 3이므로 별 3개, 다음 3행에서 row가 5이므로 별 5개 
			System.out.println();		// 개행				//	  ......
		}
		System.out.println("\n");		// 2줄 개행
		
		// ----------------------------------------------------------------------------------------
		// 마름모 그리기
		
		int n = num/2+1;						// 입력 받은 수의 절반값  // ex) 입력 받은 수가 11일경우 (11/2 = 5)이므로  +1해줌
		for(int row = 1; row <= num; row++) {				// 행이 1씩 증가하면서 입력받은 수만큼 1씩 증가
			for (int col = 1; col < num-n; col++) {			// 열이 1부터 입력받은수 n까지 1씩 증가
				if (col < n) {				// 열이 입력받은 수의 절반보다 작으면
					System.out.print(" ");	// 공백 출력
				} else {
					System.out.print("*");	// 아니면 별 출력
				}
				
			}
			if(row < num/2+1 )			// 만약 행이 절반보다 작은수라면 n을 1씩 감소
				n--;
			else
				n++;					// 행이 절반보다 같거나 크다면 n을 1씩 증가
			System.out.println();
			
		}
		System.out.println("\n");
		*/
		
		// 마름모 그리기 정삼각형 만든 후, 아래에 역삼각형 붙이기
		
		for(int row = 1; row <= num; row += 2) {		// row행이 1부터 입력받은 수 num까지 row가 2씩 증가 하면서 반복
			for(int space = 1; space <= (num-row)/2; space++) {		// space가 1부터 (입력받은 수-행수)/2: 수에서 행수만큼 빼야 다음행으로
																	// 가면서 하나씩 줄어듬
																	// 까지 1씩 증가하면서 반복
				System.out.print(" ");								// 빈칸 입력
			}
			
			for(int col = 1; col<= row ; col++) {			// col열이 1부터 row행까지 1씩 증가하면서 반복
				System.out.print("*");						// -> 따라서 1행에서 별이 1개, 그다음 for문은 row가 2증가하므로
			}												//    2행이지만 row는 3이므로 별 3개, 다음 3행에서 row가 5이므로 별 5개 
			System.out.println();		// 개행				//	  ......
		}
		
		for(int row = num-2; row >= 1; row -= 2) {		// row행이 1부터 입력받은 수 num까지 row가 2씩 증가 하면서 반복
			for(int space = 1; space <= (num-row)/2; space++) {		// space가 1부터 (입력받은 수-행수)/2: 수에서 행수만큼 빼야 다음행으로
																	// 가면서 하나씩 줄어듬
																	// 까지 1씩 증가하면서 반복
				System.out.print(" ");								// 빈칸 입력
			}
			
			for(int col = 1; col<= row ; col++) {			// col열이 1부터 row행까지 1씩 증가하면서 반복
				System.out.print("*");						// -> 따라서 1행에서 별이 1개, 그다음 for문은 row가 2증가하므로
			}												//    2행이지만 row는 3이므로 별 3개, 다음 3행에서 row가 5이므로 별 5개 
			System.out.println();		// 개행				//	  ......
		}
		System.out.println("\n");		// 2줄 개행
		
		// ------------------------------------------------------------------------------
		// 원 그리기
		int s = num/3;		// 원이 되는 기준, 입력받은 수를 3으로 나눠 기준 잡음 // 공백 몇개?
		
		
		for(int row = 1; row <= num; row++) {			// 행이 1부터 입력받은 수까지 1씩 증가하면서 반복
			for (int col = 1; col <= num-s; col++) {	// 열이 1부터 입력받은 수에서 기준을 만큼 뺀 값까지 1씩 증가하면서 반복
				if (col <= s || col > num) {			// 열이 s보다 작거나 같을때(열이 기준까지 공백이 와야함) 또는 열이 입력한 수보다 클 때(뒤에오는 것을 없애줌)
					System.out.print(" ");				// 공백 출력
				} else{
					System.out.print("*");				// 아니면 * 출력
				}
			}
			if(row <= num/2)		// 행이 입력받은수/2 보다 작거나 같으면 기준 1 감소
				s--;				
			
			else 					// 행이 입력받은수/2 보다 크면 기준 1증가
				s++;				
			System.out.println();
		}
		System.out.println();
		
		// 별 그리기
		int p = num * 3;			// 정삼각형 밑에 줄을 위한 변수
		for(int row = 1; row <= num; row += 2) {			// 행이 1부터 입력받은 수까지 2씩 증가하면서 
			for(int space = 1; space <= (num-row)/2+num; space++) {		// 공백이 (입력받은 수에서 행값을 뺸)/2  
				System.out.print(" ");									// -> 정삼각형이므로 입력받은 수를 더해줘야 중앙에서 시작
				
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// ------------------------------------------------------ 정삼각형 만들기
		
		for(int row = p; row >= num*2; row -=2) {				// 행이 p -> 정삼각형 밑 기준 (밑변 x 3) 부터 시작해서 2씩 감소
			for(int space = 1; space <= (p-row)/2; space++) {	// 공백이 1부터 (기준값 - 행값)/2
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {				// 열이 1부터 행까지 1씩 증가
				System.out.print("*");
			}
			System.out.println();
			
		}
		// ------------------------------------------------------ 사다리꼴 만들기
		
		for(int row = num; row >= 1; row -=2) {
			for(int space = 1; space <= row/2; space++) {		// 공백을 행을 2로 나눈 것까지 1씩 증가
				System.out.print(" ");							
			}
			for(int col = 1; col <= row; col++) {				// 열이 1부터 행까지 1씩 증가
				System.out.print("*");
			}
			
			System.out.print(" ");
			
			for(int space = 1; space <= (num-row)*3; space++) {	// 공백이 1부터 입력받은수에서 행값을 뺸값에 3을 곱한것 까지 1씩 증가
				System.out.print(" ");
			}
			
			for(int col = 1; col <= row; col++) {		// 열이 1씩 증가하면서 행까지
				System.out.print("*");
			}
			
		// ------------------------------------------------------- 다리 만들기	
			
			System.out.println();

		}
		
		
		
	}
	

}

