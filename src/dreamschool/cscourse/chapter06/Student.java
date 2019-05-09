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
		System.out.println("이름 : " + studentName);
		System.out.println("학번 : " + studentNo);
		System.out.println("국어 성적 : " + korean);
		System.out.println("영어 성적 : " + english);
		System.out.println("수학 성적 : " + math);
		System.out.println("성적 평균: " + calculateAverage());
	}
	void changeStudentNo(String newStudentNo) {
		studentNo = newStudentNo;
		
		
	}
}
