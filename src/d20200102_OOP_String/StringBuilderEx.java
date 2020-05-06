package d20200102_OOP_String;


//	StringBuffer,	StringBuilder
//		1.0				1.5					--> 속도
//		안정				불안정 (thread 사용시)	--> 둘다 안정이지만 상대적으로 조금더 불안정하다는 것


public class StringBuilderEx {
	public static void main(String[] args) {
		// String str = "PaulBassett";
		
		StringBuilder sb = new StringBuilder();		// 버퍼 사용
		// System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.append("AA");		// 문자 대입
		
		System.out.println(sb);
		sb.insert(1, 4);		// insert(a, b) a번째에 b삽입
		System.out.println(sb);
		
		sb.delete(0, 1);			// 0이상 1미만 삭제 따라서 0삭제
		System.out.println(sb);
		
		System.out.println("---------------------------------");
		String str = "PaulBassett";
		
		StringBuilder sb2 = new StringBuilder(str);
		
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		System.out.println("----------------------------------");
		
		String str1 = "Java";
		String str2 = "Wow";
		
		// 문자열 비교 : compareTo()
		if(str1.compareTo(str2) < 0) {
			System.out.println("str1이 앞선다");
		}else
			System.out.println("str2가 앞선다");
		
		
	}
}
