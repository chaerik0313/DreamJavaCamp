package dreamschool.cscourse.chapter06;

public class OverloadingTest {

	public static void main(String[] args) {
		Overloading over = new Overloading();
		over.addition(1000, 465);
		over.addition(14.6, 35.4);
		over.addition("abc", "def");
	}

}
