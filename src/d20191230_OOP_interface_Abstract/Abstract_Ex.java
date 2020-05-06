package d20191230_OOP_interface_Abstract;

abstract class AA {
	void aaa() {
		System.out.println("클래스 aaa Method");
	}
	
	abstract void aaaa(); // (추상메소드이기 때문에 클래스도 추상클래스여야 함)
}

class BB extends AA{

	@Override
	void aaaa() {
		System.out.println("BB클래스 : 추상메소드 오버라이드한 aaaa Method");
	}
	void bbb() {
		System.out.println("BB 클래스 : bbb Method");
	}	
}

class CC extends AA{

	@Override
	void aaaa() {
		System.out.println("CC 클래스 : 추상메소드 override한 aaaa Method");
	}
	void ccc() {
		System.out.println("Cc 클래스 : ccc Method");
	}
	
}
	
public class Abstract_Ex{
	public static void main(String[] args) {
//		AA a = new AA();     -> 추상 클래스는 인스턴스화 할 수 없음
		BB b = new BB();
		b.bbb();
		b.aaaa(); 
		
		b.aaa(); 			//	-> 상속받은 메소드 사용
		System.out.println("---------------------");
		
		CC c = new CC();
		c.aaaa();
		c.ccc();
		c.aaa(); 			// -> 상속받은 메소드 
	}
}


	