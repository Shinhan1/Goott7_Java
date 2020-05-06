package d20191224_Method;

import java.util.Scanner;

// SwitchEx03과 같은 결과가 나오도록 처리해보세요

public class MethodParam {		// 클래스 시작
	
	void paramDemo(int kor, int eng, int math) {		// paramDemo메소드 시작
		int sum = kor + eng + math;		// 총합
		int avg = sum/3;				// 평균
		
		String grade = "";		// grade 변수 선언
		
		switch(avg/10) {			// 평균을 10으로 나눴을 떄 
		case 10: case 9: grade = "A"; break;		// 9 ~ 10 일경우 grade A로 초기화
		case 8: grade = "B"; break;					// ...
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F"; break;
		}
		System.out.println("당신의 평균 점수는 : " + avg );
		System.out.println("당신의 학점은 " + grade + " 입니다.");
		
		
	}  //paramDemo() 종료
	

	public static void main(String[] args) {		// 메인 시작
		// 사용자로부터 점수 입력을 받습니다.
		
		// Call By Value 형태로 메소드를 호출하여 결과 (평균점수와 학점 출력)
		// 메소드명 : paramDemo()
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");		
		int kor = scan.nextInt();						// 국어 점수 입력
		System.out.println("영어 점수를 입력하세요");		
		int eng = scan.nextInt();						// 영어 점수 입력
		System.out.println("수학 점수를 입력하세요");		
		int math = scan.nextInt();	
		
		MethodParam pd = new MethodParam();		// 변수 선언
		pd.paramDemo(kor, eng, math);			// 변수 pd의 paramDemo라는 메소드를 가져옴
		
	}	// 메인 종료

}		// 클래스 종료
