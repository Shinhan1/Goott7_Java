package d20200108_Exception_Generic;

import java.util.ArrayList;

// WrapperClass : 완전한 객체 지향을 위한 도구(?)

public class WrapperEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("딸기");
		list.add("포도");
		
		System.out.println(list);
		
		int a = 300;
		
		Integer it = new Integer(a);		// Boxing
		list.add(it);
		
		Integer it2 = a;					// AutoBoxing
		list.add(it2);
		
		Object ob = it;
		list.add(ob);
		
		
		System.out.println(list);
		System.out.println("------------------------------------------------");
		
		it.intValue();
		
		int b = it.intValue();		// Unboxing
		int in = it;				// AutoUnboxing
		
		System.out.println("------------------------------------------------");
		
		System.out.println(it.intValue());
		System.out.println(it.MAX_VALUE);			// it가 소환할 수 있는 최대 정수
		
		// 2진수 변환
		System.out.println(Integer.toBinaryString(a));
		
		// WrapperClass 형변환 - parse~
		String str = "01011112222";
		int value = Integer.parseInt(str);
		System.out.println("value : " + value);		// 형변환을 통해 숫자로 되었기 때문에 앞의 0이 없어진다
		
		double d = Double.parseDouble(str);
		System.out.println("d : " + d);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
