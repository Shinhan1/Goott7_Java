package d20191223_Arr;

import java.util.Scanner;

public class ArrBaseBall01 {
	
	public static void main(String[] args) {
		
		// 1. 컴퓨터가 3자리 정수 - 랜덤하게 생성
		int[] com = new int[3];
		
		boolean flag = true;
		
		// 2. 각각 자리수에 수 (0 ~ 9)가 서로 일치하지 않는지 검사
		while(flag) {
			
			com[0] = (int)((Math.random()*9)+1);
			com[1] = (int)(Math.random()*10);
			com[2] = (int)(Math.random()*10);
			
			if(com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {
				flag = false;
			}
			
		}	// while(flag) end
		// System.out.println("" + com[0] + com[1] + com[2]);
		
		boolean flag1 = true;
		
		// 몇 번 만에 사용자가 정답을 맞췄는지 확인
		int count = 0;
		
		
		// 3. 사용자로부터 입력값 받기 - 3자리 정수
		while(flag1) {
			
			count ++;
			Scanner scan = new Scanner(System.in);
			System.out.print("3자리 정수를 입력하세요 : ");
			
			
			int value = scan.nextInt();
			System.out.println("사용자가 입력한 값 : " + value);
			
			// 152
			// [1][5][2]
			
			int[] userInput = new int[3];
			userInput[0] = value/100;
			userInput[1] = value%100/10;
			userInput[2] = value%10;
			
			// 4. 사용자가 입력한 값과 컴퓨터가 생성한 값을 비교
			int strike = 0;
			int ball = 0;
			
			//	: 자리값과 숫자가 모두 일치하는지 비교
			// 	: 자리값과 숫자가 모두 일치하면 1S를 증가
			// 	: 다른자리에서 일치하면 1B을 증가
			
			for(int i = 0; i<3; i++) {
				if(com[i] ==userInput[i]) {
					strike ++;
				}else {
					for(int j = 0; j < 3; j++) {
						if(com[j] == userInput[i]) {
							ball ++;
						}
						
						
					}
				}
			}
			
			// 5. 판정 결과를 화면에 출력
			// ? strike, ? ball
			System.out.println(strike + " strike , " + ball + " ball");
			
			// 6. 3S가 되면 경기를 종료, 아니면 반복
			
			if(strike == 3) {	// 3strike가 되면 종료
				System.out.println("OUT ! \n경기종료");
				flag1 = false;
			}
		}	// while(flag1) end
		
		System.out.println("와우 ~ " + count + "번 만에 맞추셨습니다.");
		
	}	// main() end

}	// class end
