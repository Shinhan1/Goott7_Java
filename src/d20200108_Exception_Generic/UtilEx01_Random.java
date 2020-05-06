package d20200108_Exception_Generic;

import java.util.Random;

public class UtilEx01_Random {
	
	public static void main(String[] args) {
		//Math.random(); => double type 리턴
		
		Random rnd = new Random();
		int value = rnd.nextInt(45);
		
		rnd.setSeed(1);
		
		value = rnd.nextInt(45);
		
		System.out.println(value);
		
		
		
		
	}

}
