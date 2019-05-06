package dreamschool.cscourse.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		int num1 = 456 / 100;
		int num2 = (456 % 100) / 10;
		int num3 = (456 % 10);
		
		System.out.println("숫자:" + num);
		System.out.println("백의 자리 수 :" + num1);
		System.out.println("십의 자리 수:" + num2);
		System.out.println("일의 자리 수:" + num3);
	} 

}
