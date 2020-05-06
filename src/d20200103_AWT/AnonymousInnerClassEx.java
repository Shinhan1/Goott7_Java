package d20200103_AWT;

import d20191230_OOP_interface_Abstract.Flyable;

/*
 * 	 - 통상적으로 클래스 구현 방식
 *   : 클래스명 참조변수 = new 생성자();
 *   
 *   - 익명클래스 구현
 *   : new 인터페이스() {변수, 메소드 선언}
 *   : new 조상클래스() { };
 *   
 */

public class AnonymousInnerClassEx {
	
	/*
	
	Flyable f0 = new Flyable();
	: 인터페이스는 추상메소드, 상수만 존재
	: 구현부가 없으므로 new 못함
	
	마린 m = new 마린();
	
	Flyable f1 = (Flyable) m;
	
	Flyable f1 => Flyable 인터페이스를 구현한 객체의 참조값
	
	Flyable f2 = (Flyable) new 마린();
	
	*/

	Flyable f = new Flyable() {
		
		@Override
		public void 비행() {
			System.out.println("익명클래스를 통한 method overriding");
		}
	};
	
	public static void main(String[] args) {
		AnonymousInnerClassEx aic = new AnonymousInnerClassEx();
		
		aic.f.비행();
		
	}
	
}
