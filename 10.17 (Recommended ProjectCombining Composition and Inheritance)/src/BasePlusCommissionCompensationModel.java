public class BasePlusCommissionCompensationModel implements CompensationModel {
	private double baseSalary;
	private double grossSales;
	private double commissionRate;// base salary per week

	// constructor
	public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {

		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

// set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	// return base salary
	public double getBaseSalary() {
		return baseSalary;
	}

	// calculate earnings; override method earnings in CommissionEmployee
	public double earnings() {
		return getBaseSalary() + getGrossSales() * getCommissionRate();
	}

	@Override
	public String toString() {
		return "BasePlusCommissionCompensationModel\nbaseSalary=" + baseSalary + ", grossSales=" + grossSales
				+ ", commissionRate=" + commissionRate + " \nEarnings: $" + earnings();
	}

	// return String representation of BasePlusCommissionEmployee object

	/*public String toString() {
		return String.format("%s %s : $%,.2f", "base-salaried", "base salary", getBaseSalary());*/
	}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/
