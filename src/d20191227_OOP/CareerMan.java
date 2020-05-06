package d20191227_OOP;

// 직책과 직위는 알 수 있고 더해서 이름도 알고 싶다면?

public class CareerMan extends Man{				//Man이라는 부모 클래스는 CareerMan 자식에게 상속한다.
	String job;
	String position;
	
//	public CareerMan(String job, String position) {			//오버로딩 생성자.
//		this.job = job;
//		this.position = position;
//		
//	}
	
	public CareerMan(String name, String job, String position) {
		super(name);					//이름은 [super = 부모클래스]로 보내서 처리.
		this.job = job;
		this.position = position;
	}
	
	
	//메소드 선언
	void tellInfo() {
		System.out.println("Job is "+ job);
		System.out.println("Position is "+ position);
		tellName();											//부모가 가지고 있는 메소드를 가져와서 사용. 
	}
	
	
}		//class end
