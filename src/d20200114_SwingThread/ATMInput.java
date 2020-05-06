package d20200114_SwingThread;

public class ATMInput implements Runnable {
	
	private Account ant;
	
	public ATMInput(Account ant) {
		// TODO Auto-generated constructor stub
		this.ant = ant;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			if(i == 0) {
				ant.A0001 += 10000;
				System.out.println("최초 금액 10000원이 입금되었습니다.");
				System.out.println("현재 잔액은 " + ant.A0001 + "원 입니다.");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int value = ant.getMoney();
			ant.input(value);
			
		}
		
	}

}
