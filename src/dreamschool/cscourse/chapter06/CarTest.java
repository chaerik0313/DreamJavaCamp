package dreamschool.cscourse.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.name = "ICE";
		car.oil = 5;
		car.distance = 140.0;
		
		car.oilCheck();
		car.charge(10);
		car.oilCheck();
		car.drive("IT����", "��õ����", 10.17);
		car.oilCheck();
		car.drive("��õ����", "�����ϸ���Ʈ", 60.21);
		car.oilCheck();
		car.distanceCheck();
		
	}

}
