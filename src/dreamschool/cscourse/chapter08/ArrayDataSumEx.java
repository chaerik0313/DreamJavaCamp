package dreamschool.cscourse.chapter08;

public class ArrayDataSumEx {

	public static void main(String[] args) {
		
		int[] numbers = {11,22,33,44,55,66,77,88,99};
		int sum = 0;
		
		System.out.print("배열의 각 요소 :");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			sum += numbers[i];
		}
		System.out.println("\n 총합 : " + sum);
	}

}
