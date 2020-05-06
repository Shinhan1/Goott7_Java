package d20191218_Arr;


public class ArrayEx01 {
	public static void main(String[] args) {
		// int 크기 변수 5개를 생성하고 각 변수에 임의의 값을 대입한 후 콘솔에 출력
		
		int num1 = 0;
		int num2 = 10;
		int num3 = 20;
		int num4 = 30;
		int num5 = 40;
		
		System.out.println("" + num1 + num2 + num3 + num4 + num5);
		
		// 배열 선언 : 자료형[] 변수명;
		
		int[] num;				// 배열 선언
		num = new int[5];		// 배열 크기 초기화
		
		System.out.println("num : " + num);
		num[0] = 0;
		num[1] = 10;
		num[2] = 20;
		num[3] = 30;
		num[4] = 40;			// 배열에 값 입력
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);		// 배열 출력
		
		System.out.println("----------------------------");
		
		// 배열 출력 반복문으로 할 수 있음
		
		int[] n;		// n이란 배열 선언
		n = new int[5];	// 배열 크기 5로 초기화
		for(int i = 0; i < num.length; i++) {		// for문 
			n[i] = i*10;			// 반복문으로 n[]에 값 입력
			System.out.println(n[i]);		// 배열 출력
		}
		
		System.out.println("배열 크기 : " + num.length);		// 배열 크기 출력
		
		
		
	}	

}
