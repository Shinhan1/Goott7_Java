package d20191227_OOP;

public class Animal {
	// 멤버 변수
	String name;
	String food;
	
	// 생성자
	Animal(String name, String food) {
		this.name = name;
		this.food = food;
	}															//오버로딩.
	
	
	// 멤버 메소드
	void eat() {
		System.out.println(this.name + "가 "+ this.food + "를 먹는다.");
	}
	void walking(String str) {									//call by value
		System.out.println(this.name + "가 "+ str + " 걷는다.");
	}
	void breathe() {
		System.out.println(this.name + "가 호흡한다.");
	}
																						//동물의 공통된 특성들을 모아놓았다.
}			//class end
