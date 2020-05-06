package d20191227_OOP;

public class Marine extends Teran{
	// 멤버 변수
	int 공격력;
	
	public Marine() {
		// super();						// 부모 클래스 생성자 실행(사용) ==> 생략가능
		
		this.공격력 = 5;
	}
	void 공격하기(Teran t) {
		// 매개변수를 Teran(부모클래스)로 지정하면
		// Teran을 부모로 갖는 모든 자식 클래스를 공격할 수 있음
		
		t.hp -= 공격력;
		System.out.println("탕~");
	}

}
