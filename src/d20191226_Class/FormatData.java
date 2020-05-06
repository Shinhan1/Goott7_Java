package d20191226_Class;

public class FormatData {
	public static void main(String[] args) {
		int a = 20;
		int[] b = {10, 20, 50, 30};
		float f = 240.3f;
		
		FormatData fd = new FormatData();
		
		fd.print(a);
		fd.print(b);
		fd.print(f);
	}
	
	public void print(int n) {
		System.out.println(n);
	}
	public void print(int[] n) {
		System.out.print("[ ");
		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.print("]\n");
	}
	public void print(float f) {
		System.out.println(f);
	}

}
