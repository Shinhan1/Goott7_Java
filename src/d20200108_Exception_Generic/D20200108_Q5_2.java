package d20200108_Exception_Generic;

public class D20200108_Q5_2 {
	
	public static void main(String[] args) {
		try {
			call();	
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("에러 발생");
		}
	}

	static void call(){
		
		try {
			String[] str = {"9", "a", "300", "20"};
			
			int res = 0;
			for(int i = 0; i < str.length; i++) {
				res += Integer.parseInt(str[i]);
			}
			System.out.println("res : " + res);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("에러 발생");
		}
	}
	

}
