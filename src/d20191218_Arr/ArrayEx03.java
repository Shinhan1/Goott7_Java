package d20191218_Arr;

public class ArrayEx03 {
	public static void main(String[] args) {
		// int 배열 3칸짜리 a
		// int 배열 3칸짜리 b
		// int 배열 3칸짜리 c
		
		// a, b 각각의 배열에 임의의 값을 대입
		// c에는 a배열의 b배열의 값을 더한 후 대입
		
		int a[] = {10, 20, 30};
		int b[] = {40, 50, 60};
		int c[] = new int[3];
		
		/*
		c[0] = a[0] + b[0];
		c[1] = a[1] + b[1];
		c[2] = a[2] + b[2];
		
		System.out.println("" + c[0] + c[1] + c[2]));
		*/
		
		for(int i = 0; i < c.length; i ++) {
			c[i] = a[i] + b[i];
			System.out.println("c["+i+"] : " + c[i]);
		}
		// 배열값을 하나씩 가져와서도 연산가능
		System.out.println(a[0] + b[2]);
		
	}
	
	

}
