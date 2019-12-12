public class CommissionCompensationModelTest {
	public static void main(String[] args) {
		// Create the two employees with their compensation models.

		CommissionCompensationModel commissionModel = new CommissionCompensationModel(2000.00, 0.04);
		BasePlusCommissionCompensationModel basePlusCommissionModel = new BasePlusCommissionCompensationModel(2000.00,
				0.05, 600.00);

		Employee employee1 = new Employee("Frank", "Underwood", "123-11-1231", commissionModel);
		Employee employee2 = new Employee("Nick", "Willis", "142-242-2422", basePlusCommissionModel);

		System.out.printf("%s%n%n%s%n", employee1, employee2);
	

// Change the compensation model for the two employees.

		CommissionCompensationModel commissionModelNew = new CommissionCompensationModel(5000.00, 0.04);
		BasePlusCommissionCompensationModel basePlusCommissionModelNew = new BasePlusCommissionCompensationModel(
				4000.00, 0.05, 800.00);
   System.out.println("\nThe new compensation models for the employees");
// Set the new compensation models for the employees.
		employee1.setCompensation(basePlusCommissionModelNew);
		employee2.setCompensation(commissionModelNew);

// Print out the new information for the two employees.
		System.out.printf("%n%s%n%n%s%n", employee1, employee2);
	}
}