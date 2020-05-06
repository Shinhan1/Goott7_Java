package d20191224_Method;

/*
 *	실행
 *	1. A
 *	2. 1000
 *	3. 10.5
 *	4. false 
 */

public class MethodEx03 {		// 클래스 시작
	void printChar(char ch) {	// printChar() 시작
		System.out.println("1. " + ch);
	}	// printChar() 종료
	
	void printInt(int x) {
		System.out.println("2. " + x); 
	}
	
	void printDouble(double d) {
		System.out.println("3. " + d);
	}
	
	void printBoolean(boolean bol) {
		System.out.println("4. " + bol);
	}
	
	public static void main(String[] args) {	// 메인 시작
		MethodEx03 me = new MethodEx03();
		me.printChar('A');
		me.printInt(1000);
		me.printDouble(10.5);
		me.printBoolean(false);
		
	}	// 메인 종료
	
	
}		// 클래스 종료
