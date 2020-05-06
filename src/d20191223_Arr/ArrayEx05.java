package d20191223_Arr;

public class ArrayEx05 {
	public static void main(String[] args) {
		// 2차 배열
		/* 
		int[][] m = new int[3][2];
		
		System.out.println("m : " + m);
		System.out.println("m[1][0] : " + m[1][0]);
		System.out.println("m[0] : " + m[0]);
		System.out.println("m.lenth : " + m.length);	
		System.out.println("m[0].length : " + m[0].length);
		*/
		
		int[][] m = {{2,7}, {5,10},{12,7}};
		
		System.out.println(m[0][0] + ", " + m[0][1]);
		System.out.println(m[1][0] + ", " + m[1][1]);
		System.out.println(m[2][0] + ", " + m[2][1]);
		
		System.out.println("=======================================");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("m[" + i + "][" + j + "]" + " : " + m[i][j]);
			}
		}
		
		
	}

}
