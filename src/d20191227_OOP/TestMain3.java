package d20191227_OOP;

public class TestMain3 {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		System.out.println("m2.hp : " + m2.hp);
		m1.공격하기(m2);
		System.out.println("m2.hp : " + m2.hp);
		
		
		// 같은 방식으로 Medic 객체 생성해서 m2를 치료해보세요
		
		Medic me = new Medic();
		System.out.println("me.mp : " + me.mp);
		
		me.치료하기(m2);
		System.out.println("m2.hp : " + m2.hp);
		System.out.println("me.mp : " + me.mp);
		
	}
}
