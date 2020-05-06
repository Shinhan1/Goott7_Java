package d20191226_Class;

public class Society {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.먹기();
		
		System.out.println("h1 이름 : " + h1.이름);
		System.out.println("h1 : " + h1);
		
		System.out.println("----------------------------------");
		
		/*
		Human h2 = new Human();
		
		h2.생각하기();
		
		h2.이름 = "신사임당";
		h2.나이 = 21;
		
		System.out.println("h2이름 : " + h2.이름);
		System.out.println("h2 : + " + h2);
		*/
		
		
		Human h2 = new Human("유관순", "여성");
		
		System.out.println("h2 이름 : " + h2.이름);
		System.out.println("h2 성별 : " + h2.성별);
		System.out.println("h2 : " + h2);
		
		System.out.println("-----------------------------------");
		
		Human h3 = new Human("갑돌이", "남성", 178.2);
		System.out.println("h3 이름 : " + h3.이름);
		System.out.println("h3 성별 : " + h3.성별);
		System.out.println("h3 키 : " + h3.키);
		System.out.println("h3 : " + h3);
		
		System.out.println("-----------------------------------");
		
		Human h4 = new Human("신사임당", "여성", 160.1, 60.1, 30);
		System.out.println("h4 키 : " + h4.키);
		
		
		
		
		
	}
	
	
	
	
}
