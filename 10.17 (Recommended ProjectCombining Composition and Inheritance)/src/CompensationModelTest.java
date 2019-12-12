public class CompensationModelTest {

	public static void main(String[] args) {
		// create subclass objects
		SalariedCompensationModel salariedEmployee = new SalariedCompensationModel(900.00);
		Employee e = new Employee("Keanu", "Reavs", "232-345-567", salariedEmployee);

		HourlyCompensationModel hourlyEmployee = new HourlyCompensationModel(20.0, 35.2);
		Employee e1 = new Employee("Karen", "Price", "222-22-2222", hourlyEmployee);

		CommissionCompensationModel commissionEmployee = new CommissionCompensationModel(10000.0, .06);
		Employee e2 = new Employee("Sue", "Jones", "333-33-3333", commissionEmployee);

		BasePlusCommissionCompensationModel basePlusCommissionEmployee = new BasePlusCommissionCompensationModel(5000,
				.04, 300);
		Employee e3 = new Employee("Bob", "Lewis", "444-44-4444", basePlusCommissionEmployee);

		System.out.println("Employees processed Dynamically:");

		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}
}
