package dreamschool.cscourse.workshop02;

public class BookCollectionTest {
    
    public static void main( String[] args ) {
        Book[] bookList = {new Book( "조선 실록의 세계", "오항녕" ),
        		new Book( "이공계 글쓰기    ", "유키 히로시" ),
        		new Book( "9788946061392", "인권을 찾아서     ", "조효제", 19500 ),
        		new Book( "9788964150719", "인문학 따라 쓰기    ", "고정욱", 14800 ),
        		new Book( "9791186561188", "혼자가 되는 책들", "최원호", 15000, "2016-02-29" ),
        		new Book( "9788954637169", "법륜 스님의 행복", "법륜", 14000, "2016-01-25" ),
        		new Book( "9791185392080", "하버드 새벽 4시 반", "웨이슈잉", 14000, "2014-12-29" )};
        
        System.out.println( ">> 도서 출력" );
        	for (int i = 0; i < bookList.length; i++) {
        		bookList[i].printBookInfo();
        	}
        System.out.println( "\n>> 가격이 15000원 이하인 도서 찾기" );
        	for (int j = 0; j < bookList.length;j++) {
        		if ((bookList[j].getPrice() > 0 ) && (bookList[j].getPrice() <= 15000)) {
        			bookList[j].printBookInfo();
        		}
        	}
        System.out.println( "\n>> ISBN 번호가 9788964150719인 도서 구매하기하고 목록에서 삭제하기" );
        	for (int k = 0; k < bookList.length; k++) {
        		if("9788964150719".equals(bookList[k].getIsbn())) {
        			bookList[k].printBookInfo();
        			for(int m = 1; m < bookList.length-1; m++) {
        				  bookList[m] = bookList[m+1];
        				  //마지막꺼 삭제하기
        			}	 
        		}
        	}
        System.out.println( "\n>> 도서 출력" );
        for (int n = 0; n < bookList.length; n++) {
    		bookList[n].printBookInfo();
    	} 
    }
}