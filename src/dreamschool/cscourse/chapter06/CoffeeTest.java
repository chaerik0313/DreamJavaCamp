package dreamschool.cscourse.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		americano.name = "아메리카노";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "카페라떼";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee machi= new Coffee();
		machi.name = "마끼아또";
		machi.price = 4500;
		machi.printCoffeeInfo();
		
		System.out.println("총 금액 : " + (americano.price + latte.price + machi.price) + "원");
		
		
				
		
	}

}
