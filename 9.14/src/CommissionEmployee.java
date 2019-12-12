public class CommissionEmployee extends Employee {
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
//Constructor

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public String toString() {
		return String.format("%s%n%s%n%s: %.2f%n%s: %.2f", super.toString(), "Commission employee", "gross sales",
				getGrossSales(), "commission rate", getCommissionRate());
	}
}
