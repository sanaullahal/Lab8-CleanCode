import java.time.LocalDate;
import java.time.Period;

public class MortgageCalculator {
	private static final int AGE_EIGHTEEN = 18;
	public double computeMaxMortgage(Employee employee) {
		double result = 0;
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(employee.getYearOfBirth(), employee.getMonthOfBirth(), employee.getDayOfBirth());
		 
		Period period = Period.between(birthday, today);
		int age = period.getYears();
		System.out.println(age);

		if (age < AGE_EIGHTEEN) return result;
		if (incomeBetween(employee, 2000, 3000)) {
			if (employee.getProfession().equals(Profession.DEVELOPER) ||
					employee.getProfession().equals(Profession.ARCHITECT) ||
					employee.getProfession().equals(Profession.SCRUM_MASTER)) result = 160000;

			if (employee.getProfession().equals(Profession.TESTER) ||
					employee.getProfession().equals(Profession.SYSTEM_ADMINISTRATOR) ||
					employee.getProfession().equals(Profession.TECHNICAL_WRITER)) result = 120000;

			if (employee.getProfession().equals(Profession.DEPARTMENT_HEAD) ||
					employee.getProfession().equals(Profession.PROFESSOR)) result = 220000;
		}else if (incomeBetween(employee, 3000, 5000)) {
			if (employee.getProfession().equals(Profession.DEVELOPER) ||
					employee.getProfession().equals(Profession.ARCHITECT) ||
					employee.getProfession().equals(Profession.SCRUM_MASTER)) result = 180000;

			if (employee.getProfession().equals(Profession.TESTER) ||
					employee.getProfession().equals(Profession.SYSTEM_ADMINISTRATOR) ||
					employee.getProfession().equals(Profession.TECHNICAL_WRITER)) result = 140000;

			if (employee.getProfession().equals(Profession.DEPARTMENT_HEAD) ||
					employee.getProfession().equals(Profession.PROFESSOR)) result = 250000;
		}else if (getIncome(employee, 500)) {
			if (employee.getProfession().equals(Profession.DEVELOPER) ||
					employee.getProfession().equals(Profession.ARCHITECT) ||
					employee.getProfession().equals(Profession.SCRUM_MASTER)) result = 220000;

			if (employee.getProfession().equals(Profession.TESTER) ||
					employee.getProfession().equals(Profession.SYSTEM_ADMINISTRATOR) ||
					employee.getProfession().equals(Profession.TECHNICAL_WRITER)) result = 160000;

			if (employee.getProfession().equals(Profession.DEPARTMENT_HEAD) ||
					employee.getProfession().equals(Profession.PROFESSOR)) result = 280000;
		}
		return result;
	}

	private boolean incomeBetween(Employee employee, int minValueInclusive, int maxValueExclusive) {
		if (employee.isMarried()){
			double totalIncome = employee.getMonthlyIncome() + employee.getMonthlyIncomeOfPartner() * 0.94;
			return totalIncome >= minValueInclusive && totalIncome <= maxValueExclusive;
		}else {
			return employee.getMonthlyIncome() >= minValueInclusive && employee.getMonthlyIncome() <= maxValueExclusive;
		}
	}

	private boolean getIncome(Employee employee, int value) {
		if (employee.isMarried()){
			double totalIncome = employee.getMonthlyIncome() + employee.getMonthlyIncomeOfPartner() * 0.94;
			return value <= totalIncome;
		}else {
			return value <= employee.getMonthlyIncome();
		}
	}

}
