package d20191226_Class;

/* 
 *	캡슐화 : 객체를 하나의 캡슐처럼 안전하게 하자 (정보은닉)
 *
 * 	- 멤버 변수는 private 처리, getter/setter를 통해 접근 (기본)
 * 	  +
 * 	  setter에 권한이 있는 검사, 검사기록을 생성해서 더 넣어
 * 
 * 	  => 캡슐화가 완성 
 */

public class Data {
	private String name = "유관순";
	private double sal = 0;
	
	// setter : 멤버변수에 값을 대입
	public void setName(String name) {
		this.name = name;
	}
	
	// getter : 멤버변수 값을 가져오는 메소드
	public String getName() {
		return "* " + this.name + "  *";
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getSal() {
		return (int)this.sal;
	}
	/*
	public double getSal() {
		return (sal*1.05);
	}
	*/
}
