package d20191227_OOP;

/*
 + 고양이와 강아지의 공통속성을 추출해서 동물이라는 클래스를 생성
- 이 속성들을 고양이와 강아지 객체에게 상속하기로 했다.

출력
 - (고양이 이름)는 물고기를 먹는다. 살금살금 걷는다. 호흡한다.
 - (강아지 이름)는 사료를 먹는다. 터벅터벅 걷는다. 호흡한다.

변수 : name, food
method 명 : eat() , walking(), breathe()

구현 클래스 : ExtendsMain3.java

데이터 전달 - 생성자
 */

public class ExtendsMain3 {
	public static void main(String[] args) {
		Cat cat = new Cat("고양이", "물고기");
		cat.eat();
		cat.walking("살금살금");
		cat.breathe();
		
		System.out.println("======================================");
		
		Dog dog = new Dog("강아지", "사료");
		dog.eat();
		dog.walking("터벅터벅");
		dog.breathe();
		
	}
	
}
