package d20191219_For;

// codingTest 수박수박수박수 구하기

public class CodingTest01 {
	public static void main(String[] args) {
		String str = "";
		
		for(int i = 1; i <= 10000; i ++) {
			if(i%2 == 0) {
				str += "수";
			}else
				str += "박";
		
		}
		
	}
	

}
