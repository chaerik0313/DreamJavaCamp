package dreamschool.cscourse.chapter10;

public class Galaxy extends Mobile implements GooPlay{
	private String osVersion;

	@Override
	public void call(int time) {
		System.out.println("Galaxy : " + time + "분 통화했습니다.");
	}
	@Override
	public void charge(int time) {
		System.out.println("Galaxy : 보조 배터리 " + time + "분 충전");
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "을 " + price + "원에 구입했습니다.");
	}
	
}
