package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class BookListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList();
		
		list.add(new Book("Java의 정석", 346, 15000));
		list.add(new Book("Oracle 11g", 560, 18000));
		list.add(new Book("JSP 따라하기", 271, 12000));

		list.get(1).setPrice(20000);
		list.remove(0);
		list.add(0, new Book("뇌를 자극하는 Java",900,25000));
		
		for (int i = 0; i < list.size();i++) {
			Book book = list.get(i);
			System.out.println((i+1) + "."+ book.getTitle() + "(" + book.getPage()  + "page) : " + book.getPrice() + "원");
		}
	}

}
