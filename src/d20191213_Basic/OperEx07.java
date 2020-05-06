package d20191213_Basic;

// 7. 삼항 연산자
public class OperEx07 { 		// 클래스 시작
	public static void main(String[] args) {		// 메인 시작
		
	
		int a = 10;		// a에 10 대입
		int b = 5;		// b에 5 대입
		
		// (조건)? 참 : 거짓
		System.out.println((a > b)? "참" : "거짓");		// a가 b보다 큰가? 참이면 : 거짓이면
		System.out.println((a < b)? "참" : "거짓");		// a보다 b가 큰가? 참이면 : 거짓이면
		System.out.println((a == b)? "참" : "거짓");		// a와 b가 같은가? 참이면 : 거짓이면
		System.out.println((a != b)? "참" : "거짓");		// a와 b가 다른가? 참이면 : 거짓이면
		
	}	// 메인 끝

}	// 클래스 끝
