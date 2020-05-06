package d20191226_Class;

public class Human {
	// 멤버변수
	int 눈;
	int 코;
	int 입;
	int iq;
	
	String 성별;
	int 나이;
	
	double 키;
	double 몸무게;
	
	String 이름;
	
	// 생성자
	Human() {		// 기본 생성자 : 매개 변수가 없는 생성자
		눈 = 10;
		코 = 9;
		입 = 8;
		iq = 200;
		나이 = 25;
		키 = 173.5;
		몸무게 = 68.5;

		이름 = "홍길동";
		성별 = "남";
		
		System.out.println("생성자 호출");
	}
	
	// 내 클래스를 사용할 사람들(개발자)을 위해서 다양한 생성자를 갖는 클래스로 작성하는 것을 권장
	
	
	// 생성자 오버로딩
	// 이름, 성별을 수정할 수 있는 생성자 오버로딩
	// 출력 : 유관순, 여성
	Human(String 이름, String 성별) {
		눈 = 10;
		코 = 9;
		입 = 8;
		iq = 200;
		나이 = 25;
		키 = 173.5;
		몸무게 = 68.5;

		
		this.이름 = 이름;
		this.성별 = 성별;
	}
	
	// 이름, 성별, 키를 다른 사용자가 초기화 하는 생성자
	Human(String str1, String str2, double d){
		눈 = 10;
		코 = 9;
		입 = 8;
		iq = 200;
		나이 = 25;
		키 = 173.5;
		몸무게 = 68.5;
		
		this.이름 = str1;
		this.성별 = str2;
		this.키 = d;
		System.out.println("생성자 호출");
	}

	Human(String 이름, String 성별, double 키, double 몸무게, int 나이) {
		// 생성자 : 멤버 변수를 초기화
		// 멤버 변수명 = 매개변수명;
		// this.멤버변수명 = 매개변수명; (권장)
		
		this(이름, 성별, 키);
		
		this.몸무게 = 몸무게;
		this.나이 = 나이;
	}
	
	
	// 멤버 메소드
	void 먹기() {
		System.out.println("삼시세끼를 먹어요");
	}
	
	void 자기() {
		System.out.println("하루 8시간은 자야 해요");
	}
	
	void 걷기() {
		System.out.println("하나 둘 하나 둘");
	}
	
	void 생각하기() {
		System.out.println("멍~");
	}

	void 코딩하기() {
		System.out.println("와. 재. 밌. 다. : ctrl+c ctrl+v");
	}
	
}
