package dreamschool.cscourse.chapter10.dreamfactory;

public class CreateFactory {
	public static IProduct create(String name) {
		if (name.equals("A")) {
			return new ProductA();
		}else if(name.equals("B")) {
			return new ProductB();
		}else if (name.equals("C")) {
			return new ProductC();
		}else {
			return null;
		}
	}
}
