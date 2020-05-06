package d20200107_ArrayList;

import java.util.Vector;

public class CollectionEx01_Vector {
	public static void main(String[] args) {
		// Vector : 독적 성장형 Object 배열
		Vector v = new Vector();		// Vector 객체 v선언
		
		System.out.println("v : " + v);	// v는 대괄호[], 즉 배열
		System.out.println("v.capacity : " + v.capacity());		// 기본 배열 용량은 10
		System.out.println("v.size() : " + v.size());			// v.size -> 몇개 들어있냐?  아무것도 안들어 있으므로 0개
		
		String s1 = "Java";				// String s1에 Java 대입
		Object ob = s1;
		
		v.add(ob);			// Object도 받을 수 있다. 즉, 모든 자료형도 받을 수 있음 (배열의 단점 해결)
		
		v.add("오늘은");
		v.add("화요일");
		v.add("딸기");
		v.add("바나나");
		v.add("오렌지");
		v.add("키위");
		v.add("체리");
		v.add("복숭아");
		v.add("사과");
		v.add("자두");					// v에 총 11개 집어넣음 
		
		
		System.out.println(v);									// 10개가 넘은 11개가 들어가므로 자동으로 용량 늘림	(동적 성장형 배열)
		System.out.println("v.capacity : " + v.capacity());		// 10 -> 20으로 변경
		System.out.println("v.size() : " + v.size());			// v에 총 11개 들어있음
		
		System.out.println("-----------------------------------");
		
		int[] num = new int[2];
		num[0] = 10;
		num[1] = 20;
		// num[2] = 30;		// 배열 크기 2칸이므로 num[2]는 출력x
		
		System.out.println("num : " + num);
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		
		System.out.println("v : " + v);
		
		System.out.println("-----------------------------------");
		// Vector 값 출력
		
		char ch[] = new char[11];
		
		
		for(int i = 0; i < v.size(); i++ ) {
			// 한 단어씩 출력해서 첫번 째 문자만 출력해보세요
			Object ob1 = v.get(i);		
			String str = (String)ob1;
			
			System.out.print(str + " ");
			System.out.print(str.charAt(0) + " ");		// String의 charAt(n) n번째 문자 출력
			
			System.out.println(str.substring(0,1));		// String의 substring(a, b) a번째부터 b번째 문자열 출력	
			// System.out.print(v.get(i)+ " ");			// v.get으로 출력하면 []대괄호를 빼고 값만 가져올 수 있다.
														// str.subSequence(a, b)
			
			
			// 딸기가 몇 번째 위치에 있나요?
			
			// int pos = str.indexOf("딸기");
			// System.out.println(pos);
			
		}
		System.out.println();
		
		System.out.println(v.get(5));					// v에서 하나의 값만 가져오고 싶을 때
		
		System.out.println("------------------------------------------");
		
		System.out.println(v);
		//딸기가 몇 번째 위치가 있나요?
		if(v.contains("딸기")) {								// Vector에 딸기라는 단어가 있나?
			System.out.println("딸기가 있어요");					// 있다
			for(int i = 0; i < v.size(); i++) {				// 그러면 i를 0부터 v의 크기만큼 돌린다
				String s = (String)v.get(i);				// v.get(i)를 String 형 문자열로 저장
				if(s.equals("딸기")) {						// 저장한 문자열에 딸기가 있나?	
					System.out.println("딸기는 " + (i+1) + "번 째에 있습니다."); 	// v.get(i)의 i번째에 있다.
				}
			}
			
		}else {
			System.out.println("딸기가 없어요");
		}
		
		System.out.println("------------------------------------------");
		
		Object[] o = {"커피", "콩", "빨간 약병", "파란 약병", "두부", "딸기", "포도" };
		// 딸기가 몇 번째 위치에 있나요?
		
		for(int i = 0; i < o.length; i++) {					// Object
			String st = (String)o[i];
			if(st.equals("딸기")) {
				System.out.println("딸기는 " + (i+1) + "번 째에 있습니다.");
			}
		}
		
		
	}
	
	
}
