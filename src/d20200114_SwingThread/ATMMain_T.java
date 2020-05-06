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

public class ATMMain_T {
	
	public static void main(String[] args) {
		ATM_T atm = new ATM_T("홍길동", 10000);
		ATMThread_T th1 = new ATMThread_T(atm);
		th1.start();
	}

}
