package dreamschool.cscourse.chapter03;

public class EmploymentInformation {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		int thisYear = 2019;
		String employYear = "2002";
		
		int intEmployYear = Integer.parseInt(employYear);
		int empYear = thisYear - intEmployYear;		
		System.out.println("�̸� : " + name);
		System.out.println("�Ի�⵵ : " + employYear);
		System.out.println("�ٹ���� : " + (thisYear-intEmployYear));
		System.out.println("�ٹ���� : " + empYear);
		
		
	}

}
