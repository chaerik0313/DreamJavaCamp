package dreamschool.cscourse.workshop02;

public class AccountTest {
    
    public static void main( String[] args ) {
        
        System.out.println( ">> 계좌를 생성합니다." );
        Account acc = new Account( "441-0290-1203", 500000, 7.3 );
        acc.printAccountInfo();
        System.out.println("\n");
        
        acc.deposit(20000);
        System.out.println("\n");
        
        acc.calculateInterest();
        System.out.println("\n");
        
        acc.withdraw(150000);
        System.out.println("\n");
        
        acc.withdraw(500000);
        
        
    }
}