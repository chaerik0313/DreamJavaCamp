package dreamschool.cscourse.chapter09;

public class ProductTest {
	public static void main(String[] args) {
	Product tong = new Product("�뵹��", 450000,8);
	Television cin = new Television("�ó׸� TV",3500000,10,"ȭ�� ũ�� 151cm");
	System.out.println("=======��ǰ����=======");
	
	tong.printProductInfo();
	System.out.println("--------------------");
	cin.printTelevisionInfo();
	System.out.println();
	
	tong.setDiscountRate(15);
	cin.setDiscountRate(15);
	System.out.println("[����] �������� ��� 15%�� �����մϴ�!!");
	System.out.println();
	
	System.out.println("�뵹�� �ǸŰ� : " + tong.calculateDiscountPrice());
	System.out.println("�ó׸� TV �ǸŰ� : " + cin.calculateDiscountPrice());
}
}
