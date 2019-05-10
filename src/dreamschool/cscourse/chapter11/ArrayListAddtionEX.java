package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class ArrayListAddtionEX {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 10;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(number1);
		list.add(number2);
		list.add(100);
		list.add(130);
		list.add(25);
		list.add(((int)3.4));
		
		int a = list.get(4);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(int i : list) {
			System.out.println(i);
		}
	}

}
