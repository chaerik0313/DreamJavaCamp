package dreamschool.cscourse.chapter06;

public class Account {
	String accountName;
	String accountNo;
	int balance;
	
	void deposit(int money) {
		if (money < 0) {
			System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.");
		}else {
			balance += money;
		}
		
	}
	int withdraw(int money) {
		if (money < 0) {
			System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.");
			return 0;
		}else if(money > balance){
			System.out.println("[����]�ܾ��� �����մϴ�.");
			return 0;
		}else{
			balance -= money;{
			return money;
			
		}
		
	}
	}
	void balanceCheck() {
		System.out.println("���� " + accountNo + "(������ : " + accountName + ")");		
		System.out.println("�ܾ� : " + balance);
	}
}