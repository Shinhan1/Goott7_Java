package d20191216_If_Switch;

import java.util.Scanner;

// if문 사용

public class ZodiacSign2 {
	
	public static void main(String[] args) {
		
		// 사용자로부터 태어난 년도를 4자리 입력받은 후
		// 자축인묘 진사오미 신유술해
		// 쥐소호토 용뱀말양 원닭개돼
		
		// 4 5 6 7 8 9 10 11 12 1 2 3
		// 최종 출력 : 당신은 ~~~ 띠입니다.
					
		int year, ani;
				
		Scanner scan = new Scanner(System.in);
				
		System.out.println("태어난 년도를 입력하세요.");
		year = scan.nextInt();
		
		ani = year%12;
		
		String str = "";
				
		if(ani == 3) {
			str = "돼지";
		}else if(ani == 4) {
			str = "개";
		}else if(ani == 5) {
			str = "닭";
		}else if(ani == 6) {
			str = "원숭이";
		}else if(ani == 7) {
			str = "양";
		}else if(ani == 8) {
			str = "말";
		}else if(ani == 9) {
			str = "뱀";
		}else if(ani == 10) {
			str = "용";
		}else if(ani == 11) {
			str = "토끼";
		}else if(ani == 0) {
			str = "호랑이";
		}else if(ani == 1) {
			str = "소";
		}else if(ani == 2) {
			str = "쥐";
		}
		System.out.println("당신은 " + str + "띠입니다.");
		
	}

}
