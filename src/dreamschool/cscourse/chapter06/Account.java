package dreamschool.cscourse.chapter06;

public class Account {
	String accountName;
	String accountNo;
	int balance;
	
	void deposit(int money) {
		if (money < 0) {
			System.out.println("금액은 음수를 입력할 수 없습니다.");
		}else {
			balance += money;
		}
		
	}
	int withdraw(int money) {
		if (money < 0) {
			System.out.println("금액은 음수를 입력할 수 없습니다.");
			return 0;
		}else if(money > balance){
			System.out.println("[에러]잔액이 부족합니다.");
			return 0;
		}else{
			balance -= money;{
			return money;
			
		}
		
	}
	}
	void balanceCheck() {
		System.out.println("계좌 " + accountNo + "(예금주 : " + accountName + ")");		
		System.out.println("잔액 : " + balance);
	}
}
