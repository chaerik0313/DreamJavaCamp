package dreamschool.cscourse.chapter10;

public class Galaxy extends Mobile implements GooPlay{
	private String osVersion;

	@Override
	public void call(int time) {
		System.out.println("Galaxy : " + time + "�� ��ȭ�߽��ϴ�.");
	}
	@Override
	public void charge(int time) {
		System.out.println("Galaxy : ���� ���͸� " + time + "�� ����");
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "�� " + price + "���� �����߽��ϴ�.");
	}
	
}
