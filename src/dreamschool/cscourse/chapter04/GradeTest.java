package dreamschool.cscourse.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int testScore = 75;
		boolean result1 = (testScore <= 100) && (testScore >= 90);
		boolean result2 = (testScore < 90) && (testScore >= 80);
		boolean result3 = (testScore < 80) && (testScore >= 70);
		boolean result4 = (testScore < 70) && (testScore >= 60);

		System.out.println("A����:" + result1);
		System.out.println("B����:" + result2);
		System.out.println("C����:" + result3);
		System.out.println("D����:" + result4);
		
	}

}
