package dreamschool.cscourse.chapter06;

public class Car {
	String name;
	int oil;
	double distance;

	
	void charge(int addOil) {
		System.out.println("�ֹ��� " + addOil + "L �����մϴ�.");
		oil += addOil;
	}
	void drive(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + "���� " + endPoint + "���� " + driveDistance + "km �����Ͽ����ϴ�.");
		distance += driveDistance;
		oil = oil - (int)(driveDistance / 20);
	}
	void oilCheck() {
		System.out.println("[" + name + "ī~] ���� �⸧��: " + oil + "L, �� ����Ÿ� : " + distance + "km");
		
	}
	void distanceCheck() {
		System.out.println("���� ������ �Ÿ��� �� " + (oil*20) +"km �Դϴ�.");
	}
	

	
}
