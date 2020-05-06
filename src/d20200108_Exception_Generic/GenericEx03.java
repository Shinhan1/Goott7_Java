package d20200108_Exception_Generic;

/*
 * 	Generic Type
 * 	 : 다양한 자료형을 하나의 클래스로 처리
 * 	 : 생성클래스 뒤에 <~> : '~' - 일반화시킨 객체(변수)
 * 	 -> 구현 클래스에서 필요한 자료형을 대입해서 사용
 * 
 */

class Student{		
	int grade;		
	
	public Student(int grade) {
		this.grade = grade;
	}
}	// Student end

class Employee {
	int rank;
	
	public Employee(int rank) {
		this.rank = rank;
	}
}	// Employee end

class Person {
	Object info;		// object형 객체 info 선언
	
	public Person(Object info) {
		this.info = info;
	}
}	// Person end


public class GenericEx03 {
	public static void main(String[] args) {
		Person p1 = new Person(new Student(1));
		Person p2 = new Person(new Employee(3));
		
		// student, employee 정보 확인
		Student st = (Student)p1.info;		// p1은 Object형 객체이므로 Student로 바꿔줌
		Employee ep = (Employee)p2.info;	// p2는 Object형 객체이므로 Employee로 바꿔줌
		
		System.out.println(st.grade);
		System.out.println(ep.rank);
		
		/*
		Student st2 = (Student)p2.info;    Student st2(Student 객체) = (Student)p2.info(Employee 객체)
		System.out.println(st2.grade);
		
		Exception in thread "main" java.lang.ClassCastException: d20200108.Employee cannot be cast to d20200108.Student
		at d20200108.GenericEx03.main(GenericEx03.java:48)
		
		컴파일 전에는 에러가 발견이 안됨 - 컴파일 후에 에러가 있다고 나옴
		=> 큰 문제가 될 가능성이 농후
		
		*/
		
		//GenericHw.java를 통해 위 오류를 사전에 방지해보세요
		
	}	// main end
	

}	// class end













		
		
