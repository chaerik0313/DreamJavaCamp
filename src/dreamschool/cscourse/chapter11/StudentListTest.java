package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class StudentListTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList();
		
		list.add(new Student("�̼���", 80,90,95));
		list.add(new Student("������",95,89,92));
		list.add(new Student("������",88,97,94));
		
		list.get(0).setEnglish(92);
		list.remove(1);
		
		for (Student stu : list) {
			System.out.println(stu.getName() + "(���� : " + stu.getKorean() + ", ���� : " + stu.getEnglish() + ", ���� : " + stu.getMath() + ")");
		}
		
	}

}
