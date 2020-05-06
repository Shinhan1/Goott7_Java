package d20191230_OOP_interface_Abstract;

public class 토끼 extends 포유류 {

	@Override
	public void 먹기() {
		System.out.println("토끼는 배추를 먹어요");
	}

	@Override
	public void 자기() {
		System.out.println("토끼는 숲 속에서 자요");
	}

	@Override
	public void 태생() {
		System.out.println("토끼는 새끼를 낳아요");
	}
	public void 점프() {
		System.out.println("깡충깡충");
	}

}
