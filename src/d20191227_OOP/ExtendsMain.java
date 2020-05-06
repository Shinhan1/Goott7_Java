package d20191227_OOP;

public class ExtendsMain {
	public static void main(String[] args) {
		Parent p = new Parent(); 		// 부모 인스턴스화.
		Child c = new Child();			// 자식 인스턴스화.
		
		System.out.println("p.a : "+ p.a);
		p.method();									//부모 클래스에서 호출
		
		System.out.println("--------------------------------------------");
		
		System.out.println("c.a : "+ c.a);
		c.method();									//자식 클래스는 부모에게 상속받은 메소드을 가지고 호출 [메소드 오버라이딩을 통해서 내용을 바꾸었다.]
		
		System.out.println("--------------------------------------------");
		
		System.out.println("c.b : "+ c.b);
		c.c_method();								//자식 클래스 에서 호출
		
	}
	
} // class end
