package dreamschool.cscourse.chapter09;

public class ProductTest {
	public static void main(String[] args) {
	Product tong = new Product("통돌이", 450000,8);
	Television cin = new Television("시네마 TV",3500000,10,"화면 크기 151cm");
	System.out.println("=======제품정보=======");
	
	tong.printProductInfo();
	System.out.println("--------------------");
	cin.printTelevisionInfo();
	System.out.println();
	
	tong.setDiscountRate(15);
	cin.setDiscountRate(15);
	System.out.println("[공지] 할인율을 모두 15%로 변경합니다!!");
	System.out.println();
	
	System.out.println("통돌이 판매가 : " + tong.calculateDiscountPrice());
	System.out.println("시네마 TV 판매가 : " + cin.calculateDiscountPrice());
}
}
