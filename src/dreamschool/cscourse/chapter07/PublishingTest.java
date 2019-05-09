package dreamschool.cscourse.chapter07;

public class PublishingTest {

	public static void main(String[] args) {
		Publication book1 = new Publication();
		Publication book2 = new Publication();
		System.out.println(book1);
		System.out.println(book2);
		
		book1.setBookInfo();
		book1.setTitle("¸¸È­ »ï±¹Áö");
		book1.setPrice(-2000);
		book1.setPage(-46);
		book1.setPrice(5000);
		book1.setPage(300);
		book1.printBookInfo();
		
		
	}

}
