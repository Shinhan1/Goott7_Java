package d20200114_SwingThread;

import java.util.Random;

public class Account {
	private String account, accountName;
	int A0001;
	Random rnd = new Random();
	
	public Account() {
		// TODO Auto-generated constructor stub
		this.account = "A0001";
		this.accountName = "홍길동";
		this.A0001 = 1000;
	}
	
	public Integer getMoney() {
		int value = rnd.nextInt(10000)+1;
		
		return value;
	}
	public void Money() {
		System.out.println(accountName + "님의 계좌 A0001");
		System.out.println("------ 최초 잔액 ------");
	}
	
	public synchronized Integer input(int value) {
		A0001 += value;
		System.out.println("------ 입금 ------");
		System.out.println(value + "원이 입금되었습니다.");
		System.out.println("현재 잔액은 " + A0001 + "원 입니다.");
		notifyAll();
		
		return A0001;
		
	}
	
	public synchronized Integer output(int value) {
		A0001 -= value;
		System.out.println("------ 출금 ------");
		if(A0001 <= 0) {
			System.out.println(value + "원이 출금되야 하지만 잔액이 부족합니다.");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println(value + "원이 출급되었습니다.");
			System.out.println("현재 잔액은 " + A0001 + "원 입니다.");
		}
		return A0001;
	}

}
