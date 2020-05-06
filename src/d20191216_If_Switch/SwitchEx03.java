package d20191216_If_Switch;

import java.util.Scanner;

// 국어, 영어, 수학 점수를 차례대로 입력받기

public class SwitchEx03 {
	
	public static void main(String[] args) {
		
		int kor, eng, math, sum;			// 국어, 영어, 수학, 총합 선언
		double avg;							// 소수점 까지 표현하기 위해 double형 평균 선언
		// 점수를 차례대로 입력 받기
		Scanner scan = new Scanner(System.in);		// 데이터 입력받기 위한 함수 선언 변수명 scan
		
		System.out.println("국어 점수를 입력하세요");		
		kor = scan.nextInt();						// 국어 점수 입력
		System.out.println("영어 점수를 입력하세요");		
		eng = scan.nextInt();						// 영어 점수 입력
		System.out.println("수학 점수를 입력하세요");		
		math = scan.nextInt();						// 수학 점수 입력
		
		sum = kor + eng + math;			// 합계
		avg = sum / 3;					// 평균
		
		// System.out.println("국어 : " + kor + ", " + "영어 : " + eng + ", " + "수학 : " + math);
		// System.out.println("총합은 "+ sum + "\n평균은 "+ avg + "입니다.");
		
		
		String grade = "";		// 성적처리를 위한 String 변수 선언
		switch(sum/30) {		// 총 합을 3(과목 수) * 10으로 나눠 switch문의 조건 결정
		case 10: case 9:		// 10으로 나눴을 때 9, 10일 경우 
			grade = "A";
			break;
		case 8: grade = "B"; break;		// 10으로 나눴을 때 8일 경우
		case 7: grade = "C"; break;		// 			  7일 경우
		case 6: grade = "D"; break;		// 			  6일 경우
		default : grade = "F"; break;	// 			     그 외에 값일 경우
		
			
		}
		
		System.out.println("당신의 평균 점수는 "+ avg +"입니다.");
		System.out.println("당신의 학점은" + grade + "입니다.");
	}
	

}

