package dreamschool.cscourse.chapter08;

public class Account {
	private String number;
	private int balance;
	private double interestRate;
	
	public Account(String number, int balance, double interestRate) {
		this.number = number;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getNumber() {
		return number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public double setInterestRate(double interestRate) {
		this.interestRate = interestRate;
		return interestRate;
	}
	public void calculateInterest(double interestRate) {
		int interest = ((int)(this.interestRate * this.balance) / 100);
		this.balance += interest;
	}
	public void printAccountInfo() {
		System.out.println("���¹�ȣ : " + this.number + "/ �ܾ� : " + this.balance + "/ ���� : " + this.interestRate + "%");
	}
	public void printBalanceInfo() {
		System.out.println("���¹�ȣ : " + this.number + "/ ���� : " + this.interestRate + "% / �ܾ� : " + this.balance);
	}
	
}
