package dreamschool.cscourse.chapter05;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int num1 = 23;
		
		for (int i = 2; i < num1; i++) {
			if(num1 % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
				break;	
			}else {
				System.out.println("�Ҽ��Դϴ�.");
				break;
			}
		}
	}
	
}
