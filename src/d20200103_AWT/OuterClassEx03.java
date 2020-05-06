package d20200103_AWT;

public class OuterClassEx03 {
	
	private int a = 10;
	static int b = 20;
	static final int C = 30;
	
	public void printAll() {
		// 지역변수처럼 InnerClass를 사용 - Local Inner Class
		class LocalInnerClass {
			int d = 40;
			static final int E = 50;
			//static int f = 60;
		
			public void print() {
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("C : " + C);
				System.out.println("d : " + d);
				System.out.println("E : " + E);
				//System.out.println("f : " + f);
						
			
			}	// inner print() end
				
		}	// Local Inner Class end
		
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();
		
		
	}
	
	public static void main(String[] args) {
		OuterClassEx03 oc3 = new OuterClassEx03();
		oc3.printAll();
		
	}

}
