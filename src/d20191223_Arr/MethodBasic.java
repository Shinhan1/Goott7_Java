package d20191223_Arr;

// 메소드 (함수) : 멤버 변수(데이터)를 조작하고 처리하는 역할
// 메소드 대상 : 2번 이상 호출되는 로직이나 향후 호출될 가능성이 있는 로직

// void (공허한, 비어있는) : 리턴되는 값이 없는 메소드형

public class MethodBasic {
	
	void helloMethod() {
		System.out.println("메소드 코드블럭 첫번째 줄");
		System.out.println("메소드 코드블럭 종료");
	}

	public static void main(String[] args) {
		System.out.println("-----메소드 진행 이해하기-----");
		MethodBasic mb = new MethodBasic();
		
		mb.helloMethod();
		
		System.out.println("메인메소드 종료");
	}
	
}
