package d20191226_Class;

/*
 * 	실행화면
 * 	1. 자바
 * 	2. A
 * 	3. 1000
 * 	4. 3.14
 * 	5. true
 */



public class MethodReturn {
	
	void printStr(String str) { 
		System.out.println(str);
	}
	
	String returnStr() {
		return "자바";
	}
	char returnChr() {
		System.out.println('A');
		return 'A';
	}
	int returnInt() {
		return 1000;
	}
	double returnDouble() {
		return 3.14;
	}
	
	boolean returnBol() {
		return true;
	}
	
	
	
	public static void main(String[] args) {
		MethodReturn mr = new MethodReturn();
		//mr.printStr("SW 취업을 위한 정보처리산업기사 취득과정 B");
		
		
		String str = mr.returnStr();
		System.out.println("1. " + str);
		
		char ch = mr.returnChr();
		System.out.println("2. " + ch);
		
		System.out.println("3. " + mr.returnInt());
		
		System.out.println("4. " + mr.returnDouble());
		
		System.out.println("5. " + mr.returnBol());
		
	}

}
