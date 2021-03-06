package dreamschool.cscourse.chapter08;

public class Chocolate {
	private String name;
	private String type;
	private int price;
	

	public Chocolate(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getPrice() {
		return price;
	}
	int calculateTotalPrice(int count) {
		return count * price;
	}
	int calculateTotalPrice(int count, int discount) {
		return (count * price) * (100 - discount) / 100;
	}
	
	public void changeChocolateInfo(String newName, String newType, int newPrice) {
		name = newName;
		type = newType;
		price = newPrice;
		printChocolateInfo();
	}
	void printChocolateInfo() {
		System.out.println("이름 :" + name + ", 종류 : " + type + ", 가격 : " + price);
	}
	
}
