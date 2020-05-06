package d20200102_OOP_String;

public class StringEx02 {
	public static void main(String[] args) {
		String s = new String("Java Oracle");
		
		char ch = s.charAt(2);
		System.out.println("s.charAt(2) : " + ch);
		
		// r 나오게 출력해보세요
		
		char ch1 = s.charAt(6);
		System.out.println("s.charAt(6) : " + ch1);
		
		System.out.println("--------------------------");
		
		String str1 = "목요일";
		
		// 문자열 연결
		System.out.println(s+str1);
		System.out.println(s.concat(str1));
		
		// 오늘은 목요일 내일은 금요일
		String s1 = "오늘은 ";
		String s2 = "목요일 ";
		String s3 = "내일은 ";
		String s4 = "금요일!";
		
		System.out.println(s1 + s2 + s3 + s4);
		
		System.out.println("-------------------------");
		
		// 메소드 체이닝(chaining) 방식
		System.out.println(s1.concat(s2).concat(s3).concat(s4));
		System.out.println(s1.concat(s2+s3+s4));
		
		// 내용 비교
		boolean result = s.contains("Java");		// 포함 여부
		System.out.println("result : " + result);
		
		// equals()  : 글자 대소문자를 구분함에 유의!
		System.out.println(s.equals("JAVA ORACLE"));
		
		// 대, 소문자를 무시
		System.out.println(s.equalsIgnoreCase("JAVA ORACLe"));
		
		// 위치 반환 메소드
		int position = s.indexOf('r');
		System.out.println("r은 " + position + " 번째 글자이다.");
		
		// 문자열 길이를 반환해주는 메소드
		System.out.println(s.length());
		
		// 2번째부터 6번째까지 글자를 추출
		System.out.println(s.substring(2, 6));		// 2번째이상 6번째미만
		
		// 문자열 char[] 리턴하는 메소드
		char[] ch2 = s.toCharArray();
		System.out.println(ch2);
		for(int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		
		System.out.println();
		System.out.println(ch2[2] + " ch2[2]");
		
		System.out.println("------------------------------------");
		
		// 향상된 for문, 개선된 for문
		for(char c : ch2) {
			System.out.print(c);
		}
		System.out.println();
		System.out.println("------------------------------------");
		
		// String도 배열 가능
		String[] data = {"사과", "배", "포도", "딸기"};
		
		// for (자료형 변수 : 원데이터)
		for(String str : data) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("------------------------------------");
		
		// 아이디만 추출해보세요
		String email = "sideno@naver.com";
		int pos = email.indexOf('@');
		
		System.out.println(email.substring(0, pos));
		
		
		
		
		
		
	}

}
