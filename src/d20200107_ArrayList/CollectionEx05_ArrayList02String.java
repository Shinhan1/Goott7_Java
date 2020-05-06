package d20200107_ArrayList;

import java.util.ArrayList;

public class CollectionEx05_ArrayList02String {
	public static void main(String[] args) {
		String[] str = {"커피", "콩", "빨간 약병", "파란 약병", "두부", "딸기", "포도"};
		
		// ArrayList에 담아서 하나씩 꺼내서 출력
		// 이 ArrayList에 String만 쓸 수 있도록 하려면 ?
		// JCF 뒤에 <E>를 붙임 : generic
		
		// 컴파일 전에 에러를 미리 방지할 수 있음
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i = 0; i < str.length; i ++) {
			al.add(str[i]);
			System.out.println(al.get(i));
		}
		
		al.add("키위");
		
//		int num = 100;
//		al.add(100);				ArrayList<String> 으로 String만 받으므르 int형은 받을 수 없음
		
		System.out.println("al : " + al);
		System.out.println("---------------------------------------------");
		
		// ArrayList안의 데이터 첫글자만 출력
		for(int i = 0; i < al.size(); i ++) {
			String s = (String)al.get(i);
			System.out.println(s.charAt(0));
			
		}
		
		
	}
	
}
