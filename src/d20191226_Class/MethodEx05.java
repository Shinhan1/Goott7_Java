package d20191226_Class;

public class MethodEx05 {	// MethodEx05 Class 종료
	
	/*
	 * 	임의의 원의 반지름 정보를 전달하면
	 * 
	 * 	1) 원의 넓이를 계산해서 반환하는 메소드 생성 - 결과 출력
	 *		반지름 : 12.2
	 *	
	 *	2) 원의 둘레를 계산해서 반환하는 메소드 생성 - 결과 출력
	 *		반지름 : 7.6
	 *
	 *	원의 넓이 : 반지름 * 반지름 * 3.14
	 *	원의 둘레 : 반지름 * 2 * 3.14
	 */

	public double circumArea(double rad) {		// circumArea() 시작	// 원의 넓이 구하는 메소드
		double area = rad * rad * 3.14;		// area =  반지름 * 반지름 * 파이
		
		return area;	// 넓이 반환
	}	// circumArea() 종료
	
	public double circumLength(double rad) {		// circumLength() 시작 // 원의 둘레 구하는 메소드
		double length = 2 * rad * 3.14;		// length = 2 * 반지름 * 파이
		
		return length;	// 둘레 반환
	}	// circumLength() 종료
	public void circumPrint(double a, double b) {		// circumPrint() 시작  // 원의 넓이와 둘레를 출력하는 메소드
		System.out.println("원의 넓이는 " + a);		// 넓이 출력
		System.out.println("원의 둘레는 " + b);		// 둘레 출력
	}	// circumPrint() 종료
	
	public static void main(String[] args) {		// main() 시작
		MethodEx05 me = new MethodEx05();		// 변수 선언
		double area = me.circumArea(12.2);	// 변수 area에 넓이 구하는 메소드 선언 // call by value
		double length = me.circumLength(7.6);	// 변수 length에 둘레 구하는 메소드 선언
		
		me.circumPrint(area, length);		// circumPrint() 메소드 출력
		
	}	// main() 종료
}	// MethodEx05 Class 종료
