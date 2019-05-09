package dreamschool.cscourse.workshop02;

public class BookCollectionTest {
    
    public static void main( String[] args ) {
        Book[] bookList = {new Book( "���� �Ƿ��� ����", "���׳�" ),
        		new Book( "�̰��� �۾���    ", "��Ű ���ν�" ),
        		new Book( "9788946061392", "�α��� ã�Ƽ�     ", "��ȿ��", 19500 ),
        		new Book( "9788964150719", "�ι��� ���� ����    ", "������", 14800 ),
        		new Book( "9791186561188", "ȥ�ڰ� �Ǵ� å��", "�ֿ�ȣ", 15000, "2016-02-29" ),
        		new Book( "9788954637169", "���� ������ �ູ", "����", 14000, "2016-01-25" ),
        		new Book( "9791185392080", "�Ϲ��� ���� 4�� ��", "���̽���", 14000, "2014-12-29" )};
        
        System.out.println( ">> ���� ���" );
        	for (int i = 0; i < bookList.length; i++) {
        		bookList[i].printBookInfo();
        	}
        System.out.println( "\n>> ������ 15000�� ������ ���� ã��" );
        	for (int j = 0; j < bookList.length;j++) {
        		if ((bookList[j].getPrice() > 0 ) && (bookList[j].getPrice() <= 15000)) {
        			bookList[j].printBookInfo();
        		}
        	}
        System.out.println( "\n>> ISBN ��ȣ�� 9788964150719�� ���� �����ϱ��ϰ� ��Ͽ��� �����ϱ�" );
        	for (int k = 0; k < bookList.length; k++) {
        		if("9788964150719".equals(bookList[k].getIsbn())) {
        			bookList[k].printBookInfo();
        			for(int m = 1; m < bookList.length-1; m++) {
        				  bookList[m] = bookList[m+1];
        				  //�������� �����ϱ�
        			}	 
        		}
        	}
        System.out.println( "\n>> ���� ���" );
        for (int n = 0; n < bookList.length; n++) {
    		bookList[n].printBookInfo();
    	} 
    }
}