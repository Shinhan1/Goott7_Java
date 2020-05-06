package d20191223_Arr;

// 클래스	: 하나의 클래스는 메모리 할당 시 다양한 값을 가지고 있을 수 있고 객체라고 부릅니다.
//		: 하나의 객체는 독립적으로 사용됩니다.


public class Car {
	
	// 특성 (성질)		멤버 변수
	String manf = "롤스로이스";	
	String engine = "16기통";
	String name = "팬텀";
	String wheel = "20인치";

	// 행동 (행위) - 메소드
	void go() {
		System.out.println("와 되게 빠름....");		
	}
	
	void back() {
		System.out.println("와 후방 카메라....");
	}

	void stop() { 
		System.out.println("와 잘 멈춤 ....");
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println("car : " + car);
		
		String carManf = car.manf;
		System.out.println(carManf);
		System.out.println(car.manf);
		car.go();
		car.back();
		car.stop();
		
	}
	
	
}		// Car class end


