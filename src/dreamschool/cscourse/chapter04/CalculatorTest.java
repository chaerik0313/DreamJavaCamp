package dreamschool.cscourse.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 7;
		
		int additionResult = number1 + number2;
		int subtractionResult = number1 - number2;
		int multiplicationResult = number1 * number2;
		int divisionResult = number1 / number2;
		int remainderResult = number1 % number2;
		
		System.out.println("µ¡¼À °á°ú:" + additionResult);
		System.out.println("»¬¼À °á°ú:" + subtractionResult);
		System.out.println("°ö¼À °á°ú:" + multiplicationResult);
		System.out.println("³ª´°¼À °á°ú:" + divisionResult);
		System.out.println("³ª¸ÓÁö:" + remainderResult);

		
	}

}
