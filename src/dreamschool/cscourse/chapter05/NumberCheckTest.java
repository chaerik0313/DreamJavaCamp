package dreamschool.cscourse.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int number1 = 2;
		int number2 = 3;
		
		if (number1 * number2 < 0) {
			System.out.println(number1 + "*" + number2 + ": ������ Ȯ������ �ʽ��ϴ�.");
		}else if (number1 * number2 < 10) {
			System.out.println(number1 + "*" + number2 + ": �� �ڸ� ���Դϴ�.");
		}else if (number1 * number2 < 100) {
			System.out.println(number1 + "*" + number2 + ": �� �ڸ� ���Դϴ�.");
		}else{
			System.out.println(number1 + "*" + number2 + ": �� �ڸ� �� �̻��Դϴ�.");
		}
		int number3 = 4;
		int number4 = 5;
		
		if (number3 * number4 < 0) {
			System.out.println(number3 + "*" + number4 + ": ������ Ȯ������ �ʽ��ϴ�.");
		}else if (number3 * number4 < 10) {
			System.out.println(number3 + "*" + number4 + ": �� �ڸ� ���Դϴ�.");
		}else if (number3 * number4 < 100) {
			System.out.println(number3 + "*" + number4 + ": �� �ڸ� ���Դϴ�.");
		}else{
			System.out.println(number3 + "*" + number4 + ": �� �ڸ� �� �̻��Դϴ�.");
		}
		int number5 = 23;
		int number6 = 96;
		
		if (number5 * number6 < 0) {
			System.out.println(number5 + "*" + number6 + ": ������ Ȯ������ �ʽ��ϴ�.");
		}else if (number5 * number6 < 10) {
			System.out.println(number5 + "*" + number6 + ": �� �ڸ� ���Դϴ�.");
		}else if (number5 * number6 < 100) {
			System.out.println(number5 + "*" + number6 + ": �� �ڸ� ���Դϴ�.");
		}else{
			System.out.println(number5 + "*" + number6 + ": �� �ڸ� �� �̻��Դϴ�.");
		}
		int number7 = 4;
		int number8 = -3;
		
		if (number7 * number8 < 0) {
			System.out.println(number7 + "*" + number8 + ": ������ Ȯ������ �ʽ��ϴ�.");
		}else if (number7 * number8 < 10) {
			System.out.println(number7 + "*" + number8 + ": �� �ڸ� ���Դϴ�.");
		}else if (number7 * number8 < 100) {
			System.out.println(number7 + "*" + number8 + ": �� �ڸ� ���Դϴ�.");
		}else{
			System.out.println(number7 + "*" + number8 + ": �� �ڸ� �� �̻��Դϴ�.");
		}
	}

}
