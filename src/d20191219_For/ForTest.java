package d20191219_For;

import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 크기를 입력하시오 (단, 4이상) : ");
		int num = scan.nextInt();
		int n = num/3;
		for(int i = 1; i <= num; i++) {
			for (int j = 1; j <= num-n; j++) {
				if (j <= n || j > num) {
					System.out.print(" ");
				} else{
					System.out.print("*");
				}
			}
			if(i <= num/2)
				n--;
			 
			else 
				n++;
			System.out.println();
			
		
		
		}
	}
}