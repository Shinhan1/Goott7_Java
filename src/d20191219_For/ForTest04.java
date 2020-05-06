package d20191219_For;

import java.util.Scanner;

// 마름모

public class ForTest04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int num = scan.nextInt();
		
		for(int row = 1; row <= num; row += 2) {		// row행이 1부터 입력받은 수 num까지 row가 2씩 증가 하면서 반복
			for(int space = 1; space <= (num-row)/2; space++) {		// space가 1부터 (입력받은 수-행수)/2: 수에서 행수만큼 빼야 다음행으로
																	//가면서 하나씩 줄어듬
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
																	//가면서 하나씩 줄어듬
																	// 까지 1씩 증가하면서 반복
				System.out.print(" ");								// 빈칸 입력
			}
			
			for(int col = 1; col<= row ; col++) {			// col열이 1부터 row행까지 1씩 증가하면서 반복
				System.out.print("*");						// -> 따라서 1행에서 별이 1개, 그다음 for문은 row가 2증가하므로
			}												//    2행이지만 row는 3이므로 별 3개, 다음 3행에서 row가 5이므로 별 5개 
			System.out.println();		// 개행				//	  ......
		}
		System.out.println("\n");		// 2줄 개행
	}

}
