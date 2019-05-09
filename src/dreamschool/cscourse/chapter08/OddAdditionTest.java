package dreamschool.cscourse.chapter08;

public class OddAdditionTest {

	public static void main(String[] args) {
		int[] numbers = {10,21,33,42,51,64,79,80};
		
		int oddSum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				oddSum += numbers[i];
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println("\n" + "홀수들의 합계는 " + oddSum + "입니다.");
		
		
	}

}
