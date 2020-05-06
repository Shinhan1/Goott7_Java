package d20191219_For;

import java.util.Scanner;

// 별그리기

public class ForTest03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		
		for(int row = 1; row <= num; row += 2) {
			for(int space = 1; space <= (num-row)/2+num; space++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int n = num*3;
		for(int row = n; row >= num*2; row -=2) {
			for(int space = 1; space <= (n-row)/2; space++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int row = num; row >= 1; row -=2) {
			for(int space = 1; space <= row/2; space++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			
			System.out.print(" ");
			
			for(int space = 1; space <= (num-row)*3; space++) {
				System.out.print(" ");
			}
			
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}
		
		for(int row = 1; row <= num; row += 2) {		// row행이 1부터 입력받은 수 num까지 row가 2씩 증가 하면서 반복
			for(int space = 1; space <= (num-row)/2; space++) {		// space가 1부터 (입력받은 수-행수)/2: 수에서 행수만큼 빼야 다음행으로
																	//가면서 하나씩 줄어듬
																	// 까지 1씩 증가하면서 반복
				System.out.print(" ");								// 빈칸 입력
			}
			
			for(int col = 1; col<= row ; col++) {			// col열이 1부터 row행까지 1씩 증가하면서 반복
				System.out.print("*");						// ->
			}System.out.println();
		}
		for(int row = num-1; row <= 1; row -=2) {
			for(int space = 1; space <= (n-row); space ++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
		}
		
		
		
		
		
		System.out.println("\n");
		
		
		
	}
	

}
