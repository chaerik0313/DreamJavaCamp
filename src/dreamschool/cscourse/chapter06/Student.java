package dreamschool.cscourse.chapter06;

public class Student {
	String studentName;
	String studentNo;
	int korean;
	int english;
	int math;
	
	double calculateAverage() {
		double average = (korean + english + math) / (double)3;
		return average;
	}
	void printStudent() {
		System.out.println("�̸� : " + studentName);
		System.out.println("�й� : " + studentNo);
		System.out.println("���� ���� : " + korean);
		System.out.println("���� ���� : " + english);
		System.out.println("���� ���� : " + math);
		System.out.println("���� ���: " + calculateAverage());
	}
	void changeStudentNo(String newStudentNo) {
		studentNo = newStudentNo;
		
		
	}
}
