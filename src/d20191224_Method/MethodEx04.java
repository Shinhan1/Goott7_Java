package d20191224_Method;

/*
 *	실행
 *	자바
 *	자바 A
 *	자바 A 1000
 *	자바 A 1000 10.5
 *	자바 A 1000 10.4 ture
 */

// 	Method overloading (메소드 오버로딩)
//	: 하나의 이름이지만 다양한 상황에서 동작하게 하는 기능
//	: method 이름은 같게 하고 매개변수 타입, 이름, 순서, 개수를 다르게 하면 됨


public class MethodEx04 {		// 클래스 시작
	void print(String str) {	// print() 시작
		System.out.println(str);
	}		// print() 종료
	
	void print(String str, char ch) {	// print() 시작
		System.out.println(str + " " + ch);
	}		// print() 종료
	
	void print(String str, char ch, int x) {	// ...메소드 이름 모두 print로 같지만 받는 변수들이 다르면 가능 (메소드 오버로딩)
		System.out.println(str + " " + ch + " " + x);
	}
	
	void print(String str, char ch, int x, double d) {
		System.out.println(str + " " + ch + " " + x + " " + d);
	}
	void print(String str, char ch, int x, double d, boolean bol) {
		System.out.println(str + " " + ch + " " + x + " " + d + " " + bol);
	}

	public static void main(String[] args) {	// 메인 시작
		MethodEx04 me = new MethodEx04();
		me.print("자바");
		me.print("자바",'A');
		me.print("자바", 'A', 1000);
		me.print("자바", 'A', 1000, 10.5);
		me.print("자바", 'A', 1000, 10.5, true);		// 메소드 오버로딩
	}		// 메인 종료
	
}	// 클래스 종료
	