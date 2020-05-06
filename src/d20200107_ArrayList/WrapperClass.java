package d20200107_ArrayList;

// WrapperClass
// 완전한 객체지향을 구현하기 위한 도구 중 하나
// primitive type data(int, float, ...)들을 객체로 만들어주는 클래스
// 기본 자료형

public class WrapperClass {
	public static void showData(Object ob) {
		System.out.println(ob);
		
		
	}
	
	public static void main(String[] args) {
		// showData(3);
		// new WrapperClass().showData(7);
		
		// int, float, char, double, ... -> Integer, Float, Char, Double, ...
		
		Integer num = new Integer(3);			// 기본 자료형을 객체화 하기 위해 데이터를 감싸는 형식
		System.out.println("num : " + num);		// 데이터는 그대로
		showData(num);
		showData(new Integer(7));
		
		System.out.println("---------------------------------");
		
		// WrapperClass 기본 기능
		// 1. Boxing
		Integer ival = new Integer(10);
		Double dval = new Double(3.14);
		
		System.out.println(ival);
		System.out.println(dval);
		
		System.out.println("---------------------------------");
		
		ival += 10;
		System.out.println(ival);
		
		// 2. Unboxing
		ival = new Integer(ival.intValue() + 10);
		dval = new Double(dval.doubleValue() + 10.11);
		
		System.out.println(ival);
		System.out.println(dval);
		
		System.out.println("---------------------------------");
		// WrapperClass 기본 기능 사용시 코드가 길어지고 불편
		// -> AutoBoxing, AutoUnboxing		--> new 없이 사용 가능
		
		// 1. AutoBoxing
		Integer ivalue = 100;
		Double dvalue = 3.14;
		// String과 마찬가지로
		String str = "Java";
		
		System.out.println(ivalue);
		System.out.println(dvalue);
		
		System.out.println("---------------------------------");
		// 2. AutoUnboxing
		int iresult = ivalue + 10;
		double dresult = dvalue + 10.11;
		
		System.out.println(iresult);
		System.out.println(dresult);
		
		
		
		
		
		
		
	}
	

}
