package d20200103_AWT;

public class OuterClassEx02 {
	
	//private int a = 10;
	static int b = 20;
	static final int C = 30;

	static class StaticInnerClass {
		int d = 40;
		static final int E = 50;
		static int f = 60;
		
		public void print() {
			//System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("C : " + C);
			System.out.println("d : " + d);
			System.out.println("E : " + E);
			System.out.println("f : " + f);
					
		
		}
		
	} // static inner class end

	
	
	public static void main(String[] args) {
		//print()는 static ineer class에 있음 -> 굳이 OuterClass를 호출할 필요가 없음
		
		StaticInnerClass sic = new StaticInnerClass();
		sic.print();
		
	}
}
