package dreamschool.cscourse.chapter06;

public class Car {
	String name;
	int oil;
	double distance;

	
	void charge(int addOil) {
		System.out.println("휘발유 " + addOil + "L 주유합니다.");
		oil += addOil;
	}
	void drive(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + "에서 " + endPoint + "까지 " + driveDistance + "km 주행하였습니다.");
		distance += driveDistance;
		oil = oil - (int)(driveDistance / 20);
	}
	void oilCheck() {
		System.out.println("[" + name + "카~] 남은 기름양: " + oil + "L, 총 주행거리 : " + distance + "km");
		
	}
	void distanceCheck() {
		System.out.println("주행 가능한 거리는 약 " + (oil*20) +"km 입니다.");
	}
	

	
}
