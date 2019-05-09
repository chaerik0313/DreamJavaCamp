package dreamschool.cscourse.chapter05;

public class GuGuDanOddNumberTest {

	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 5; dan++) {
			for (int count = 1; count <= 9; count++) {
				int result = dan * count;
				if (result % 2 != 0){
					System.out.println(dan + " * " + count + " = " + result);
				}
				
			}
		}
	}

}
