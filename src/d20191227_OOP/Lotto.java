package d20191227_OOP;

public class Lotto {
	int num;
	public Lotto(int n) {
		this.num = n;
	}
	
	
	public int[] select() {
		int []ran = new int[6];
		for(int j = 0; j < num; j++) {
			for(int i = 0; i < 6; i++) {
				ran[i] = (int)((Math.random())*45+1);
				System.out.print(ran[i] + " ");
			}
			System.out.println();
		}
		
		return ran;
	}
	/*
	public void print() {
		System.out.print("[ ");
		for(int i = 0; i < num; i++) {
			System.out.print(ran[i]);
		}
		
	}
	*/
}
