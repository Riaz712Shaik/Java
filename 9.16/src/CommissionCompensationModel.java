public class CommissionCompensationModel {
	private double grossSales;
	private double commissionRate;

	// parametrized constructor
	public CommissionCompensationModel(double grossSales, double commissionRate) {
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	// method: earnings
	public double earnings() {
		return grossSales * commissionRate;
	}

	// getters
	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	// toString() method
	@Override
	public String toString() {
		String str = "\nCommission Compensation with:";
		str = str + "\nGross Sales of: " + grossSales;
		str = str + "\nCommission Rate of: " + commissionRate;
		str = str + "\nEarnings: " + earnings();

		return str;
	}

}
