/*

1. 자바에서 사용되는 식별자의 종류?
1) primitive type (원시 타입)

2) reference type (참조 타입) : Class, Interface, Array,  ...

    
2.  8개의 변수의 종류와 크기는?
 (정수형) : byte (8bit = 1byte), short (16bit = 2byte), int (32bit = 4byte), long (64bit~ = 8byte~)
 (실수형) : 			             float (32bit = 4byte), double (64bit~ = 8byte~)
 (문자형) : 				char (2byte)
 (논리형) : boolean (참, 거짓)


3. 연산자의 우선순위가 높은 순으로 나열하시요

     + , () ,  & , +=, >>          :    (), +, >>, &, +=

4. byte  의 최대값과 최소값은 얼마인가?  그 이유는?

	byte의 최대값은 128 최소값은 -127 이다 byte는 8비트이기때문에 0000 0000 으로 표현하는데 
	총 256가지를 표현할 수 있다 최소값이 -127인 경우는 0을 포함하기 때문이다


다음 코드들을 작성할때 클래스명은 HwNo번호로 한다 한다.
5.
     *
     **
     ***
     ****
     *****

     
public class HwNo_신한 {
	public static void main(String[] args) {
		char ch = '*';
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}	
	}
}



6.
         1
         12
         123
         1234
         12345
         123456

public class HwNo_신한 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

  7. 몇줄 출력? 3

       *
       **
       ***
public class HwNo_신한 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = '*';
		System.out.print("몇 줄을 출력 하시겠습니까? ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

  8.   
       *****
       ****
       ***
       **
       *     

public class HwNo_신한 {
	public static void main(String[] args) {
		
		char ch = '*';
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(ch);
			}
			System.out.println();
		}	
	}
}

9. 구구단 2단 부터 9단까지 출력하는 코드를 작성하시오
public class HwNo_신한 {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}

10. 사용자로부터 값을 입력받아 해당 단을 출력하는 코드를 작성하시오
몇단? 3
3단 출력
public class HwNo_신한 {
	public static void main(String[] args) {

		System.out.print("몇 단? ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = num; i <= num; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}




11.  1부터 입력한 숫자까지의 누적합을 출력하시요

출력 결과

얼마?  100


1부터 100까지 합은 5050 입니다. 

public class HwNo_신한 {
	public static void main(String[] args) {

		System.out.print("얼마? ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 "+ num + "까지의 합은 " + sum + "입니다.");
	}
}
*/

package d20191217_For;

import java.util.Scanner;

public class HwNo_신한 {
	public static void main(String[] args) {
	
		
		/*
		System.out.print("수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		*/
		// int n = 5;
		
		
		
		for (int i = 1, n = 5; i <= 9; i++) {
			for (int j = 2; j <= n+2*(6-n)-1; j++) {
				if (j <= n) System.out.print(" ");
				else System.out.print("*");
			}System.out.println();
			if(i < 5) n--;
			else n++;
		
		
		}
		
		/*
		char ch = '*';
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(ch);
			}
			System.out.println();
			
		}	
			
		*/
	}
}
