package dreamschool.cscourse.chapter08;

public class Doctor {
	private String name;
	private String department;
	
	public Doctor(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public void treatPatient() {
		System.out.println("ȯ�ڸ� �����մϴ�.");
	}
	public void printDoctor() {
		System.out.println(this.department + ":" + this.name + "������"); 
	}
	
}
