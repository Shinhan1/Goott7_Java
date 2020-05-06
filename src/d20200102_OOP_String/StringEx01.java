package d20200102_OOP_String;

public class StringEx01 {
	public static void main(String[] args) {
		String str1 = new String("Java");
		String str2 = new String("Java");
		
		System.out.println("str1 : " + str1);
		
		// 아주 예외적으로 String 클래스만 new를 생략하여
		// primitive type처럼 쓰도록 허용되어 있음
		
		String str3 = "Java";
		System.out.println("str3 : " + str3);
		
		System.out.println("str1.toString() : " + str1.toString());
		
		// hashCode() : 해당 객체의 고유한 값을 return
		
		System.out.println(str1.hashCode());
		
		System.out.println("str : " + 
				str1.getClass().getName() 
				+ '@' + 
				Integer.toHexString(str1.hashCode()));
		
		System.out.println("------------------------------");
		
		if(str1 == str2) {
			System.out.println("같은 객체");
		}else
			System.out.println("다른 객체");
		
		System.out.println("------------------------------");
		
		if(str1.equals(str2)) {
			System.out.println("동일 내용");
		}else
			System.out.println("다른 내용");
		
		/*
		 * 
		 * 
		 * 						Object			String
		 * 	toString()			참조값			자기 자신 문자열
		 * 	equals()			주소동일여부		내용 비교
		 * 
		 * 
		 */	
		
		System.out.println("------------------------------");
		
		String str4 = "Java";
		String str5 = "Java";
		
		// 내용이 같으면 같은 메모리를 쓰자 (성능 개선을 위해)
		
		if(str4 == str5) {
			System.out.println("같은 객체");
		}else
			System.out.println("다른 객체");
		
		if(str4.equals(str2)) {
		}
		
		
	}
}
