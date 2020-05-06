package d20191230_OOP_interface_Abstract;

class Fruit3{
	public final static Fruit3 APPLE = new Fruit3("사과");
	public final static Fruit3 BANANA = new Fruit3("바나나");
	public final static Fruit3 PEACH = new Fruit3("복숭아");
	
	String msg;
	public Fruit3(String fruit) { // --- 메소드를 이용해서 데이터 삽입
		this.msg = fruit;
	}
}

class Company3{
	public final static Company3 AMAZON  = new Company3("아마존");
	public final static Company3 GOOGLE  = new Company3("구글");
	public final static Company3 APPLE  = new Company3("애플");	
	
	String msg2;
	public Company3(String Company) { // --- 메소드를 이용해서 데이터 삽입
		this.msg2 = Company;
	}
}

public class FinalEx03 {
	public static void main(String[] args) {
				
		Fruit3 type = Fruit3.APPLE; //    -> 3 
		
//		type = Company3.APPLE; // 상수화가 더 확실시(아직 내실력에 못함)
		
//		System.out.println(type); --- type가 주소값으로 나와서 스위치문 불가능 -> if문 사용하셈
		
		if(type.equals(Fruit3.APPLE)) {				//-->>   type == Fruit3.APPLE이면
			System.out.println(Fruit3.APPLE.msg);
		}
		else if(type.equals(Fruit3.BANANA.msg)) {
			System.out.println(Fruit3.BANANA.msg);
		}
		else {
			System.out.println(Fruit3.PEACH.msg);
		}
	}	
}
