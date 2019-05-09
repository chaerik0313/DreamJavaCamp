package dreamschool.cscourse.chapter10;

public class MobileTest {

	public static void main(String[] args) {
		Mobile[] mobiles = new Mobile[2];
		mobiles[0] = new Galaxy();
		mobiles[1] = new IPhone();
		
		((Galaxy)mobiles[0]).setOsVersion("안드로이드 오레오");
		System.out.println("Galaxy : " + ((Galaxy)mobiles[0]).getOsVersion());
		mobiles[0].call(5);
		mobiles[0].charge(30);
		((IPhone)mobiles[1]).setColor("흰색");
		System.out.println("IPhone : " + ((IPhone)mobiles[1]).getColor());
		((IPhone)mobiles[1]).getColor();
		mobiles[1].call(10);
		mobiles[1].charge(15);
		((Galaxy)mobiles[0]).buy("게임 앱", 1000);
	}

}
