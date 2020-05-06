package d20191226_Class;

public class Computer {
	// 1. 멤버 변수(필드)
	int keyboard;
	
	float monitor;
	double mouse;
	double 본체;
	
	// 2. 생성자
	Computer() {		// 생성자 오버로딩
		keyboard = 11;
		monitor = 17.3f;
		mouse = 3.2;
		본체 = 10.2;
	}
	Computer(int num) {
		keyboard = num;
		monitor = 17.3f;
		mouse = 3.2;
		본체 = 10.2;
	}
	Computer(int num, double d) {
		keyboard = num;
		monitor = 17.3f;
		mouse = d;
		본체 = 10.2;
		this.keyboard = num;
		this.mouse = d;
	}
	
	
	// 3. 멤버 메소드
	void 연산하기() {
		System.out.println("연산을 열심히 합니다.");
	}
	
	void 전원켜기() {
		System.out.println("안녕하세요.");
	}
	
	void 전원끄기() {
		System.out.println("띵띵 띠리링");
	}
	
	void 인터넷하기() {
		System.out.println("클릭~~");
	}
	
	void 코딩하기() {
		System.out.println("ctrl+c ctrl+v");
	}
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.전원켜기();
		System.out.println(c1.monitor);
		c1.연산하기();
		

	}

}
