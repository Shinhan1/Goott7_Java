package d20200102_OOP_String;

public class TestMain {
	public static void main(String[] args) {
		
		Gun g = new Gun();			// Gun클래스 변수 선언
		광선검 b = new 광선검();		// 광선검 클래스 변수 선언
		수류탄 gr = new 수류탄();		// 수류탄 클래스 변수 선언
		
		졸라맨 j = new 졸라맨(g);		// 졸래만 클래스 변수에 Weapon의 자식인 g를 줌
		j.walk();					// 행동들
		j.변신하기();
		j.공격하기();
		
		System.out.println(g.총알);	// 총알 수
		
		System.out.println("-------------------------------------------");
		// 1. 졸라맨이 졸라건을 사용할 수 있도록 하기
		// 2. 변신 후 공격하고 재 장전하면 총알이 100발 되기
		
		졸라건 g1 = new 졸라건(100);	// 졸라건 총알을 100발로 지정
		졸라맨 j1 = new 졸라맨(g1);		// 졸라맨 객체 하나 생성
		j1.walk();					// 행동들
		j1.변신하기();
		j1.공격하기();
		j1.공격하기();
		
		System.out.println(g1.총알);	// 총알 수
		
		g1.재장전();					// 행동
		System.out.println(g1.총알);	// 총알 수
		
		
		
		
	}
}
