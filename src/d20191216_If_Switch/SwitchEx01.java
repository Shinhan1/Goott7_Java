package d20191216_If_Switch;

// Switch문
// 상대적으로  if문 보다 빠르다
// switch문의 조건이 제한적이지만 if문보다 조건을 파악하기 쉽다
// switch문은 key값이 필요 (보통 정수, 문자와 열거형도 허용)

public class SwitchEx01 {
	
	public static void main(String[] args) {
		// 1부터 5까지 숫자정보가 생성되면 해당 요일을 영문으로 출력해보세요
		int key = 1;
		
		String day = "";
		
		switch(key) {
			case 1:			// key 값이 1이면 MON
				day = "MON";
				break;
			case 2:			// key 값이 2이면 TUE
				day = "TUE";
				break;
			case 3:			// ......
				day = "WED";
				break;
			case 4:
				day = "THU";
				break;
			case 5:
				day = "FRI";
				break;
			default :
				System.out.println("Wrong number");
				break;
		}	// switch end
		
		System.out.println("Today is "+ day);
		
		
	}

}
