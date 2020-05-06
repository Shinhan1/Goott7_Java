package d20191227_OOP;

public class Man {
	private String name;			//접근 한정자 //부모의 private한 변수는 상속 안됨.
	
	Man(String name) { 				//오버로딩 생성자.
		this.name = name;
	}
	
	void tellName() {
		System.out.println("Name is "+ name);
	}
	
}
