package d20191213_Basic;

// 문자형 : char -> ' '안에 한글자만 가능
// 0 ~ 32768
// 문자열 : string

public class VarEx04 {		// 클래스 시작
	public static void main(String[] args) {		// 메인 시작
		// 콘솔에 JAVA 글자를 출력
		char ch1 = 'J';				// 자료형 char에 'J' 문자 대입
		char ch2 = 'A';				// 자료형 char에 'A' 문자 대입
		char ch3 = 'V';				// 자료형 char에 'V' 문자 대입
		char ch4 = 'A';				// 자료형 char에 'A' 문자 대입
		System.out.print(ch1);
		System.out.print(ch2);
		System.out.print(ch3);
		System.out.println(ch4);
		
		System.out.println(""+ch1+ch2+ch3+ch4);     // ("") -> 문자로 만듬, 없으면  ASCII 코드값이 출력
		
		String str = "JAVA Hello World";      // 문자열 String에 변수명 str을 선언해 "JAVA Hello World" 대입
		System.out.println(str);
		System.out.println("----------------------");
		
		// 자바는 unicode도 지원 - 한글 사용 가능 (단, 잘 쓰지는 않는다)
		String 한글 = "한글잘되나?";			// String 한글 사용 가능
		System.out.println(한글);
		
	}	// 메인 끝

}	// 클래스 끝
