package dreamschool.cscourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(3, "�丣�þ�","�߿���");
		System.out.println(cat);

		cat.catInfo();
		cat.run();
		cat.hunt();
		cat.play();
		
		System.out.println();
		Dog dog = new Dog(2,"�ú������㽺Ű","�۸���");
		
		dog.dogInfo();
		dog.run();
		dog.hunt();
		
	}

}
