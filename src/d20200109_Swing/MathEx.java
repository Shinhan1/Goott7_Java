package d20200109_Swing;

public class MathEx {
	public static void main(String[] args) {
		System.out.println("원주율 : " + Math.PI);	//원주율 : 상수값으로 제공됨
		System.out.println("4의 제곱근 : " + Math.sqrt(4));	//루트 4 출력

		System.out.println("파이에 대한 육십분법 : " + 
					Math.toDegrees(Math.PI));
		
		//프로그래밍 언어에서는 라디언을 더 많이 씀
		System.out.println(Math.toRadians(45));	//45도를 라디안으로 바꿈
		
		double rad = Math.toRadians(45);
		
		System.out.println("sin 45 : " + Math.sin(rad));	//라디안을 사용하면 더 정밀하게 표현이 가능함
		System.out.println("cos 45 : " + Math.cos(rad));
		System.out.println("tan 45 : " + Math.tan(rad));
		
		//로그, 승
		System.out.println("log90 : " + Math.log(90));
		System.out.println("2⁴ : " + Math.pow(2, 4));	//실수로 돌려줌
		
		
		
	}
}
