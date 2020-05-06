package d20191230_OOP_interface_Abstract;

public class Marine extends Terran implements Flyable{
	//멤버변수
	int x,y;
	int hp,att,range,armo; // 피,공,방,사거리
	int speed,atksp,vision;//이속,공속,시야
	
	//생성자
	public Marine(){ // private 권고  :메소드를통해 변수에 접근할수있도록해야함 (직접 변수접근 x)
		this.x=0;
		this.y=0;
		this.hp=100;
		this.att=5; this.armo=0; this.range=1;
		this.speed=3; this.atksp=2; this.vision=2;
	}
	
	//생성자 오버로딩 -> 영웅마린 만들기	
	public Marine(int hp) {
		this();// <-기본생성자 실행
		this.hp = hp; // <- hp변경할려고 한것
	}
	
	//멤버매소드
	void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("( "+x+" , "+y+" ) 로 이동중");
	}	
	void patrol() {
		System.out.println("patroling. . .");
	}	
	void hold() {
		System.out.println("Holding position. . . ");
	}
	void stasus() {
		System.out.println("--------Status-------");
		
		System.out.println("HP :"+hp);
		System.out.println("Location :"+"( "+x+" , "+y+" )");
		System.out.println("ATKSPEED : "+atksp);
		System.out.println("SPEED : "+speed);
	}
	void 공격하기(Marine x) {
		System.out.println("x : " + x);
		x.hp -= att;
		System.out.println("탕탕! 탕!");
		System.out.println("x.hp = " +x.hp);
	}

	@Override
	public void 비행() {
		System.out.println("날개를달아줘요 마린");
	}


}
