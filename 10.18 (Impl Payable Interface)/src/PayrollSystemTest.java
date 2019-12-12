public class PayrollSystemTest {

	public static void main(String[] args) {
		 
		Payable i = new Invoice("01234", "seat", 2, 375.00);
		/*
		 * Invoice i = new Invoice("01234", "seat", 2, 375.00); Invoice i1 = new
		 * Invoice("56789", "tire", 4, 79.95);
		 */
		Payable i1 = new Invoice("56789", "tire", 4, 79.95);
	    
	    SalariedEmployee salariedEmployee = new SalariedEmployee(900.00);
		Employee e = new Employee("Keanu", "Reavs", "232-345-567", salariedEmployee);

		HourlyEmployee hourlyEmployee = new HourlyEmployee(20.0, 35.2);
		Employee e1 = new Employee("Karen", "Price", "222-22-2222", hourlyEmployee);

		CommissionEmployee commissionEmployee = new CommissionEmployee(10000.0, .06);
		Employee e2 = new Employee("Sue", "Jones", "333-33-3333", commissionEmployee);

		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(5000,
				.04, 300);
		Employee e3 = new Employee("Bob", "Lewis", "444-44-4444", basePlusCommissionEmployee);

		System.out.println("Invoices and Employees processed polymorphically:");

		System.out.println(i);
		System.out.println(i1);
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		
	}
}
	
