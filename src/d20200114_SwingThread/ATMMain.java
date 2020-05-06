package d20200114_SwingThread;

/* 
 *  A0001 계좌에 현재 잔액이 1000원 입니다.
 * 
 *  이 계좌명을 홍길동으로 하고 최초 10000원을 입금합니다.
 *  
 *  그리고 총 10번을 각각 실행
 *  (입, 출금이 랜덤하게 1 ~ 10000원 사이)
 *  
 *  입력시
 *   : ~~~ 입금되었습니다.
 *   : 총 잔액은 ~~~입니다.
 *   
 *  출금시
 *   : ~~~ 출금되었습니다.
 *   : 현재 잔액은 ~~~ 입니다.
 *  
 *  잔액이 부족합니다.
 *  
 */

public class ATMMain {
	
	public static void main(String[] args) {
		Account ant = new Account();
		ATMInput aip = new ATMInput(ant);
		ATMOutput aop = new ATMOutput(ant);
		
		
		Thread th1 = new Thread(aip);
		Thread th2 = new Thread(aop);
		ant.Money();
		
		th1.start();
		th2.start();
		
	}

}
