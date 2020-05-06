package d20200107_ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Map - HashMap
public class CollectionEx04_HashMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();			// 순서 없음.
		
		System.out.println("hm : " + hm);	
		
		hm.put("실", "바늘");			// hm.put(key, value);
		hm.put("라멘", 9000);			// key는 중복 X, 최근 값으로 덮어씀
		hm.put("햄버거", "콜라");		// value는 중복 O, key값으로 찾으므로
		hm.put("햄버거", "밀크쉐이크");
		hm.put("낚지볶음", 12000);
		hm.put("호식이", 12000);
		
		System.out.println("hm : " + hm);		// key = value 값으로 출력. 다만, key값은 중복 X 마지막 값으로 덮어씀
		
		System.out.println(hm.get("라멘"));		// key값으로 찾아 value 값을 출력
		
		if(hm.containsKey("실")) {				// key값으로 찾기
			System.out.println("존재함");
		}
		if(hm.containsValue("밀크쉐이크")) {		// value값으로 찾기
			System.out.println("존재함");
		}
		
		System.out.println("-------------------------------------");
		
		// 현재 key의 첫문자만 콘솔에 출력해보세요 - API 참조
		
		Set s = hm.keySet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
//			Object ob = it.next();				
//			String str = (String)ob;			// Object 객체  ob를 String형 str에 넣어줌
			String str = (String)it.next();
			
			System.out.print(str + "\t");
			System.out.print(str.charAt(0) + "\t");				// charAt를 이용한 첫문자 따기
			System.out.print(str.subSequence(0, 1) + "\t");		// subSequence
			System.out.println(str.substring(0, 1));			// substring
			
			
		}
		
		
		
	}

}
