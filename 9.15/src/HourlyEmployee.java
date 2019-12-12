public class HourlyEmployee extends Employee {

	private double hours;
	private double wage;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);

		if (hours < 0.0 || hours > 168.0)
			throw new IllegalArgumentException("Hour must be between 0 and 168");
		if (wage <= 0.0)
			throw new IllegalArgumentException("Wage must be greater than 0");

		this.hours = hours;
		this.wage = wage;
	}

	public void setHours(double hours) {
		if (hours < 0.0 || hours > 168.0)
			throw new IllegalArgumentException("Hour must be between 0 and 168");

		this.hours = hours;
	}

	public double getHours() {
		return hours;
	}

	public void setWage(double wage) {
		if (wage <= 0.0)
			throw new IllegalArgumentException("Wage must be greater than 0");

		this.wage = wage;
	}

	public double getWage() {
		return wage;
	}

	public double earnings() {
		if (hours <= 40)
			return hours * wage;

		else
			return ((40 * wage) + ((hours - 40) * (wage * 1.5)));
	}

	@Override
	public String toString() {
		return String.format("%s %n%s: %.2f%n%s: %.2f %n%s: %.2f%n", super.toString(), "Hours Worked", hours,
				"Hourly Rate", wage, "Total Earnings", earnings());
	}
}