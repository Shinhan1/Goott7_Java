package d20191230_OOP_interface_Abstract;

public class Horse extends 포유류 implements Flyable{

	@Override
	public void 먹기() {
		System.out.println("말은 암거나 처먹어요");
	}

	@Override
	public void 자기() {
		System.out.println("말은 마굿간에서 자요");
	}

	@Override
	public void 태생() {
		System.out.println("말은 새끼를 낳지요");
	}
	
	public void 달리기() {
		System.out.println("난 앞만보고달려 직진밖에 몰라");
	}

	@Override
	public void 비행() {
		System.out.println("우와 말이 날개를 달았어요~");
	}

		
	

	
}
