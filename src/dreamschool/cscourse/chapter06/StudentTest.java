package dreamschool.cscourse.chapter06;

public class StudentTest {
	
	public static void main(String[] args) {
	Student stu = new Student();
	stu.studentName = "홍길동";
	stu.studentNo = "S001";
	stu.korean = 94;
	stu.english = 80;
	stu.math = 89;
	
	stu.printStudent();
	System.out.println("*학번을 변경합니다!!!");
	stu.changeStudentNo("STU0001");
	
	stu.printStudent();
}
}
