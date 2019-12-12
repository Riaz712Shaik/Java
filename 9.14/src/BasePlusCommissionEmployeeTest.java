public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
// instantiate CommissionEmployee object
		CommissionEmployee employee1 = new CommissionEmployee("Rob", "Underwood", "222-22-2242", 10000, .06);

// get commission employee data
		System.out.println("Employee information");
		System.out.printf("%n%s %s%n", "First name is", employee1.getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee1.getLastName());
		System.out.printf("%s %s%n", "Social security number is", employee1.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", employee1.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", employee1.getCommissionRate());

		employee1.setGrossSales(5000);
		employee1.setCommissionRate(.1);

		System.out.printf("%n%s:%n%n%s%n%n", "Updated employee information", employee1);

// instantiate BasePlusCommissionEmployee object
		BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Tim", "Galleghar", "313-33-3313", 5000,
				.04, 300);

// get base-salaried commission employee data
		System.out.println("Employee information");
		System.out.printf("%n%s %s%n", "First name is", employee2.getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee2.getLastName());
		System.out.printf("%s %s%n", "Social security number is", employee2.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", employee2.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", employee2.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary is", employee2.getBaseSalary());

		employee2.setBaseSalary(1000);

		System.out.printf("%n%s:%n%n%s%n", "Updated employee information", employee2.toString());

	}

}