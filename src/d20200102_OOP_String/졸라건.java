package d20200102_OOP_String;

public class 졸라건 implements Weapon {

	int 총알;

	졸라건() {		// 졸라건 생성자
		this.총알 = 10;
	}
	졸라건(int x) {	// 졸라건 생성자
		this.총알 = x;		// 총알 지정
	}
	
	@Override
	public void attack() {		// attack 메소드
		// TODO Auto-generated method stub
		System.out.println("빵~!");
		총알 --;		// 공격할 때마다 총알 개수 감소
		
	}

	@Override
	public void repair() {		// repair 메소드
		// TODO Auto-generated method stub
		System.out.println("뚝딱 뚝딱");
		
	}

	@Override
	public void upgrade() {		// upgrade 메소드
		// TODO Auto-generated method stub
		System.out.println("스킨 바꾸기");
		
	}
	
	public void 재장전() {		// 재장전 메소드
		총알 = 100;				// 100발
	}
	
}
