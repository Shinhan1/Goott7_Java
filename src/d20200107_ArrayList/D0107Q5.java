package d20200107_ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

// 1부터 100 사이의 값을 랜덤하게 10개를 뽑으려한다.
// 단 값은 중복되지 않아야 한다. (Collection을 이용)

public class D0107Q5 {
	
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>(); // HashSet은 중복을 제거하기 때문에 따로 중복제거 하지않아도  중복 제거가 된다
		Random rnd = new Random();	// 랜덤 함수
		
		for(int i = 0; i < 10; i ++) {	// 랜덤으로 10개 숫자 뽑아야함
			hs.add(rnd.nextInt(99)+1);	// hs에 추가
		}	// for end
		
		System.out.println(hs);		// 출력
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
			
			
		
	}	// main end

	
	
}	// class end
