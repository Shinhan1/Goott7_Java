package d20191230_OOP_interface_Abstract;

public class 말 extends 포유류 {

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

}
