package d20191226_Class;

public class MethodEx06 {	// MethodEx06 Class 시작
	
	/*
	 * 	소수 출력하기
	 * 	
	 * 	1. main()에서 1이상 100이하의 값 중 소수를 전부 출력
	 * 	2. isPrimeNumber()를 통해 전달된 값이 소수인지 아닌지를 판단하여 반환하는 형태
	 */

	public boolean isPrimeNumber(int so) {	// isPrimeNumber() 시작
		boolean bol = true;
		for(int i = 2; i < so; i++) {	// i는 2부터 so까지 1씩 증가
			if(so%i == 0) {		// 입력받은 so가 i로 나눠지면 
				bol = false;	// 소수가 아님
			}
		}
		
		return bol;				// 그 외는 소수
	}	// isPrimeNumber() 종료
	
	public static void main(String[] args) {	//	main() 시작
		
		MethodEx06 me = new MethodEx06();
		for(int i = 1; i <= 100; i++) {
			// System.out.println(i + " : " + me.isPrimeNumber(i));
			if(me.isPrimeNumber(i) == true) {	// 소수인 애들만 보기	
				System.out.print(i + "  ");
			}
		}
		
	}	// main() 종료
}	// MethodEx06 Class 종료
