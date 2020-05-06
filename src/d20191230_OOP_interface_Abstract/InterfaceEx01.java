package d20191230_OOP_interface_Abstract;

public interface InterfaceEx01 {
	// 인터페이스는 추상메소드와 상수만이 존재함
	
	public void calculate(); // abstract가 생략된 형태(언제나 추상메소드 이므로)
	public int NUM = 100; // 상수 -> 관례적으로 대문자로 표현함.	
}
