package d20200102_OOP_String;

/*
 * 	public class 졸라맨 extends Gun
 *   - 논리적으로 사람객체의 부모가 Gun이 되는 이상한 관계
 *  is - a 관계 : 상속 관계
 *  has - a 관계 : 멤버변수로 객체를 사용
 *  		   : 상속이 아니므로 내 후손들은 멤버변수로 선언한 객체를 안써도 됨
 */

public class 졸라맨{
	int 머리;
	int 팔;
	int 다리;
	
	// 클래스(객체)도 멤버 변수로 사용 가능
	/*
	Gun g;
	광선검 b;
	수류탄 gr;
	*/
	
	Weapon w;			// implements를 활용해 한번에 Weapon 변수 선언
	
	졸라맨(Weapon w) {	// 생성자에 weapon을 받음
		this.w = w;
	}
	
	public void 공격하기() {		// 공격 메소드
		if(w != null) {			// w가 null이 아니면
			w.attack();			// 공격
		}else 					// null 이면
			System.out.println("원투 원투");		// 주먹으로라도 공격
	}
	
	public void walk() {		// 이동
		System.out.println("walk walk");
	}
	
	public void talk() {		// 얘기
		System.out.println("talk talk");
	}
	
	public void 변신하기() {		// 변신
		System.out.println("사랑과 정의를 지키는 졸라맨~~~");
	}
	
	
}
