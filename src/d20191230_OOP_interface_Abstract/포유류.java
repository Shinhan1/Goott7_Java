package d20191230_OOP_interface_Abstract;

// 추상 클래스
// abstract class 클래스명
// new로 객체생성을 할 수없는 클래스
// 객체화, 인스턴스화 할 수 없는 클래스
public abstract class 포유류 { 
	int 눈;
	int 코;
	int 입;
	String 성별;
	
	//추상클래스는 행위를 할 수 없는 클래스!
	// 메소드가 행위를 가져서는 안된다.
	// 미구현 메소드 : 메소드바디{}가 없는 메소드로 만들어야 함.
	//			-> 추상 메소드
	
	//public abstract void 먹기() {} //-> 에러남
	// 추상메소드를 1개 이상 갖는 클래스는 반드시 추상 클래스 이어야 한다.
	public abstract void 먹기(); //->추상메소드
	public abstract void 자기();
	public abstract void 태생();
	
}
