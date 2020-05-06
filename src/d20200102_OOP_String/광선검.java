package d20200102_OOP_String;

public class 광선검 implements Weapon {

	String 레이저색;
	
	광선검() {		// 광선검 생성자
		this.레이저색 = "white";
	}
	
	광선검(String color) {	// 광선검 생성자
		this.레이저색 = color;
	}
	
	@Override
	public void attack() {		// attack 메소드
		// TODO Auto-generated method stub
		System.out.println("내 칼을 받아라~!!");
		
	}

	@Override
	public void repair() {		// repaid 메소드
		// TODO Auto-generated method stub
		System.out.println("뚝딱 뚝딱");
		
	}

	@Override
	public void upgrade() {		// upgrade 메소드
		// TODO Auto-generated method stub
		System.out.println("레이저가 더 두꺼워짐");
	}
	
	
	

}
