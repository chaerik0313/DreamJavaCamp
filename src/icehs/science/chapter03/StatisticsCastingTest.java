package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lotto = 0.0000001235;
		System.out.println("�ζǿ� ��÷�� Ȯ��:" + lotto);
		int intLotto = (int)lotto;
		System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ:" + intLotto);
		long population = 6973738433L;
		System.out.println("�� ������ �α� ��:" + population);
		int intPopulation = (int)population;
		System.out.println("�� ������ �α� �� int ��ȯ:" + intPopulation);
	}

}
