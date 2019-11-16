public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;

		if (monthlySalary < 0.0) {
			throw new IllegalArgumentException("monthly salary must be >= 0.0");
		}

		this.monthlySalary = monthlySalary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName; 
		//first name is ntcoming in outuout
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	@Override
	public String toString() {
		return "Employee details are" + firstName + ", + lastName + " + " monthlySalary is" + monthlySalary;
	}

}