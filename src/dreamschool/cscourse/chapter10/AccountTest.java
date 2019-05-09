package dreamschool.cscourse.chapter10;

public class AccountTest {

	public static void main(String[] args) {
		
		Account[] accounts = new Account[3];
		accounts[0] = new Account("1313-445566","Àü¿ìÄ¡",100000);
		accounts[1] = new FundAccount("111-2222","È«±æµ¿",5000000,5.6);
		accounts[2] = new FundAccount("666-7777","È«±æ¼ø",1000000,2.9);
		
		System.out.println(accounts[0]);
		System.out.println();
		((FundAccount)accounts[1]).earnMoney();
		System.out.println((FundAccount)accounts[1]);
		System.out.println();
		((FundAccount)accounts[2]).earnMoney();
		System.out.println((FundAccount)accounts[2]);
		
		

	}

}
