package dreamschool.cscourse.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		americano.name = "�Ƹ޸�ī��";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "ī���";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee machi= new Coffee();
		machi.name = "�����ƶ�";
		machi.price = 4500;
		machi.printCoffeeInfo();
		
		System.out.println("�� �ݾ� : " + (americano.price + latte.price + machi.price) + "��");
		
		
				
		
	}

}
