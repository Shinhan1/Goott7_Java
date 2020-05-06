package d20191227_OOP;

public class Child extends Parent {				// 자식에서 부모로 향한다. (확장자)			
//	String  a = "자식";					//String 자료형 변수 a에 자식을 대입
//	
//	//메소드 생성
//	public void method () {
//		System.out.println(a + " 호출");
//		System.out.println("잔소리하기");
//	}											/////주석처리해도 자식은 부모로 부터 상속을 받아 사용한다.
	
	String b = "자식";
	
	public void c_method() {
		System.out.println(b + " 호출");
		System.out.println("클럽가기 ");
	}
	
//	@Override 			// 부모로 부터 물려받는 것을 바꿔쓸거라는 것을 선언. (오버라이딩) 
//
//	public void method() {
//		 System.out.println(b + " 클래스에서");
//		 System.out.println("자식은 동생에게 잔소리하기");
//	}
	
	
	@Override
	public void method() {
		System.out.println(b + "클래스에서");
		//super : 부모를 가리키는 참조변수 (키워드)
		System.out.println("super.a : " + super.a + " 변수 호출");
		System.out.println("자식은 동생에게 잔소리하기");
		
		
	}
	
	
	
	
}		//class end
