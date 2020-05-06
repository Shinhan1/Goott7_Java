package d20191224_Method;

public class Sungjuk {		// 클래스 시작
	
	void hap () {		// 메소드 시작
		int kor = 90;
		int eng = 100;
		
		int tot = kor + eng;
		
		System.out.println("합계 : " + tot);
	}		// 메소드 끝
	
	public static void main(String[] args) {		// 메인 시작
		Sungjuk sj = new Sungjuk();	
		sj.hap();			// Call By Name 형태
		
	}		// 메인 끝

}		// 클래스 끝
