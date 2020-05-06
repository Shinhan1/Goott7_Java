package d20191216_If_Switch;

public class SwitchBasic {
	
	public static void main(String[] args) {
		
		int num = 2;
		
		switch(num) {		// 조건문 switch
			case 1:			// num이 1이면 출력
				System.out.println("Switch case 1 : Wow Java");
			case 2:			// num이 2면 출력
				System.out.println("switch case 2 : Happy Java");
			case 3:			// ......
				System.out.println("Switch case 3 : Fantasy Java");
			default :
				System.out.println("Switch default : Simple Java");
		}
		
	}

}
