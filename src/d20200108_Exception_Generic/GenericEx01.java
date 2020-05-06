package d20200108_Exception_Generic;

public class GenericEx01 {
	public static void main(String[] args) {
		TypeClass<Integer> ti = new TypeClass<Integer>();		// 제너릭(generic)을 사용. 
																// TypeClass ti은 Integer만 받을 수 있다
		
		ti.setValue(100);		// t1에 100 값 넣음
		
		System.out.println(ti.getValue());		// t1 출력
		
		System.out.println("--------------------------------");
		
		TypeClass<String> ts = new TypeClass<String>();		// TypeClass ts는 String 만 받을 수 있음
		ts.setValue("제너릭");			// ts에 "제너릭" 넣음
		System.out.println(ts.getValue());	// ts 출력
		
		System.out.println("--------------------------------");
		
		// float, double 출력해보세요
		
		TypeClass<Float> tf = new TypeClass<Float>();	// float만 받음
		tf.setValue(3.14f);
		System.out.println(tf.getValue());
		
		TypeClass<Double> td = new TypeClass<Double>();	// double만 받음
		td.setValue(3.14);
		System.out.println(td.getValue());
		
		
		
	}

}
