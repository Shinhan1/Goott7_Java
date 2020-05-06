package d20200108_Exception_Generic;

public class ExceptionThrows {
	public static void prt() throws NumberFormatException {
		String[] str = {"9", "300", "150", "200", "a" };
		
		int sum = 0;
		
		for(int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);		// int형 변수 sum에 str배열을 integer화 시켜서 넣음
		}											// 마지막 a는 integer화 시킬 수 없어 에러 발생
													// 에러 해결을 위한 main문에서 try ~ catch 실행
		System.out.println("sum : " + sum);
	}// prt() end
	
	public static void main(String[] args) {
		try {				// try ~ catch : 예외 처리를 위한 명령문
			prt();			// 일단 실행
			
		}catch(Exception e) {	// Exception 발생 하면 catch문 실행
			System.out.println(e.getMessage());
			System.out.println("에러발생");
			
		} // try ~ catch end
		
	}	// main end

}	// class end
