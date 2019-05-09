package dreamschool.cscourse.chapter10;

public class Bird extends Animal implements Flyable{
	private String habitat;

	public Bird(String kind, int age,String habitat) {
		super(kind, age);
		this.habitat = habitat;
	}
	public void fly() {
		System.out.println("���ư���.");
	}
	public void spreadWings() {
		System.out.println("������ ��ģ��.");
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	

	
	
}
