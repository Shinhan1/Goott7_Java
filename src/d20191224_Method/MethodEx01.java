package d20191224_Method;

// 임의의 두 정수를 받아서, 사칙연산을 출력하는 메소드를 작성
// (단, 나눗셈의 몫과 나머지는 따로 출력)
// 메소드명 : operMethod()

public class MethodEx01 {		// 클래스 시작
	
	void operMethod(int num1, int num2) { 		// 사칙연산 메소드 시작
		
		System.out.println("덧셈 : " + (num1 + num2));
		System.out.println("뺄셈 : " + (num1 - num2));
		System.out.println("곱셈 : " + (num1 * num2));
		System.out.println("나눗셈 : " + (num1 / num2));
		System.out.println("나머지 : " + (num1 % num2));
	
	}		// 사칙연산 메소드 끝
	
	public static void main(String[] args) {		//메인 시작
		MethodEx01 me = new MethodEx01();
		me.operMethod(67, 27);			// Call By Value 형태
	}		// 메인 끝

}		// 클래스 끝

