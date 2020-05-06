package d20200103_AWT;

public class OuterClassEx01 {
	
	private int a = 10;
	static int b = 20;
	static final int C = 30;

	// 멤버 변수 같은 역할을 하는 클래스 : Member Inner Class
	class InnerClass {
		int d = 40;
		static final int E = 50;
		// static int f = 60;
		
		public void print() {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("C : " + C);
			System.out.println("d : " + d);
			System.out.println("E : " + E);
			//System.out.println("f : " + f);
					
		}	// print() end
	}	// Inner Class end
	
	public static void main(String[] args) {
		// Inner Class를 실행하려면 OuterClass가 먼저 new 되어야 함
		
		OuterClassEx01 oc1 = new OuterClassEx01();
		
		OuterClassEx01.InnerClass ic1 = oc1.new InnerClass();
		
		ic1.print();
		
		
	}
	
	
}
