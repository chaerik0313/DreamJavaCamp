package dreamschool.cscourse.workshop02;

public class Account {
    
    private String account;
    private int    balance;
    private double interestRate;
    
    public Account() {
    }
    public Account( String account, int balance, double interestRate ) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public void calculateInterest(){
    	int interest = ((int)(balance * interestRate) / 100);
        balance += interest;
    	System.out.println(">> 이자를 지급합니다.");
    	System.out.println("이자 :" + interest + "원");
    	printAccountInfo();
    }
    public void deposit( int money ) {
    	balance += money;
    	System.out.println(">>" + money + "원을 입금합니다.");
    	printAccountInfo();
    }
    public void withdraw( int money ) {
    	if (money > balance) {
    		System.out.println(">>" + money + "원을 출금합니다.");
    		System.out.println("[에러] 잔액이 부족합니다.");
    		printAccountInfo();
    	}else {
    		balance -= money;
    		System.out.println(">>" + money + "원을 출금합니다.");
    		printAccountInfo();
    	}	
    }
    public void printAccountInfo() {
        System.out.print( "계좌 정보 : " + account + ", 잔액 : " + balance + "원, 이자율 : " + interestRate + "%" );
    }
}