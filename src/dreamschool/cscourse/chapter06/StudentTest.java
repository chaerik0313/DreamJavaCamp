package dreamschool.cscourse.chapter06;

public class StudentTest {
	
	public static void main(String[] args) {
	Student stu = new Student();
	stu.studentName = "ȫ�浿";
	stu.studentNo = "S001";
	stu.korean = 94;
	stu.english = 80;
	stu.math = 89;
	
	stu.printStudent();
	System.out.println("*�й��� �����մϴ�!!!");
	stu.changeStudentNo("STU0001");
	
	stu.printStudent();
}
}
