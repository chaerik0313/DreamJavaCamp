package dreamschool.cscourse.workshop04;

public class Vehicle {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean available;

	
	public Vehicle(String modelName, int maxSpeed, int numberLimit) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + modelName);
		System.out.println(" �ְ��ӵ� : " + maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + numberLimit + "��");
}
}