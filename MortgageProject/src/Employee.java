public class Employee {
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private double monthlyIncome;
    private boolean isMarried;
    private double monthlyIncomeOfPartner;
    private String profession;

    public Employee() {
    }

    public Employee(int yearOfBirth, int monthOfBirth, int dayOfBirth, double monthlyIncome, boolean isMarried, double monthlyIncomeOfPartner, String profession) {
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.monthlyIncome = monthlyIncome;
        this.isMarried = isMarried;
        this.monthlyIncomeOfPartner = monthlyIncomeOfPartner;
        this.profession = profession;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public double getMonthlyIncomeOfPartner() {
        return monthlyIncomeOfPartner;
    }

    public void setMonthlyIncomeOfPartner(double monthlyIncomeOfPartner) {
        this.monthlyIncomeOfPartner = monthlyIncomeOfPartner;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
