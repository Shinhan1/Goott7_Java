package d20191216_If_Switch;

public class IfEx03 {
	
	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = -230;
		
		int big;
		
		// 두 값중 큰 값을 구하기
		if(num1 > num2) {			// num1이 num2보다 크다면
			big = num1;				// big에 num1을 대입
			System.out.println(big);
		}else {						// 그렇지 않다면
			big = num2;				// big에 num2를 대입
			System.out.println(big);
		}
		
		System.out.println("--------------------------------------");
		
		
		// 두 수 차이를 구해보세요 (절댓값)
		
		int dif;
		if(num1 >= num2) {
			dif = num1 - num2;				
			System.out.println(dif);
		}else {
			dif = num2 - num1;
			System.out.println(dif);
		}
		
		
		
	}

}
