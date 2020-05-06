package d20191213_Basic;

// 8. 대입연산자 : =, +=, -=, *=, /=, %=
public class OperEx08 {			// 클래스 시작
	
	public static void main(String[] args) {		// 메인 시작
		
		int a = 10;
		a += 2;				//a = a + 2;
		
		System.out.println("a : " + a);
		System.out.println("a += 2 : "+ (a += 2)); // a = a + 2
		System.out.println("a -= 2 : "+ (a -= 2)); // a = a - 2
		System.out.println("a *= 2 : "+ (a *= 2)); // a = a * 2
		System.out.println("a /= 2 : "+ (a /= 2)); // a = a / 2
		System.out.println("a %= 2 : "+ (a %= 2)); // a = a % 2
		
		
		
	}	// 메인 끝

}	// 클래스 끝
