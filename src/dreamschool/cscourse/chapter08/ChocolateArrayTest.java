package dreamschool.cscourse.chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		Chocolate[] chocos = new Chocolate[3];
		chocos[0] = new Chocolate("아마도라", "다크", 2200);
		chocos[1] = new Chocolate("카페 키리쉬", "다크", 2500);
		chocos[2] = new Chocolate("트리플 블랑", "화이트", 2300);
		
		int sum = 0;
		for(int i = 0 ; i < chocos.length; i++) {
			chocos[i].printChocolateInfo();
			if ("화이트".equals(chocos[i].getType())) {
				sum = sum + chocos[i].getPrice() * 80 / 100;
			}else {
				sum += chocos[i].getPrice();
			}
		}
		System.out.println("하나씩 구매했을 때 총 가격 :" + sum);

	}

}
