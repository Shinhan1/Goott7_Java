package d20191230_OOP_interface_Abstract;

public class ReferenceArr {
	public static void main(String[] args) {
		토끼 r = new 토끼();
		고래 w = new 고래();
		다람쥐 s = new 다람쥐();
		
		r.먹기(); 
		w.먹기();
		s.먹기(); //개체가 많을경우 매우 귀찮음 -> 배열사용
		
		//배열 복습 -> primitive배열 -> int[] m = new int[3];
		System.out.println("--------------------");
		포유류[] moList = new 포유류[3];
		moList[0] = r;
		moList[1] = w;
		moList[2] = s;
		
		for(int i=0; i<3;i++) {
			moList[i].먹기();
			moList[i].자기();
		}
		
		System.out.println("--------------------");
		
		//참조변수 여부
		// 참조변수의 원 객체여부를 확인하고 싶을 때 : instanceof
		System.out.println(r instanceof 토끼);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
