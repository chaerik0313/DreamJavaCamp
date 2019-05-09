package dreamschool.cscourse.chapter07;

public class ItBook {
	private String title;
	private int price;
	private double discounRate;
	

	public ItBook(String title, int price, double discounRate) {
		this.title = title;
		this.price = price;
		this.discounRate = discounRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscounRate() {
		return discounRate;
	}
	public void setDiscounRate(double discounRate) {
		this.discounRate = discounRate;
	}
	public void printItBookInfo() {
		System.out.println("제목 : " + this.title + ", 정가 :" + this.price + "원, 할인율 : " + this.discounRate + " %, 할인가 : " + (int)(this.price*((100 - this.discounRate) / 100))  + "원");
	}
}
