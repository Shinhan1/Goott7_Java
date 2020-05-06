package d20200114_SwingThread;

import java.util.ArrayList;
import java.util.Random;

// 차

public class Car {
	
	String[] carName = {"MINI", "K3", "K5", "K7", "기블리", "팬텀", "범블비", "G80"};
	
	ArrayList<String> list;
	
	Random rnd = new Random();		// 랜덤으로 차를 뽑기 위해 랜덤함수 선언
	
	public Car() {
		list = new ArrayList<String>();
		
		
	}	// 생성자 end
	
	// 자동차 이름을 랜덤하게 얻어오기
	public String getCar() {
		int value = rnd.nextInt(carName.length);		// value에 carName의 크기만큼의 랜덤값으로 가져옴
		String name = carName[value];					// 랜덤으로 가져온 값 value의 위치에 있는 car를 name으로 가져옴
		
		return name;		// name 리턴
		
	}	// getCar end
	// 생성된 차를 저장하기 위한 메소드
	public synchronized void push(String car) {		// synchronized : 동기화
													
		System.out.println("------ push() ------");
		System.out.println("현재 재고 : " + list);
		System.out.println("입고 차량 : " + car);
		
		list.add(car);		// 전달된 car를 list에 추가
		
		notifyAll();		// wait 하고 있는 모든 thread를 깨움
		// notify();		// 현재 wait 하고 있는 thread 중 하나를 랜덤하게 깨움
		
	}	// push() end
	
	// 입고된 차를 빼는 메소드 - 가장 마지막에 입고된 차를 빼기
	public synchronized String pop() {
		System.out.println("------ pop() ------");
		System.out.println("현재 재고 : " + list);
		String carName;
//		if(list.size() != 0) {
			carName = list.remove(list.size()-1);	// list의 크기보다 1작은 값을 carName으로 가져옴
//			list.get(list.size()-1);						// 내용을 읽어올 뿐 리스트에 여전히 남아있음
//		}else
//			carName = "재고가 없습니다.";
		if(list.size() == 0) {
			try {
				this.wait();				// 실행을 잠시 중단시킴. notify()로 깨울때 까지 중단됨
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("출고 차량 : " + carName);
		
		return carName;			// carName 리턴
		
	}	// pop() end
	
	

}	// Car class end
