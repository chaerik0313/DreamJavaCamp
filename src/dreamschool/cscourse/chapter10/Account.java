package dreamschool.cscourse.chapter10;

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

	@Override
	public String toString() {
		String str = "";
		str += "계좌번호 : " + this.number + "\n";
		str += "예금주 : " + this.name + "\n";
		str += "잔액 : " + this.balance + "원";
		return str;
	}
}
