package d20200108_Exception_Generic;

// extends - 확장 (자바 상속 개념과는 약간 다름)
// 1. 사람 관련 정보인데 갑자기 동물 관련 클래스가 생성이 된다면?
//  : 방지할 필요가 있으므로 generic을 통해 방지할 장치를 마련

// 3. 사람 관련 특성을 생성
interface Personable{};
interface Ranking{};

// 5. 원하는 클래스에 특성을 상속
class Stu implements Personable{};

class Emp implements Personable, Ranking{};

class Ani{};


// 4. generic 객체에 상속
class Per<T extends Personable> {		// 제너릭
	T info;
	
	public Per(T info) {
		this.info = info;
	}
}

public class GenericExtend {
	public static void main(String[] args) {
		Per<Stu> ps = new Per<Stu>(new Stu());		// 인터페이스 받은 것만 사용 가능
		System.out.println(ps);
		
		Per<Emp> pe = new Per<Emp>(new Emp());
		System.out.println(pe);
		
		/*
		Per<Ani> pa = new Per<Ani>(new Ani());		// 사람 객체만 사용하고 싶은데 동물이 나옴
		System.out.println(pa);
		
		=> 2. Per의 대상으로 Stu, Emp (사람 관련 객체만 사용하고 싶음)
		
		*/
		
		
		
		
		
	}

}
