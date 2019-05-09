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
		System.out.println("���� : " + this.title + ", ���� :" + this.price + "��, ������ : " + this.discounRate + " %, ���ΰ� : " + (int)(this.price*((100 - this.discounRate) / 100))  + "��");
	}
}
