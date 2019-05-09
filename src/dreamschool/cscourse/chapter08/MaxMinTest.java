package dreamschool.cscourse.chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int[] array = {12,53,24,10,22,38,64,39};
		
		int max = array[0];
		int min = array[0];
		System.out.print("배열 데이터 : ");
		for(int i = 0; i < array.length; i++) {
			if(i == array.length-1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("\n 최대값 : " + max);
		System.out.println(" 최소값 : " + min);

	}

}
