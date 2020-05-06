package d20191216_If_Switch;
import java.util.*;

// 학점 구하는 switch 문
// 사용자로부터 성적을 입력 받은 후
// 당신의 학점은 ~~ 입니다. 출력

public class SwitchEx02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요");
		int score = scan.nextInt();
		
		/*
		String grade = "";
		int key = score/10;
		
		switch(key) {
		
		case 10: case 9:
			grade = "A"; break;
		case 8:
			grade = "B"; break;
		case 7:
			grade = "C"; break;
		case 6:
			grade = "D"; break;
		default :
			grade = "F"; break;
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		*/
		
		switch(score/10) {
		case 10: case 9:// 90에서 100의 학점은 A
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8:			// 80에서 89의 학점은 B
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:			// 70에서 79의 학점은 C
			System.out.println("당신의 학점은 C입니다.");
			break;		
		case 6: 		// 60에서 69의 학점은 D
			System.out.println("당신의 학점은 D입니다.");
			break;
		case 5: case 4: case 3: case 2: case 1: case 0: // 0에서 59의 학점은 F
			System.out.println("당신의 학점은 F입니다.");
		default :			// 100점을 초과하는 성적
			System.out.println("성적을 잘못 적으셨습니다.");
			break;
		
			
		}
		
		
		
	}

}
