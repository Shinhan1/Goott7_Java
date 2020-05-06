package d20191213_Basic;

// 6. 논리 연산자 : &&, ||
public class OperEx06 {		// 클래스 시작
	public static void main(String[] args) {		// 메인 시작
		
		boolean bl1 = true;				// boolean bl1에 true 대입
		boolean bl2 = false;			// boolean bl2에 false 대입
		
		// bl1과 bl2를 and 연산
		System.out.println("bl1 && bl2 : "+ (bl1 && bl2));		// bl1(true) 와 bl2(false) and 연산
	
		// bl1과 bl2를 or  연산
		System.out.println("bl1 || bl2 : "+ (bl1 || bl2));		// bl1(true) 와 bl2(false) or 연산
		
		System.out.println("bl1 & bl2 : "+ (bl1 & bl2));		// bl1(true) 와 bl2(false) and 연산
		// 비트 연산자가 논리연산자 역할도 가능함. 그러나 반대로는 불가능
		
	}	// 메인 끝

}	// 클래스 끝
