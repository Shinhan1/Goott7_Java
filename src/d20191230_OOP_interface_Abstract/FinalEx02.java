package d20191230_OOP_interface_Abstract;

interface Fruit2{
	// 인터페이스 : 추상메소드와 상수만이 존재함.
	final static int APPLE = 1;
	final static int BANANA = 2;
	final static int PEACH = 3;	
}

interface Company2{
	final static int AMAZON = 1;
	final static int GOOGLE = 2;
	final static int APPLE = 3;
}

public class FinalEx02 {
	public static void main(String[] args) {
		int type = Fruit2.APPLE;
		
		type = Company.APPLE; // 3
		
		switch(type) {
		case Fruit.APPLE : System.out.println("사과"); break;
		case Fruit.BANANA : System.out.println("버내나"); break;
		case Fruit.PEACH : System.out.println("복쑹아"); break; //당첨
		}
	}
}
