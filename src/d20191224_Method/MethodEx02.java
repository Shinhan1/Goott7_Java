package d20191224_Method;


// 1. 임의의 두 정수를 입력받기 - 한 세번?
// 2. 두 수 차의 절대값을 계산하여 출력하는 메소드
// 메소드명 : abs()

public class MethodEx02 {		// 클래스 시작
	void abs(int x, int y) {	// abs() 시작
		
		if(x > y) System.out.println(x + " - " + y + " = " + (x-y));		// 만약 x가 y보다 크다면 실행
		else System.out.println(y + " - " + x + " = " + (y-x));				// 아니면 실행
	}	// abs() 종료
	
	public static void main(String[] args) {	// main 시작
		MethodEx02 me = new MethodEx02();
		me.abs(11, 19);
		me.abs(29, 17);
		me.abs(39, 92);
	}	// main 종료

}	// 클래스 종료
