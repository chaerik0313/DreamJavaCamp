package dreamschool.cscourse.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tel1 = new Television("INFINIA",1500000);
		Television tel2 = new Television("XCANVAS","LCD TV",1000000);
		Television tel3 = new Television("CINEMA","3D TV",2000000);
		
		tel1.printTelevisionInfo();
		tel2.printTelevisionInfo();
		tel3.printTelevisionInfo();
		
		System.out.println("가격의 합 : " + (tel1.price + tel2.price + tel3.price));
	}

}
