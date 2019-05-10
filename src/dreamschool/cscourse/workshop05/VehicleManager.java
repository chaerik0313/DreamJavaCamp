package dreamschool.cscourse.workshop05;

import java.util.ArrayList;

public class VehicleManager {
	ArrayList<Vehicle> vehicles = new ArrayList();
	
	public VehicleManager() {
		
		vehicles.add(new Airplane("����747",1300,300,4));
		vehicles.add(new Airplane("F-15",1600,1,1));
		vehicles.add(new Car("�׷���", 180, 5, 10));
		vehicles.add(new Car("����ũ", 130, 4, 15));
		vehicles.add(new Car("��Ÿ����", 150, 10, 11));
		vehicles.add(new Ship("ũ����2", 30, 400,35000 ));
		vehicles.add(new Ship("��ƿ����", 25, 150, 15000));
	}
	public void displayVehicles(String title) {
		System.out.println(title);
		for (Vehicle vehicle : vehicles) {
			vehicle.displayInfo();
			vehicle.setAvailable(true);
		}

		
		System.out.println();
	}
}

