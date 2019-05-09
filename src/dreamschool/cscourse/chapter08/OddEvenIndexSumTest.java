package dreamschool.cscourse.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int[] array = {12,53,24,10,22,38,64,39};
		
		int oddSum = 0;
		int evenSum = 0;
		System.out.print("배열 데이터 : ");
		for(int i = 0;i < array.length; i++) {
			if(i == array.length-1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
			if(i % 2 == 0) {
				evenSum += array[i];
			}else {
				oddSum += array[i];
			}
			
		}
		System.out.println("\n 홀수 번째 정수의 합 : " + oddSum);
		System.out.println(" 짝수 번째 정수의 합 : " + evenSum);
		
	}

}
