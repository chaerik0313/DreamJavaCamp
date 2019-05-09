package dreamschool.cscourse.chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol[] idol = new Idol[4];
		idol[0] = new Idol("¼Ò³à½Ã´ë","ÅÂ¿¬");
		idol[1] = new Idol("¾¾½ºÅ¸","º¸¶ó");
		idol[2] = new Idol("ºò¹ð","Áöµå·¡°ï");
		idol[3] = new Idol("ºñ½ºÆ®","¾ç¿ä¼·");

		for (int i = 0;i < idol.length;i++) {
			idol[i].printIdolInfo();
		}
	}

}
