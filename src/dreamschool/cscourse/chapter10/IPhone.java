package dreamschool.cscourse.chapter10;

public class IPhone extends Mobile{
	private String color;

	@Override
	public void call(int time) {
		System.out.println("IPhone : " + time + "�� ��ȭ�߽��ϴ�.");
	}
	@Override
	public void charge(int time) {
		System.out.println("IPhone : " + time + "�� �����ߴ��� Full!!");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
