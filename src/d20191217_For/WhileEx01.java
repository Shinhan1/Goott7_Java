package d20191217_For;

// while문 : for문과 같은 반복문
// while이 for보다 조건이 간편하다

public class WhileEx01 {
	
	public static void main(String[] args) {
		// 구구단 2단 출력
		int dan = 2;
		int i = 1;
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
		
		System.out.println("------------------------------");
		// while문 역시 중첩(다중 반복문 가능)
		// 구구단 9단까지 모두 출력해보세요
		
		
		while(dan <= 9) {		// 외부 while문 시작
			int j =1;
			System.out.println(dan + "단");
			while(j <= 9) {		// 내부 while문 시작
				System.out.println(dan + " * " + j + " = " + dan * j);
				j++;
				
			}		// 내부 while문 종료
			dan ++;
			System.out.println();
		}		//외부 while문 종료
		
		
		
		
		
	}

}
