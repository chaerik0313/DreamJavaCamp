package dreamschool.cscourse.chapter07;

public class StudentTest {

	public static void main(String[] args) {
		Student.printTitle();
		System.out.println(Student.COURSE);
		
		Student stu = new Student();
		stu.printTitle();
		System.out.println(stu.id);
		System.out.println(stu.name);
		System.out.println(stu.COURSE);
	}

}
