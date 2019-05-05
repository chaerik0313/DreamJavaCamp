package icehs.science.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String kingSejong = "¼¼Á¾´ë¿Õ";
		String manWon = "10000";
		int year = 2017;
		String yesNo = "true";
		
		boolean boolYesNo = Boolean.parseBoolean(yesNo);
		int intManWon = Integer.parseInt(manWon);
				
		System.out.println(kingSejong + " : " + manWon);
		System.out.println(year + "³â");
		System.out.println(manWon + year);
		System.out.println(intManWon + year);
		System.out.println(!boolYesNo);
		
	}

}
