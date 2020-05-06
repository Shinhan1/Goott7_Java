package d20191227_OOP;

public class 메딕 {
	// 멤버변수
	int x, y;
	int hp;
	int 이동속도, 시야;
	int 치료력, mp, 방어력;
	
	// 생성자
	public 메딕() {
		this.x = 0; this.y = 0;
		this.hp = 90;
		this.치료력 = 2; this.방어력 = 1;
		this.시야 = 1; this.이동속도 = 2;
		this.mp = 50;
	}
	
	// 멤버 메소드
	void 이동하기(int a, int b) {
		this.x = a;
		this.y = b;
		System.out.println("열심히 따라 가기 " + x + " : " + y);
	}
	
	void 패트롤() {
		System.out.println("순찰 중~");
	}
	
	void 홀드() {
		System.out.println("근무 중 이상 무");
	}
	
	void status() {
		System.out.println("--------상태보기--------");
		System.out.println("hp : "+ hp);
		System.out.println("mp : "+ mp);
		System.out.println("(x, y) : " + x + " : " + y);
		System.out.println("이동속도 : " + 이동속도);
		
	}
	
	void 치료하기(마린 x) {
		System.out.println("x : " + x);
		x.hp += 치료력;
		this.mp -= 5;
		
		if(x.hp >100) x.hp = 100;
		System.out.println("치료중");
	}
	
}
