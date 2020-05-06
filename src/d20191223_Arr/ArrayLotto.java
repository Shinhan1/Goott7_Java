package d20191223_Arr;

public class ArrayLotto {
	public static void main(String[] args) {
		// 로또별로 45개중 6개를 랜덤화게 추출
		int[] rnd = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21
				,22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
		
		/*
		0.0 < Math.random(); < 1.0 : double type 값
		0.0 < Math.random(); * 10 M 10.0 : double type 값
		0.0 < Math.random() * 45 < 45.0 : double type 값
		--> 최대  : 44.9999999999.......
		
		정수값을 얻도록 하려면?
		0 <= (int)Math.random() * 45 < 45 : int type값
		
		*/
		
		// System.out.println(Math.random() * 45);
		
		//for(int i = 0; i < 100; i++) {
			// System.out.println((int)(Math.random(0 * 45));
		//}
		
		// 중복을 제거하면서 6개 번호 생성
		for(int i = 0; i < 1000; i++) {
			int first = (int)(Math.random() * 45);
			int second = (int)(Math.random() * 45);
			
			int temp = 0;
			temp = rnd[first];
			rnd[first] = rnd[second];
			rnd[second] = temp;
			
			
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(rnd[i] + " ");
			
		}
		System.out.println();
		
		
	}
	
	

}
