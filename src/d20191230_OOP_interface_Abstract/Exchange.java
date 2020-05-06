package d20191230_OOP_interface_Abstract;

import java.util.Scanner;
public class Exchange {
	public void change(int value) {
		
		int oman = value/50000;
		int man = (value%50000)/10000;
		int ocheon = (value%10000)/5000; 
		int cheon = (value%5000)/1000;
		int obek = (value%1000)/500;
		int bek = (value%500)/100;
		int osib = (value%100)/50;
		int sib = (value%50)/10;
		
		System.out.println("----교환 금액----");
		System.out.println("5만원권 " + oman + "장 \n" + "만원권 " + man +"장\n"
				+ "5천원권 " + ocheon +"장\n" + "천원권 "	+ cheon + "장\n"
				+ "5백원 동전 " + obek +"장\n" + "백원 동전 " + bek + "개\n"
				+ "50원 동전 " + osib +"개 \n" + "10원동전" + sib + "개");
	}	
	
	public static void main(String[] args){
	    System.out.print("금액을 입력하세요:");
	        Scanner sc = new Scanner(System.in);
	    int money = sc.nextInt();

	    Exchange ec = new Exchange();
	        ec.change(money);
	    }
	
	
}
