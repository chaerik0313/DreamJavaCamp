package dreamschool.cscourse.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySalary = 1000000;
		int totalAnnualSalary = monthlySalary * 12;
		int annualSalaryAfterTax = totalAnnualSalary / 10 * 9;
		int bonus = monthlySalary / 100 * 20;
		int annualBonus = bonus * 4;
		int bonusAfterTax = annualBonus / 1000 * 945;
		int totalIncome = annualSalaryAfterTax + bonusAfterTax;
		
		System.out.println("����:" + totalAnnualSalary + ", ���� ����:" + annualSalaryAfterTax);
		System.out.println("���ʽ�:" + annualBonus +", ���� ���ʽ�:" + bonusAfterTax);
		System.out.println("���޾�:" + totalIncome);
		
		
		
	}

}
