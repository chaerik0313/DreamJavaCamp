package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// 문제 4.
// 커피 주문을 하려고 한다.
// 메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
// 그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
// 총 금액 12000원 이상 : 구매 금액의 1% 적립
// 총 금액 30000원 이상 : 구매 금액의 2% 적립
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원\n" );
        
        System.out.println( "========= 주문 =========" );
        System.out.print( " 아메리카노 주문 수량 : " );
        int americano = getUserInput();
        System.out.print( " 카페라떼 주문 수량 : " );
        int latte = getUserInput();
        System.out.print( " 베이글 주문 수량 : " );
        int bagel = getUserInput();
        System.out.print( " 크림치즈 주문 수량 : " );
        int creamcheese = getUserInput();
        
        System.out.println( "========= 금액 =========" );
        int americanoTotalPrice = 2000 * americano;
        int latteTotalPrice = 3000 * latte;
        int bagelTotalPrice = 1500 * bagel;
        int creamcheeseTotalPrice = 500 * creamcheese;
        System.out.print( " 아메리카노 주문 수량 : " + americanoTotalPrice + "원\n" );
        System.out.print( " 카페라떼 주문 수량 : " + latteTotalPrice + "원\n");
        System.out.print( " 베이글 주문 수량 : " + bagelTotalPrice + "원\n");
        System.out.print( " 크림치즈 주문 수량 : " + creamcheeseTotalPrice + "원\n");
        
        System.out.println( "======================" );
        int totalPrice = (americanoTotalPrice + latteTotalPrice + bagelTotalPrice + creamcheeseTotalPrice);
        System.out.println(" 총 구매 금액 : " + totalPrice);
        int point = 0;
        if (totalPrice < 12000) {
        }else if(totalPrice < 30000){
        	point = totalPrice / 100 * 1;
        }else if(totalPrice > 30000) {
        	point = totalPrice / 100 * 2;
        }
        System.out.println(" 포인트 적립 : " + point + "점");
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
