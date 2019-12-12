public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary; // base salary per week

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return String.format("%s%n%s%n%s: %.2f", "Base-salaried", super.toString(), "base salary", getBaseSalary());
	}

}
