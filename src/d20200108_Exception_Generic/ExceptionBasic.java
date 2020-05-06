package d20200108_Exception_Generic;

import java.util.Scanner;

// Exception : 가벼운 오류			cf) error : 심한 오류
// 예외 처리 방법
// 1. try ~ catch
// 2. throws (예외 전가)


public class ExceptionBasic {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("두 개의 정수를 입력 : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			// if문 사용해서 해결해보세요 (개발단에서 오류 해결)
			if(num2 != 0) {
				System.out.println("몫 : " + (num1/num2));
				System.out.println("나머지 : " + (num1%num2));
				
			}else {
				System.out.println("두 번째 숫자를 다시 입력하세요");
				num2 = scan.nextInt();
				System.out.println("몫 : " + (num1/num2));
				System.out.println("나머지 : " + (num1%num2));
			
			}
			
		}
		
		
	}

}
