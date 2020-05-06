package d20200108_Exception_Generic;

import java.util.Scanner;

public class TryCatchEx01 {
	public static void main(String[] args) {
		System.out.println("두 개의 정수를 입력 : ");
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		try {			// 그냥 실행
			System.out.println("목 : " + (num1/num2));
			System.out.println("나머지 : " + (num1%num2));
		}catch(ArithmeticException e) {		// Exception 발생 시 실행
			System.out.println(e.getMessage());
			System.out.println("0으로는 나눌 수 없어요");
		}
		
		
	}
	
}
