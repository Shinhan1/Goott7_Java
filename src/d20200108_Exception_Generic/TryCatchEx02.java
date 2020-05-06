package d20200108_Exception_Generic;

import java.util.Scanner;

// 하나의 try에 둘 이상의 exception이 발생할 수 있음. 둘 이상의 catch 영역을 구성할 수도 있음.
// => 예외처리를 위한  코드를 완전히 별도로 구성할 수 있음 (권장 사항)


public class TryCatchEx02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[100];
		
		
		for(int i = 0; i < 3; i++) {
			try {
				System.out.println("피제수 입력 : ");
				int num1 = scan.nextInt();
				
				System.out.println("제수 입력 : ");
				int num2 = scan.nextInt();
			
				System.out.println("연산의 결과를 저장할 배열의 인덱스 입력 : ");
				int idx = scan.nextInt();
				
				arr[idx] = num1/num2;
				
				System.out.println("나눗셈 결과 : " + (arr[idx]));
				System.out.println("저장된 인덱스 번호 : " + idx);
				
				
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("제수는 0이면 안되요");
				i -= 1;
				continue;
			}catch(ArrayIndexOutOfBoundsException e) {		// catch 문을 이을 수 있다
				System.out.println(e.getMessage());
				System.out.println("유효하지 않은 인덱스 번호입니다.");
				i -= 1;
				continue;
			}
			
			
		}
		
		
		
	}

}
