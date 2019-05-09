package dreamschool.cscourse.chapter08;

public class BubbleSortTest {

	public static void main(String[] args) {
		int[] array1 = {12,53,24,10,22,38,64,39};
		int[] array2 = new int[8];
		
		int max = array2[7];
		int min = array2[0];

		System.out.print("정렬 전 데이터 : ");
		for(int h = 0;h < array1.length;h++) {
			System.out.print(array1[h]);
		}
			System.out.print("\n 정렬 후 데이터 : ");
			for(int k = 0;k < array2.length;k++) {
				System.out.print(array2[k]);
		}
		}
}
