package d20191224_Method;

public class Sungjuk2 { 		// 클래스 시작
	
	void hap (int kor, int eng)	{		// 메소드 시작
		int tot = kor + eng;
		
		System.out.println("합계 : " + tot);		
	}		// 메소드 끝
	
	
	public static void main(String[] args) {		// 메인 시작
		Sungjuk2 sj2 = new Sungjuk2();
		sj2.hap(90, 100);			// Call by Value 형태
	}		// 메인 끝	

}		// 클래스 끝
