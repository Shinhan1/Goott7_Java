package d20191226_Class;

public class DataUse {
	public static void main(String[] args) {
		Data data = new Data();
		
		// data.name = "홍길동";
		// The field Data.name is not visible
		
		
		data.setName("홍길동");
		System.out.println(data.getName());
		System.out.println("-----------------------");
		
		// 연봉 70,000,000 ===> 5% 인상해서 출력해 보세요
		
		data.setSal(70000000*1.05);			// 7.35E7  --> 7.35*10^7 --> 73500000 --> 73,500,000
		System.out.println((int)data.getSal());
		
		
	}
}
