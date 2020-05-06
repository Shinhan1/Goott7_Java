package d20200113_Thread;

public class SingleThread {
	public static void main(String[] args) {
		long st = System.currentTimeMillis();			// 현재 시간을 millis 단위로 보여줌  1/1000
		// System.out.println(st);
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
		
		System.out.println("수행 시간 : " + (System.currentTimeMillis() - st));			// 현재 시간을 반복문 실행 전 시간으로 빼면 반복문 수행 시간이 구해짐
		
		for(int i = 0 ; i < 1000; i++) {
			System.out.println("#");
		}
		
		System.out.println("수행 시간 : " + (System.currentTimeMillis() - st));			// 현재 시간을 반복문 실행 전 시간으로 빼면 반복문 수행 시간이 구해짐
		
	}

}
