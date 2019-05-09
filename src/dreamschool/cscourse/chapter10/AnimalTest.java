package dreamschool.cscourse.chapter10;

public class AnimalTest {

	public static void main(String[] args) {
		Flyable bird1 = new Bird("독수리", 3, "바위산 등");
		Animal bird2 = new Bird("독수리", 3,"바위산 등");
		
		System.out.println(((Bird)bird1).getKind() + "(" + ((Bird)bird1).getAge() + "살) : " + ((Bird)bird1).getHabitat());
		bird1.spreadWings();
		bird1.fly();
		
		System.out.println(bird2.getKind() + "(" + bird2.getAge() + "살) : " + ((Bird)bird2).getHabitat());
		((Bird)bird2).spreadWings();
		((Bird)bird2).fly();
	}

}
