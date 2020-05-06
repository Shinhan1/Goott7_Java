package d20191230_OOP_interface_Abstract;

public class InterfaceMain2 {
	
	public static void main(String[] args) {
		InterfaceClass ifc = new InterfaceClass();
		ifc.calculate();
		System.out.println(ifc.getStr());
		System.out.println(ifc.NUM);
		
		System.out.println("--------------------");
		
		InterfaceEx01 ife1 = new InterfaceClass();
		ife1.calculate();
		
		System.out.println("--------------------");
		InterfaceEx02 ife2 = new InterfaceClass();
		System.out.println(ife2.getStr());
		
		
	}
}
