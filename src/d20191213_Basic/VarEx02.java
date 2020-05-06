package d20191213_Basic;

public class VarEx02 {		// 클래스 시작
	public static void main(String[] args) {	// 메인 시작
		
		byte b2 = 127; // 변수 선언과 동시에 초기화
		
		System.out.println("b2 :"+ b2);
		
		System.out.println("------------------------");
		
		byte b1 = 10;		// 변수 선언 및 초기화
		byte b3 = 20;		// 변수 선언 및 초기화
		
		// b2 = b1 + b3;
		// 자바는 int 이하의 연산에서는 모두 int로 자동변환하여 계산
		
		int c = b1 + b3;
		
		System.out.println("c :"+ c);
		
		c = b1;
		
		b1 = (byte)c;		//b1은 자료형이 byte이므로 자료형이 int인 c를 byte로 자료형을 바꿔줌
		
		System.out.println("c :"+ c);
		
		int num = (int)3.15;		// 3.15가 실수이므로 자료형 int를 붙여 자료형을 맞춰줌
		double num1 = 3.15;			// 3.15가 실수이므로 자료형 double로 선언
		
		System.out.println(num);
		System.out.println(num1);
		
	}	// 메인 끝

}	// 클래스 끝
