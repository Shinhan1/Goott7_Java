package d20191227_OOP;

public class HandPhone {
	private String productName;
	private String productType;
	private int price;
	private int phoneNumber;

	// setter
	public void setInfo(String name, String type, int price, int num) {
		this.productName = name;
		this.productType = type;
		this.price = price;
		this.phoneNumber = num;
	}
	
	// getter
	public String getInfo() {
		return this.productName + this.productType + this.price + this.phoneNumber;
	}

}
