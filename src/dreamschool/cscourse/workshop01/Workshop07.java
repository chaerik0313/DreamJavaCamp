package dreamschool.cscourse.workshop01;

import java.util.Random;
import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		int compNo = getHiddenNumber();
		//System.out.println(compNo);
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "��° ��ȸ�Դϴ�. ���ڸ� �Է��ϼ��� : ");
			int num = getUserInput();
			if (num == compNo) {
				System.out.println("�����մϴ�!!");
				break;
			}else if(num > compNo){
				System.out.println(num + "���� �۽��ϴ�.");
			}else if(num < compNo){
				System.out.println(num + "���� Ů�ϴ�.");
			}
		}System.out.println("�����մϴ�. Bye~ Bye~");
		

	}
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(100);
		return num;
	}
	public static int getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }

}
