package d20191230_OOP_interface_Abstract;

public class 다람쥐 extends 포유류{
	int 꼬리;
	@Override
	public void 먹기() {
		System.out.println("다람쥐는 도토리를 먹어요");
	}

	@Override
	public void 자기() {
		System.out.println("다람쥐는 잘자요");
	}

	@Override
	public void 태생() {
		System.out.println("다람쥐는 새끼를 낳아요");
	}
	public void 나무오르기() {
		System.out.println("다람쥐가 나무를 영차영차 올라요");
	}
	
}
