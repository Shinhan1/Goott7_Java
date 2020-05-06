package d20191227_OOP;

public class ExtendsMain2 {
	public static void main(String[] args) {
		//call by value
//		CareerMan cm  = new CareerMan("SamGun" , "General");
//		
//		System.out.println("cm.info.......................................");
//		cm.tellInfo();
		
		
		System.out.println("==============================================");
		
		CareerMan cm2 = new CareerMan("LEE", "SamGun", "General");
		System.out.println("cm.info.......................................");
		cm2.tellInfo();
		
	}
}
