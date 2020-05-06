package d20191218_Arr;

public class ArrayEx04 {
	public static void main(String[] args) {
		// char 배열 10칸짜리 변수 ch
		// 이 변수에 JavaWorld 라는 글자를 대입한 후 콘솔에 출력해 보세요
		/*
		char ch[] = new char[10];
		
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		ch[4] = ' ';
		ch[5] = 'W';
		ch[6] = 'o';
		ch[7] = 'r';
		ch[8] = 'l';
		ch[9] = 'd';
		
		*/
		 char ch[] = {'J', 'a', 'v', 'a', ' ', 'W', 'o', 'r', 'l', 'd'};
		// 콘솔에 출력
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			
		}
		
		
		System.out.println();
		System.out.println("---------------------------");
		String str = "Java World";
		System.out.println(str);
		
		
	}

}
