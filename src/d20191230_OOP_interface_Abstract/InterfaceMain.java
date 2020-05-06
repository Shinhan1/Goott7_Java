package d20191230_OOP_interface_Abstract;

public class InterfaceMain {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.달리기();
		h.비행(); // 인터페이스에서 가져옴
		System.out.println("----------------------");
		// Marine객체를 생성해서 100,200 좌표로 이동한 후 비행시켜보기
		
		Marine m1 = new Marine();
		m1.move(100, 200);
		m1.비행();
		
		System.out.println("-----------------------");
		// Interface를 통해서 배열 사용
		
		Flyable[] fList = new Flyable[2];
		System.out.println("fList : "+ fList);
		
		//인터페이슨는 간접적인 상속(is - a)
		// 부모 - 자식 관계가 간접적으로 성립
		Flyable f = h;
		fList[0] = f;
		
		f = m1;
		fList[1] = f;
		
		for(int i=0; i<fList.length; i++) {
			fList[i].비행();
		}
		
	}
}
