package d20191216_If_Switch;
import java.util.Scanner;     // Scanner -> 키보드로부터 입력받기 위한 함수

public class IfEx02 {
	
	public static void main(String[] args) {
		/*
		 if(조건 *) {				조건문 1
		 	문장 1 ;
		 	문장 2
		 	.
		 	.
		 }else if(조건 b){		조건문 2
		 	문장 1;
		 	문장 2;
		 	.
		 	.
		 }else if(조건 c){		조건문 3
		 	문장 1;
		 	문장 2;
		 	.
		 	.
		 }else{					마지막 조건문
		 	문장 1;
		 	문장 2;
		 	.
		 	.
		 }
		 */
		

		System.out.println("학생의 성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);			// 키보드로부터 수를 입력받기 위한 함수
		

		// System.out.println(score);
		
		// 조건문(분기문)
		
		while(true) {			// while문을 true로 선언해 무한으로 돔
			int score = sc.nextInt();		// 자료형 int 변수명 score에 수를 입력받음
			if(score >= 90 && score <= 100) {
				System.out.println("당신의 학점은 A입니다.");	// score에 90 이상 100 이하 일 때 출력을 함
				break;									// score가 90 이상 100 이하이면 while문 탈출
			}else if(score >= 80 && score < 90) {
				System.out.println("당신의 학점은 B입니다.");	// score에 80 이상 90 미만 일 때 출력을 함
				break;									// score가 80 이상 90 미만이면 while문 탈출
			}else if(score >= 70 && score  < 80) {
				System.out.println("당신의 학점은 C입니다.");	// score에 70 이상 80 미만 일 때 출력을 함
				break;									// score가 70이상 80 미만이면 while문 탈출
			}else if(score >= 60 && score < 70) { 
				System.out.println("당신의 학점은 D입니다.");	// score에 60 이상 70 미만 일 때 출력을 함
				break;									// score가 60 이상 70 미만이면 while문 탈출
			}else if(score >= 0 && score <60) {
				System.out.println("당신의 학점은 F입니다.");	// score에 0 이상 60 미만 일 때 출력을 함
				break;									// score가 0 이상 60 미만이면 while문 탈출
			}else {
				System.out.println("성적을 올바르게 입력하세요");
			}
		}
		
	}

}
