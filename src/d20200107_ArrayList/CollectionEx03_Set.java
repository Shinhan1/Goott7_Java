package d20200107_ArrayList;

import java.util.HashSet;
import java.util.Iterator;

// Set - HashSet
public class CollectionEx03_Set {
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();		
		System.out.println(hs);			// HashSet -> []
										// 중복을 제외함
		hs.add("햇반");					// 자기 마음대로 들어감
		hs.add("라면");
		hs.add("감자탕");
		hs.add("고기");
		hs.add("고기");
		hs.add("소고기");
		hs.add("커피");
		hs.add("고기");
		
		// 중복된 값을 제거할 수 있음 : 일종의 필터링
		
		System.out.println("hs : " + hs);
		
//		for(int i = 0; i < hs.size(); i++) {
//			System.out.println(hs.get(i));
//		}		order by로 값을 넣지 않으므로 index를 고정할 수 없어서 getter가 존재하지 않음
		
		// 반복자
		Iterator it = hs.iterator();
		
		// hasNext() : 다음값이 존재하면 true, 다음값이 존재하지 않으면 false
		while(it.hasNext()) {		// 반복문
			Object ob = it.next();	// 다음 값을 ob에 넣어줌
			System.out.println(ob);
			
		}
		
		
		
		
		
		
		
		
	}
	

}
