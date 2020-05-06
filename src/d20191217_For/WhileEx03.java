package d20191217_For;

public class WhileEx03 {
	
	public static void main(String[] args) {
		/*
		1000 이하의 정수 중에서 2의 배수이면서 7의 배수인 숫자 출력
		그 숫자들의 합을 구해보세요 (while문)
		*/
		
		int i = 0;
		int sum = 0;
		while (i <= 1000) {
			if(i%2 == 0 && i%7 == 0) {		// i를 2로 나눈 나머지가 0이 되고 i를 7로 나눈 나머지가 0이 되어야한다
				System.out.println(i);		// i 출력
				sum += i;					// sum 에 sum + i를 대입
			}
			i++;
		}
		System.out.println("-----------");
		System.out.println("합 : "+ sum);
		
		
	}

}
