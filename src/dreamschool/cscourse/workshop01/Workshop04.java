package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americano = getUserInput();
        System.out.print( " ī��� �ֹ� ���� : " );
        int latte = getUserInput();
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagel = getUserInput();
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int creamcheese = getUserInput();
        
        System.out.println( "========= �ݾ� =========" );
        int americanoTotalPrice = 2000 * americano;
        int latteTotalPrice = 3000 * latte;
        int bagelTotalPrice = 1500 * bagel;
        int creamcheeseTotalPrice = 500 * creamcheese;
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " + americanoTotalPrice + "��\n" );
        System.out.print( " ī��� �ֹ� ���� : " + latteTotalPrice + "��\n");
        System.out.print( " ���̱� �ֹ� ���� : " + bagelTotalPrice + "��\n");
        System.out.print( " ũ��ġ�� �ֹ� ���� : " + creamcheeseTotalPrice + "��\n");
        
        System.out.println( "======================" );
        int totalPrice = (americanoTotalPrice + latteTotalPrice + bagelTotalPrice + creamcheeseTotalPrice);
        System.out.println(" �� ���� �ݾ� : " + totalPrice);
        int point = 0;
        if (totalPrice < 12000) {
        }else if(totalPrice < 30000){
        	point = totalPrice / 100 * 1;
        }else if(totalPrice > 30000) {
        	point = totalPrice / 100 * 2;
        }
        System.out.println(" ����Ʈ ���� : " + point + "��");
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
