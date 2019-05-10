package dreamschool.cscourse.chapter10.dreamfactory;

public class FactoryTest {

	public static void main(String[] args) {
		IProduct[] pros = new IProduct[4];
		pros[0] = CreateFactory.create("A");
		pros[1] = CreateFactory.create("B");
		pros[2] = CreateFactory.create("C");
		pros[3] = CreateFactory.create("A");
		
	for (IProduct pro : pros) {
		pro.printProductInfo();
	}
	}
	

}
