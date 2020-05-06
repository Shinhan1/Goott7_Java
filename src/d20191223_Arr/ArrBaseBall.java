package d20191223_Arr;

import java.util.Scanner;

public class ArrBaseBall {
	public static void main(String[] args) {
		
		// 1. 컴퓨터가 3자리 정수 - 랜덤하게 생성
		
		// 2. 각각 자리수에 수 (0 ~ 9)가 서로 일치하지 않는지 검사
		
		// 3. 사용자로부터 입력값 받기 - 3자리 정수
		
		// 4. 사용자가 입력한 값과 컴퓨터가 생성한 값을 비교
		//    : 자리값과 숫자가 모두 일치한느지 비교
		//    : 자리값과 숫자가 모두 일치하면 1S 증가
		//    : 다른자리에서 숫자가 일치하면 1B 증가
		
		// 5. 판정 결과를 화면에 출력
		
		// 6. 3S가 되면 경기를 종료, 아니면 반복
		boolean flag = true;
		
		int first = (int)((Math.random() * 900) + 100);	
		
		int hun = first/100;
		int ten = first/10%10;
		int re = first%10;
		int str;
		int ball;
		
		
		System.out.println(first);
			
		System.out.print("수를 입력하세요 : ");
		
		
		while(true) {
			str = 0;
			ball = 0;
			
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			int hun1 = num/100;
			int ten1 = num/10%10;
			int re1 = num%10;
			
			if(hun == hun1) {
				str += 1;
				
			}
			if(ten == ten1) {
				str += 1;
				
			}
			if(re == re1) {
				str += 1;
				
			}
			
			if(hun == ten1 || hun == re1) {
				ball += 1;
				
			}
			if(ten == hun1 || ten == re1) {
				ball += 1;
				
			}
			if(re == hun1 || re == ten1) {
				ball += 1;
				
			}
			if(str == 3) { 
				System.out.println("3S 아웃입니다. 경기 종료");
				break;
			}
			
			if(hun != hun1 && hun != ten1 && hun != re1 && ten != hun1 && ten != ten1 && ten != re1 && re != hun1 && re != ten1
					&& re != re1) 
				System.out.println("파울!");
				
			
			System.out.println(str + "S");
			System.out.println(ball + "B");
			
			
		}
		
		
	}

}
