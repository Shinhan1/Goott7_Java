package d20191227_OOP;

public class AnimalTest {
	String name;
	int age;
	
	public AnimalTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name + "님은 " + age + "살 입니다."); 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}
