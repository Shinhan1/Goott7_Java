package d20191230_OOP_interface_Abstract;

public class Terran {
	//멤버변수
	int x, y, hp, 방어력, 시야, 이동속도, 공격속도, 사거리;
	
	
	//생성자
	public Terran() {
		this.x = 0; this.y=0;
		this.hp = 100;
		this.방어력 = 2; this.시야 = 2;
		this.이동속도 = 3; this.공격속도 = 2; this.사거리 = 1;
	}	
	
	//멤버메소드
	void 이동하기(int a, int b) {
		this.x = a;
		this.y = b;
		System.out.println("x : y ===> " + x + " : " + y);
	}
	void 패트롤() {
		System.out.println("순찰 중 이상 무!");
	}
	void 홀드() {
		System.out.println("붕쉐~");
	}
	
}
