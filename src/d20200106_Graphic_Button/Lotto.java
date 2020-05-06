package d20200106_Graphic_Button;

import java.util.Arrays;

public class Lotto {
	
	int data[] = new int[6];
	
	public void print() {
		int[] rnd = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21
						,22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
		
		
		
		for(int i = 0; i < 1000; i++) {
			int first = (int)(Math.random() * 45);
			int second = (int)(Math.random() * 45);
					
			int temp = 0;
			temp = rnd[first];
			rnd[first] = rnd[second];
			rnd[second] = temp;
					
		}
				
		for(int i = 0; i < 6; i++) {
			data[i] = rnd[i];
					
		}
		System.out.println();
		
		// 정렬 후 추출
		Arrays.sort(data);
		
		
	}	
	
}
