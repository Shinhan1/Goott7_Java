package d20200102_OOP_String;

public class 수류탄 implements Weapon {
	
	boolean 안전핀;
	int 안전시간;
	double 살상범위;
	
	public 수류탄() {		// 수류탄 생성자
		this.안전시간 = 5;
		this.살상범위 = 50.0;
		
	}
	

	@Override
	public void attack() {		// attack 메소드
		// TODO Auto-generated method stub
		System.out.println("셋 둘 하나 ~ 투척");
		
	}

	@Override
	public void repair() {		// repair 메소드
		// TODO Auto-generated method stub
		System.out.println("안전핀 결합");
		
	}

	@Override
	public void upgrade() {		// upgrade 메소드
		// TODO Auto-generated method stub
		System.out.println("더 좋은 수류탄?");
	}
	
	

}
