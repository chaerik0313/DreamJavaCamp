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
		
		System.out.println("연봉:" + totalAnnualSalary + ", 세후 연봉:" + annualSalaryAfterTax);
		System.out.println("보너스:" + annualBonus +", 세후 보너스:" + bonusAfterTax);
		System.out.println("지급액:" + totalIncome);
		
		
		
	}

}
