package d20191230_OOP_interface_Abstract;

public class Hw7{
    public static void main(String[] args){
        Animal a1 = new Animal("원숭이",26);
        a1.show();
    }

}

class Animal{
    String name;
    int age;
    
    public Animal(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public void show(){
        System.out.println( name + "님은 " + age + "살 입니다");
    }
}




