package dreamschool.cscourse.chapter08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		Account[] account = {new Account("111-2222-5551",10000,4.5),
				new Account("111-2222-5552",20000,4.5),
				new Account("111-2222-5553",30000,4.5),
				new Account("111-2222-5554",40000,4.5),
				new Account("111-2222-5555",50000,4.5)};
		
		for (int i = 0; i < account.length; i++) {
			account[i].printAccountInfo();
		}
		System.out.println();
		System.out.println("이율을 변경합니다.");
		System.out.println();
		for (int i = 0; i < account.length;i++) {
			account[i].calculateInterest(account[i].setInterestRate(3.7));
			account[i].printBalanceInfo();
		}
		
	}

}
