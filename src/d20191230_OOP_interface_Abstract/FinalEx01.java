package d20191230_OOP_interface_Abstract;

/*
	final
	클래스 앞에 위치 : 상속 마지막(상속 불가)
	메소드 앞에 위치 : 마지막 메소드(오버라이드 금지)

*/


class Fruit{
	//사과 바나나 복숭아를 상수로 정의
	
	final static int APPLE = 1;
	final static int BANANA = 2;
	final static int PEACH = 3;
}

class Company{
	final static int AMAZON = 1;
	final static int GOOGLE = 2;
	final static int APPLE = 3;
}

public class FinalEx01 {
	public static void main(String[] args) {
		// 과일 분류를 위한 switch문
		
		/*
		 * Fruit f = new Fruit();
		 * 
		 * int type = f.APPLE;
		 */
		int type = Fruit.APPLE;
		System.out.println(type);
		
		switch(type) {
		case Fruit.APPLE : System.out.println("사과"); break;
		case Fruit.BANANA : System.out.println("버내나"); break;
		case Fruit.PEACH : System.out.println("복쑹아"); break;
		}
		
		//누군가가 Company.APPLE 호출하면?
		type = Company.APPLE;
		
		
	}
}
