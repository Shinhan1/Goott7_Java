package d20200108_Exception_Generic;

import java.util.Random;

public class D20200108_Q3 {
	public static void main(String[] args) {
		int num[] = new int[3];
		Random rnd = new Random();
		int index = rnd.nextInt(10);
		try {
			num[index] = rnd.nextInt(500);
			System.out.println("index : " + index + ", num["+ index 
					+ "] : " + num[index]);
			System.out.println("처리 완료");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index : " + index + ", num["+ index 
					+ "] : " + "존재하지 않습니다.");
			System.out.println("처리 완료");
			
		}
		
	}
	
}
