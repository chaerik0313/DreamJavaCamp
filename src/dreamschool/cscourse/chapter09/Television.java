package dreamschool.cscourse.chapter09;

public class Television extends Product {
	private String description;

	public Television(String name, int price, int discountRate,String description) {
		super(name, price, discountRate);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public void printTelevisionInfo() {
		System.out.println("제품명 : " + this.getName());
		System.out.println("정가 : " + this.getPrice()  + "원 (할인율 : " + this.getDiscountRate() + "%)");
		System.out.println("판매가 : " + calculateDiscountPrice());
		System.out.println("비고 : " + description);
		
	}
	
}
