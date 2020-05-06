package d20191219_For;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		for(int i = 1; i <= 10000; i++) {
			arr[i%10]++ ;		// 단자리 값 구하기
			if(i >= 10) arr[i/10%10]++;		// 십의 자리 구하기
			if(i >= 100) arr[i/100%10]++;	// 백의 자리일 때
			if(i >= 1000) arr[i/1000%10]++;	// 천의 자리일 때
			if(i >= 10000) arr[i/10000%10]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + " ---> " + arr[i]);
		}
		
	}
}
