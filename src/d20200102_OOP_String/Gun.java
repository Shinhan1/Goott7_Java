package d20200102_OOP_String;

public class Gun implements Weapon {

	int 총알;
	
	Gun() {			//Gun 생성자
		this.총알 = 6;
	}
	
	@Override
	public void attack() {		// attack 메소드
		System.out.println("빵 ~!!");
		총알 --;
		
	}

	@Override
	public void repair() {		// repair 메소드
		System.out.println("뚝딱 뚝딱");
	}

	@Override
	public void upgrade() {		// upgrade 메소드
		// TODO Auto-generated method stub
		System.out.println("현질 후 스킨이 바뀜");
		
	}
	
	public void 재장전() {		// 재장전 메소드
		this.총알 = 6;
	}
	
	

}
