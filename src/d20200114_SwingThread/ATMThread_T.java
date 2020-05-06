package d20200114_SwingThread;

import java.util.Random;

public class ATMThread_T extends Thread {
	
	ATM_T atm;
	Random rnd = new Random();
	
	public ATMThread_T(ATM_T atm) {
		this.atm = atm;
		
	}
	
	@Override
	public void run() {
		boolean flag = false;
		
		//10번 입, 출금액이 랜덤하게 실행
		for(int i = 1; i <= 10; i++) {
			int money = rnd.nextInt(10000);
			
			if(!flag) {
				atm.deposit(money);
			}else {
				atm.withDraw(money);
			}
			
			flag = !flag;
			
		}
		
		
		
	}

}
