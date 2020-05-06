package d20191219_For;

public class ForTest02 {
	
	public static void main(String[] args) {
		
		int hun, ten, re;
		int zero = 0, one = 0, two = 0, thr = 0, four = 0, five = 0, six = 0, sev = 0,
				eig = 0, nine = 0;
		for(int i = 1; i <= 1000; i++) {
			hun = i/100;		// 백의 자리
			ten = (i/10)%10;	// 십의 자리
			re = i%10;			// 일의 자리
		
			
			if(hun == 0 || hun == 10) {		// 백의 자리가 0이거나 10일 때 , 10인경우는 1000인 경우 예외처리
				if(i > 100) zero ++; 		// 만약 i가 100보다 크다면 zero 1씩 증가 // 만약 1값일 경우 001로 인식되어 if문으로 제거
			}
			if(ten == 0) {					// 십의 자리가 0일 때
				if(i > 10) zero ++;			// 만약 i가 10보다 크다면 zero 1씩 증가 // 만약 1값일 경우 01로 인식되어 if문으로 제거
			}
			if(re == 0) {					// 일의 자리가 0일 때
				zero ++;					// 1씩 증가
			}
			
			
			if(hun == 1 || hun == 10) {		// 백의 자리가 1이거나 10일 때, 1000인 경우의 예외처리
				one ++;						// one 1증가
			}if(ten == 1) {					// 십의 자리가 1일 때
				one ++;
			}if(re == 1) {					// 일의 자리가 1일 때
				one ++;
			}
			
			if(hun == 2) {					// 백의 자리가 2일 때
				two ++;						// two 1증가
			}if(ten == 2) {					// 십의 자리가 2일 때
				two ++;
			}if(re == 2) {					// 일의 자리가 2일 때
				two ++;
			}
			
			if(hun == 3) {					// ... ... 반복
				thr ++;
			}if(ten == 3) {
				thr ++;
			}if(re == 3) {
				thr ++;
			}
			
			if(hun == 4) {
				four ++;
			}if(ten == 4) {
				four ++;
			}if(re == 4) {
				four ++;
			}
			
			if(hun == 5) {
				five ++;
			}if(ten == 5) {
				five ++;
			}if(re == 5) {
				five ++;
			}
			
			if(hun == 6) {
				six ++;
			}if(ten == 6) {
				six ++;
			}if(re == 6) {
				six ++;
			}
			
			if(hun == 7) {
				sev ++;
			}if(ten == 7) {
				sev ++;
			}if(re == 7) {
				sev ++;
			}
			
			if(hun == 8) {
				eig ++;
			}if(ten == 8) {
				eig ++;
			}if(re == 8) {
				eig ++;
			}
			
			if(hun == 9) {
				nine ++;
			}if(ten == 9) {
				nine ++;
			}if(re == 9) {
				nine ++;
			}
			
			
		}
	
		System.out.println("0의 개수 : " + zero);
		System.out.println("1의 개수 : " + one);
		System.out.println("2의 개수 : " + two);
		System.out.println("3의 개수 : " + thr);
		System.out.println("4의 개수 : " + four);
		System.out.println("5의 개수 : " + five);
		System.out.println("6의 개수 : " + six);
		System.out.println("7의 개수 : " + sev);
		System.out.println("8의 개수 : " + eig);
		System.out.println("9의 개수 : " + nine);   // zero ~ nine까지의 총 개수를 출력
		
		
	}

}
