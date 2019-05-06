package dreamschool.cscourse.chapter03;

public class EmploymentInformation {

	public static void main(String[] args) {
		String name = "홍길동";
		int thisYear = 2019;
		String employYear = "2002";
		
		int intEmployYear = Integer.parseInt(employYear);
		int empYear = thisYear - intEmployYear;		
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + employYear);
		System.out.println("근무년수 : " + (thisYear-intEmployYear));
		System.out.println("근무년수 : " + empYear);
		
		
	}

}
