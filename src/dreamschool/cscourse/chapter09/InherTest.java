package dreamschool.cscourse.chapter09;

public class InherTest {

	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿", "123-4567","Computer Science");
		Teacher tea = new Teacher("ȫ���", "123-5678","Computer");
		
		System.out.println("=====Student=====");
		stu.study();
		stu.eat();
		
		System.out.println("=====Teacher=====");
		tea.teach();
		tea.eat();
	}

}
