package d20191226_Class;

// 구구단 3단만 출력해보세요 - OOP형태로
// g.print();

public class Gugudan {
	// 멤버 변수 선언
	int dan;
	
	// 생성자
	public Gugudan() {
		this.dan = (int)(Math.random()*9+1);
	}
	
	// 멤버 메소드
	public void print() {
		// 구구단 로직
		if(dan == 1) {
			this.dan = (int)(Math.random()*9+1);
		}else {
			System.out.println(dan + "단");
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
			System.out.println();
			
		}
	}
	
	// 메인
	public static void main(String[] args) {
		Gugudan g = new Gugudan();
		g.print();
	}

}
