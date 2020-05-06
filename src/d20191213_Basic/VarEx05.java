package d20191213_Basic;

public class VarEx05 {		// 클래스 시작
	
	public static void main(String[] args) {		// 메인 시작
		
		char ch5 = 'A';      // 문자형
		char ch6 = 65;       // ASCII
		char ch7 = '\u0063'; // unicode
		char ch8 = 99;       // ASCII
		
		// 각각 출력해 보세요
		// ctrl + alt + 아래 방향키 : 선택된 행 복사
		
		System.out.println(""+ch5+ch6+ch7+ch8);
		
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
		System.out.println(ch8);
		System.out.println("-------------------------------");
		
		// 특별한 의미를 갖는 문자 : \
		System.out.println("\\오늘은 금요일 입니다. \n내일은 토요일 입니다.");
		System.out.println();
		
		// \n : 개행 (엔터 기능), \t : tab 기능
		// \b : backspace (깨짐//이유 모름), \\ : \
		
		System.out.println("-------------------------");

		
		
	}	// 메인 끝	

}	// 클래스 끝
