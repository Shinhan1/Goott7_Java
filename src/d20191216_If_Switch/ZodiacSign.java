package d20191216_If_Switch;

import java.util.Scanner;

public class ZodiacSign {
	
	public static void main(String[] args) {
		
		// 사용자로부터 태어난 년도를 4자리 입력받은 후
		// 자축인묘 진사오미 신유술해
		// 쥐소호토 용뱀말양 원닭개돼
				
		// 4 5 6 7 8 9 10 11 12 1 2 3
		// 최종 출력 : 당신은 ~~~ 띠입니다.
				
		int year;
				
		Scanner scan = new Scanner(System.in);
		String str = "";	
		
		while(true) {			// 무한 루프
			System.out.println("태어난 년도를 입력하세요. (0 입력하면 종료)");
			
			year = scan.nextInt();		// 수 입력
			
			int ani = year % 12;		// ani에 year의 나머지 대입
			
			switch(ani) {
			case 0:
				str = "원숭이"; break;
			case 1:						// 나머지가 1일 때 str = 닭
				str = "닭"; break;
			case 2:						// 나머지가 2일 때 str = 개
				str = "개"; break;
			case 3:						// ......
				str = "돼지"; break;
			case 4:
				str = "쥐"; break;
			case 5:
				str = "소"; break;
			case 6:
				str = "호랑이"; break;
			case 7:
				str = "토끼"; break;
			case 8:
				str = "용"; break;
			case 9:
				str = "뱀"; break;
			case 10:
				str = "말"; break;
			case 11:
				str = "양"; break;
			
			}
			
			
			
			if(year == 0)	 {	// 0을 입력하면 while문 종료	
				System.out.println("종료합니다.");
				break;
			}else
				System.out.println("당신은 " + str + "띠입니다.");
		}
				
		
	}

}
