package dreamschool.cscourse.chapter09;

public class Account {
	private String number;
	private String name;
	private int balance;
	
	
	public Account(String number, String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void openAccount() {
		System.out.println("���¸� �����մϴ�.");
		System.out.println("���¹�ȣ : " + this.number);
		System.out.println("������ : " + this.name);
		System.out.println("�ܾ� : " + this.balance + "��");
		
	}
}
