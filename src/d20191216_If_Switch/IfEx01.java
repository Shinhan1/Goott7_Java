package d20191216_If_Switch;

// 조건문(분기문)
public class IfEx01 {
	
	public static void main(String[] args) {
		int x = 50;
		int y = 100;
		
		// if문
		if (x < y) {
			// 조건이 참이면 수행
			System.out.println("x는 y보다 작습니다");
			
			
		}
		
		System.out.println("----- -----------------");
		
		if(x == y) { // x와 y가 같으면 수행
			System.out.println("x는 y와 같습니다.");
			
		}
		else		// x와 y가 같지 않으면 수행
			System.out.println("x는 y와 다릅니다.");
		
	}
	

}
