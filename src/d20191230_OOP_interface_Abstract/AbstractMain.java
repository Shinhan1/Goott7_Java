package d20191230_OOP_interface_Abstract;


public class AbstractMain {
	public static void main(String[] args) {
		
//		포유류 po = new 포유류(); // -> 에러남 : 스스로 행위를 할 수 없기 때문에! 실체화(인스턴스화)할 수 없다.
//		조류 bird = new 조류(); // -> ㄱㅊ
		
		토끼 r = new 토끼();
		고래 w = new 고래();
		다람쥐 s = new 다람쥐();
		
		r.먹기();
		w.헤엄치기();
		s.나무오르기();	
		
		//말 한마릴 만들어서 말이 먹고, 달리기 해보세요
		System.out.println("----------------");
		말 h = new 말();
		h.달리기();
		
		
		
		
	}
}
