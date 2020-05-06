package d20191213_Basic;

// 식별자
// 1. primitive type
// 정수형 : byte, short, int, long

public class VarEx01 {		// 클래스 시작
		
	public static void main(String[] args) { 		// 메인 시작
		// 변수 : 데이터를 저장하거나 참조하기 위해 메모리에 공간을 할당하는 것(그릇)
		
		// 변수 사용법 : 식별자(자료형) + 변수명; => 변수를 선언한다
		
		byte b1;  // -127 ~ 128		// 자료형 byte에 변수명 b1 선언
		
		b1 = 10;        	 // = : 대입 연산자
		
		short sh1;			// 자료형 short 변수명 sh1 선언
		sh1 = 20320;		// sh1에 20320 대입
		
		int it;				// 자료형 int에 변수명 it 선언
		it = 99999;			// it에 99999 대입
		
		long lo;			// 자료형 long에 변수명 lo 선언
		lo = 2009191919;	// lo에 2009191919 대입
		
		long LO2;			// 자료형 long에 변수명 LO2 선언
		
		LO2 = 1248102414;	// LO2에 수 대입
		
		System.out.println("b1 : "+ b1);
		System.out.println("sh1 : " + sh1);
		System.out.println("b1 + sh1 = " + (b1+sh1));
		System.out.println("it :"+ it);
		System.out.println("lo :"+ lo);
		System.out.println("LO2 :"+ LO2);
		
	}	// 메인 끝

}	// 클래스 끝
