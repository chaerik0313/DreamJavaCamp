package dreamschool.cscourse.chapter10;

public class IPhone extends Mobile{
	private String color;

	@Override
	public void call(int time) {
		System.out.println("IPhone : " + time + "분 통화했습니다.");
	}
	@Override
	public void charge(int time) {
		System.out.println("IPhone : " + time + "분 충전했더니 Full!!");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
