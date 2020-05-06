package d20191218_Arr;

// 2차 배열

public class ArrayEx05 {
	public static void main(String[] args) {
		int num = 1;
		int arr[][] = new int[3][2];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = num;
				num++;
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(arr.length);
		System.out.println(arr[0][0]);
		System.out.println(arr[0].length);
		System.out.println(arr[2].length);
	}
	
	

}
