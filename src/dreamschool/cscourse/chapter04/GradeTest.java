package dreamschool.cscourse.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int testScore = 75;
		boolean result1 = (testScore <= 100) && (testScore >= 90);
		boolean result2 = (testScore < 90) && (testScore >= 80);
		boolean result3 = (testScore < 80) && (testScore >= 70);
		boolean result4 = (testScore < 70) && (testScore >= 60);

		System.out.println("A학점:" + result1);
		System.out.println("B학점:" + result2);
		System.out.println("C학점:" + result3);
		System.out.println("D학점:" + result4);
		
	}

}
