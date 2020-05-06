package d20191217_For;

// 반복문 중첩 - 다중 반복문

public class ForEx02 {
	public static void main(String[] args) {
		// 19단 출력
		for (int dan = 2; dan <= 19; dan++) {		// 외부 for문 19단 까지 반복
			System.out.println(dan + "단");
			for(int j = 1; j <= 19; j++) {			// 내부 for문 19까지 반복
				System.out.println(dan + " * " + j + " = " + dan*j);
			}		// 내부 for문 종료
			System.out.println("\n");
		}		// 외부 for문 종료
		
	}
	

}
