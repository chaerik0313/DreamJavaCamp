package dreamschool.cscourse.workshop04;

public class Ship extends Vehicle{
	
	private int replacement;

	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		super(modelName,maxSpeed,numberLimit);
		this.replacement = replacement;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" ¹è ¼ö ·® : " + replacement + "Åæ");
	}
}
