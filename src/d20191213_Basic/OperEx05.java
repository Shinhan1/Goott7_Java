package d20191213_Basic;

// 5. 비트 연산자 : &, |
public class OperEx05 {		// 클래스 시작
	
	public static void main(String[] args) {		// 메인 시작
		
		byte a = 10;              // 0000 1010
		byte b = 22;              // 0001 0110
		//                  -------------------
		// a & b : 각 자리수끼리 and 연산 : 0000 0010
		// a | b : 각 자리수끼리 or  연산 : 0001 1110
		
		System.out.println("a & b : "+ (a & b));
		System.out.println("a | b : "+ (a | b));
		
		//System.out.println("a && b : "+ (a && b));
		
	}	// 메인 끝

}	// 클래스 끝
