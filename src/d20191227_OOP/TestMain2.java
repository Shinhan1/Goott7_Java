package d20191227_OOP;

public class TestMain2 {
	
	public static void main(String[] args) {
		메딕 me = new 메딕();
		me.이동하기(400, 300);
		me.status();
		
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		
		// super marine이 필요함 : 특성 - hp만 500
		// SuperMarine sm = new SuperMarine();
		// sm.hp <-- 500
		
		마린 sp = new 마린(500);
		sp.status();
		
		System.out.println("----------------------------------");
		
		마린 m3 = m1;
		m3.hp = 50;
		
		System.out.println("m1.hp : " + m1.hp + " " + m1);		
		System.out.println("m2.hp : " + m2.hp + " " + m2);
		System.out.println("m3.hp : " + m3.hp + " " + m3);
		
		System.out.println("----------------------------------");
		
		// 마린 객체가 공격하기가 필요
		m1.공격하기(m2);
		m2.status();
		
		// 메딕 객체가 치료하기가 필요
		// m2를 치료해보세요
		// m2.status();
		
		me.치료하기(m2);
		m2.status();
		me.status();
		
		
		
	}

}
