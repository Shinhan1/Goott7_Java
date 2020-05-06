package d20191218_Arr;


public class ArrayEx02 {
	
	public static void main(String[] args) {
		// 1. int 크기 배열 생성
		// 2. 참조 대상 변수는 3개
		// 3. 3개의 변수에 임의의 값을 대입한 후 출력해보세요
		
		//int[] arr;
		int arr[] = new int[3];		// 선언과 초기화를 동시에 함
		int num = 0;				// 임의의 값을 주기위한 변수
		
		// int 기본값 : 0
		// float 기본값 : 0.0f
		
		int b[] = {15, 25, 35};		// 배열 선언 및 초기화
		
		
		System.out.println(arr);	
		System.out.println(b);
		
		for(int i = 0; i < arr.length; i ++) {		// arr.length는 배열의 크기 따라서 for문이 배열의 크기만큼 반복
			
			num += 10;		// 임의의 값
			arr[i] = num + 12;		// 배열에 임의의 값 입력
			System.out.println(arr[i]);	// 배열 출력
			System.out.println(b[i]);	// 배열 출력
			
		}
	}

}
