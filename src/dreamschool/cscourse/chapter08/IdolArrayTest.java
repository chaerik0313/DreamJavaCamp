package dreamschool.cscourse.chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol[] idol = new Idol[4];
		idol[0] = new Idol("�ҳ�ô�","�¿�");
		idol[1] = new Idol("����Ÿ","����");
		idol[2] = new Idol("���","���巡��");
		idol[3] = new Idol("��Ʈ","��伷");

		for (int i = 0;i < idol.length;i++) {
			idol[i].printIdolInfo();
		}
	}

}
