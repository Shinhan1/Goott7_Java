package d20191213_Basic;

// 연산자
// 1. 증감 연산자 : ++, --
public class OperEx01 {			// 클래스 시작
	
	public static void main(String[] args) {		// 메인 시작
		int a = 100;		// int 자료형 a라는 변수에 100 대입
		int b = 100;		// int 자료형 b라는 변수에 100 대입
		
		//a = a + 1;        a 변수에 1을 더한 후 a 변수에 대입
		//a ++;				a 1 증가
		//b --;				b 1 감소
		//++ a;				a 1 증가
		//b = a ++/--;     후치 연산 : 대입을 한 후 연산
		
		//b = ++/-- a;     전치 연산 : 연산을 한 후 대입
		
		b = a;				// a를 b에 대입
		a++;				// a 1 증가
		
		
		System.out.println("a = "+ a + ", b = "+ b);

		
	
	}	// 메인 끝

}	// 클래스 끝
