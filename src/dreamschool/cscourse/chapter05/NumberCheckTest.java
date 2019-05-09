package dreamschool.cscourse.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int number1 = 2;
		int number2 = 3;
		
		if (number1 * number2 < 0) {
			System.out.println(number1 + "*" + number2 + ": 음수는 확인하지 않습니다.");
		}else if (number1 * number2 < 10) {
			System.out.println(number1 + "*" + number2 + ": 한 자리 수입니다.");
		}else if (number1 * number2 < 100) {
			System.out.println(number1 + "*" + number2 + ": 두 자리 수입니다.");
		}else{
			System.out.println(number1 + "*" + number2 + ": 세 자리 수 이상입니다.");
		}
		int number3 = 4;
		int number4 = 5;
		
		if (number3 * number4 < 0) {
			System.out.println(number3 + "*" + number4 + ": 음수는 확인하지 않습니다.");
		}else if (number3 * number4 < 10) {
			System.out.println(number3 + "*" + number4 + ": 한 자리 수입니다.");
		}else if (number3 * number4 < 100) {
			System.out.println(number3 + "*" + number4 + ": 두 자리 수입니다.");
		}else{
			System.out.println(number3 + "*" + number4 + ": 세 자리 수 이상입니다.");
		}
		int number5 = 23;
		int number6 = 96;
		
		if (number5 * number6 < 0) {
			System.out.println(number5 + "*" + number6 + ": 음수는 확인하지 않습니다.");
		}else if (number5 * number6 < 10) {
			System.out.println(number5 + "*" + number6 + ": 한 자리 수입니다.");
		}else if (number5 * number6 < 100) {
			System.out.println(number5 + "*" + number6 + ": 두 자리 수입니다.");
		}else{
			System.out.println(number5 + "*" + number6 + ": 세 자리 수 이상입니다.");
		}
		int number7 = 4;
		int number8 = -3;
		
		if (number7 * number8 < 0) {
			System.out.println(number7 + "*" + number8 + ": 음수는 확인하지 않습니다.");
		}else if (number7 * number8 < 10) {
			System.out.println(number7 + "*" + number8 + ": 한 자리 수입니다.");
		}else if (number7 * number8 < 100) {
			System.out.println(number7 + "*" + number8 + ": 두 자리 수입니다.");
		}else{
			System.out.println(number7 + "*" + number8 + ": 세 자리 수 이상입니다.");
		}
	}

}
