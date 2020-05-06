package d20191226_Class;

import java.util.Scanner;
// id(java), pw(1234) 입력받아서 로그인 하기

public class MultiReturn {	// MultiReturn Class 시작
	
	public static void main(String[] args) {		// main() 시작
		System.out.println("로그인 하시겠습니까? ");
		Scanner scan = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");
		String id = scan.nextLine();
		System.out.print("PW를 입력하세요 : ");
		int pw = scan.nextInt();
		
		LoginTest lt = new LoginTest();	// lt 매개변수 선언
		boolean login = lt.loginCheck(id, pw);		// call by value형태
		lt.loginMessage(login);
		
		// System.out.println("" + id + " , " + pw);
	}	// main() 종료

}	// MultiReturn Class 종료

class LoginTest {	// LoginTest Class 시작
	public boolean loginCheck(String id, int pw) {		// loginCheck() 시작
		// id : java, pw : 1234이면 true 아니면 false
		boolean login = false;
		
		if(id.equals("java") && pw == 1234) {
			login = true;
		}
		return login;		// login 반환
		
	}	// loginCheck() 종료

	public void loginMessage(boolean check) {		// void형(return값 x) loginMessage() 시작
		if(check) {
			System.out.println("로그인에 성공하셨습니다.");
		}else
			System.out.println("로그인에 실패하셨습니다.\n회원가입을 해주세요.");
		
	}		// loginMessage() 종료
	
}



