package d20200108_Exception_Generic;

import java.util.ArrayList;

public class D20200108_Q4 {
	public static void main(String[] args) {
		try {
			ArrayList list = new ArrayList();
			list.add("딸기");
			list.add(500);
			list.add("수박");
			list.add("파인애플");
			
			for(int i = 0; i < list.size(); i++ ) {
				String name = (String)list.get(i);
				System.out.println(name);
			}
			
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
			System.out.println("list에 숫자가 포함되어 있습니다.");
		}
		
		
		
		
		
	}

}
