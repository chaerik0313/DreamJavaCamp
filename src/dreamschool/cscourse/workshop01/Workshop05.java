package dreamschool.cscourse.workshop01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double computerScience = getUserInput();
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double javaProgramming = getUserInput();
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double engineeringMathematics = getUserInput();
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double understandingOfOpera = getUserInput();
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double badminton = getUserInput();

        System.out.println( "==============================" );
        double average = (computerScience + javaProgramming + engineeringMathematics + understandingOfOpera + badminton) / 5; 
        if ((average >= 3.7) && (((((computerScience >= 2.5) && (javaProgramming >= 2.5)) && (engineeringMathematics >= 2.5)) && (understandingOfOpera >= 2.5)) && (badminton >= 2.5))){
        		System.out.println("������" + average + "�Դϴ�.");
        		System.out.println("���� �б� ���б� ����� �Դϴ�.");
      
        }else {
        	System.out.println( "������" + average + "�Դϴ�." );
        }
        	
      
        
    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}
