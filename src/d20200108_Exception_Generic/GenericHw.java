package d20200108_Exception_Generic;

class Student2 {
	int grade;
	
	public Student2(int grade) {
		this.grade = grade;
	}
}

class Employee2 {
	int rank;
	
	public Employee2(int rank) {
		this.rank = rank;
	}
	
}

class Person2<T> {
	T info;
	
	public Person2(T info) {
		this.info = info;
	}
	
}

public class GenericHw {
	public static void main(String[] args) {
		Student2 st = new Student2(2);
		
		Person2<Integer> p1 = new Person2<Integer>(st.grade);
		
		System.out.println(p1.info);
		
//		Person2<Employee2> p2 = new Person2<Employee2>(new Student2(4));
		Person2<Employee2> p2 = new Person2<Employee2>(new Employee2(1));
		
		System.out.println(p2.info.rank);
		
		
		
	}
}
