package d20191218_Arr;

import java.util.Scanner;

/* 1번문제
public class JavaBreak {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num%3 == 0) {
			System.out.println(num + " : 3의 배수입니다.");
		}else
			System.out.println(num + " : 3의 배수가 아닙니다.");
		
		
	}

}
*/
/* 2번 문제
public class JavaBreak {
	public static void main(String[] args) {
		int sum = 0;
		
		
		for (int i = 1; i <= 100; i++) {
			
			if (i%2 != 0 && i%3 != 0) {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
		
		
	}
}

*/
// 3번 문제
public class JavaBreak {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i+j == 4) {
					System.out.println(i + ", " + j);
				}
			}
			
			
		}
		
	}
}
//

/* 4번문제
public class JavaBreak {
	public static void main(String[] args) {
		int dan = 3;
		
		for(int i = 1;i <= 9; i++) {
			System.out.print(dan + " * " + i + " = " + dan*i + "/t");
		}
		
		
	}
}

*/
/* 5번문제
public class JavaBreak {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				
			}
			System.out.println();
		}
		
		
	}
}
*/
/*
public class JavaBreak {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int n = 0,j = 0, i = 0, p = 0, a = 0, b = 0, c = 0, d= 0, f= 0, g = 0;
		// n = 오만원 갯수, i = 만원 갯수, j = 오천원 갯수, p = 천원 갯수, a = 오백원 갯수, b = 백원 갯수, c = 오십원 갯수, d = 십원 갯수, f = 오원 갯수, g = 일원 갯수
		
		while(num >= 50000) {
			num -= 50000;
			n++;		
		}
		while(num >= 10000) {
			num -= 10000;
			i++;
		}
		while(num >= 5000) {
			num -= 5000;
			j++;
		}
		while(num >= 1000) {
			num -= 1000;
			p++;
		}
		while(num >= 500) {
			num -= 500;
			a++;
		}
		while(num >= 100) {
			num -= 100;
			b++;
		}
		while(num >= 50) {
			num -= 50;
			c++;
		}
		while(num >= 10) {
			num -= 10;
			d++;
		}while(num >= 5) {
			num -= 5;
			f++;
		}
		while(num >= 1) {
			num -= 1;
			g++;
		}
		
		if(num == 0) {
			System.out.println("오만원 : " + n + " 장");
			System.out.println(" 만원 : " + i + " 장");
			System.out.println("오천원 : " + j + " 장");
			System.out.println(" 천원 : " + p + " 장");
			System.out.println("오백원 : " + a + " 장");
			System.out.println(" 백원 : " + b + " 장");
			System.out.println("오십원 : " + c + " 장");
			System.out.println(" 십원 : " + d + " 장");
			System.out.println(" 오원 : " + f + " 장");
			System.out.println(" 일원 : " + g + " 장");
		}
		
	}
	
}
*/



































