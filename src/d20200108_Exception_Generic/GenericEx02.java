package d20200108_Exception_Generic;

/*
 * 		int a;			// a는 항상 int		--->	유동성 있게 사용할 수 없나?
 * 		
 * 		Object a;
 * 
 * 		int b = (int)a;
 * 
 * 		String s = (String)a;
 * 
 * 		=> 항상 Object로 선언한느 것은 부담
 * 		=> generic을 통해 일반화
 * 		
 */

public class GenericEx02 {
	public static void main(String[] args) {
		Animal<String> animal = new Animal("참새");		// name에 "참새" 라는 String형 문자열 삽입
		Animal<Object> animal2 = new Animal("시조새");	// name에 "시조새" 라는 String형 문자열 삽입
		Animal<Integer>	animal3 = new Animal(2020);		// name에 2020 이라는 Integer형 정수 삽입
		
		
		System.out.println(animal.name);
		System.out.println(animal2.name);			// 출력
		System.out.println(animal3.name);

	}

}


class Animal<T> {
	T name;			// 제너릭을 통해 자료형을 선언하지 않음 (무엇이든 들어올 수 있다)
	String str_name;	// str_name을 String으로 선언
	Object obj_name;	// obj_name을 Object로 선언
	
	public Animal(T name) {
		this.name = name;
	}
	
//	public Animal(String str_name) {
//		super();
//		this.str_name = str_name;
//	}
//	
//	generic은 Object와 충돌이 남
//	public Animal(Object obj_name) {
//		super();
//		this.obj_name = obj_name;
//	}
	
	
	
	
	
}