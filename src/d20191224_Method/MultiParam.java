package d20191224_Method;

import java.util.Scanner;

public class MultiParam { // 클래스 시작
	// 로그인
	
	void loginDemo(String id, int pw) {		// loginDemo() 시작
		// id가 java이고 pw가 1234이면 로그인 성공 메시지 출력
		if(id.equals("java") && pw == 1234) {		// 만약, id가 java이고 pw가 1234 일 때
			System.out.println("로그인 성공했습니다.");
		}else {			// 아닐때
			System.out.println("회원가입 하세요");
		}
	}	// logintDemo end
	
	public static void main(String[] args) {	// 메인 시작
		
		System.out.println("로그인 하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String str = scan.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		int pw = scan.nextInt();
		
		MultiParam mp = new MultiParam();
		mp.loginDemo(str, pw);
		
		
	}	// 메인 종료
	

}	// 클래스 종료

