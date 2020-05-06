package d20200107_ArrayList;

import java.util.ArrayList;

// Vector : 동적 성장형 Object 배열
// ArrayList : 비동기적 성장형 Object 배열 (더 최신, 더 많이 사용)

public class CollectionEx02_ArrayList {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();			// ArrayList는 Object로 받음
		
		System.out.println("al : " + al);		// ArrayList -> []
		System.out.println("al.size() : " + al.size());		// 크기가 0
		
		al.add("오늘은");
		al.add("화요일");
		al.add("딸기");
		al.add("바나나");
		al.add("오렌지");
		al.add("키위");
		al.add("체리");
		al.add("바나나");				// 중복 허용
		al.add(10);
		
		System.out.println("al : " + al);
		System.out.println(al.get(2));			// 원하는 값을 찾아올 수 있음
		
		// 바나나는 몇번째 위치에 있을까요?
		/*
		for(int i = 0; i < al.size(); i++ ) {
			String str = (String)al.get(i);
			
			if(str.equals("바나나")) {
				System.out.println("바나나는 " + (i+1) + "번 째 위치에 있습니다.");
			}
			
			
		}
		*/
		
		System.out.println(al.indexOf("바나나"));
		
		
		
		
	}

}
