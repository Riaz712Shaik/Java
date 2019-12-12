public class HourlyEmployeeTest {

	public static void main(String[] args) {
		HourlyEmployee employee = new HourlyEmployee("Frank", "Lewis", "123-55-455", 40.00, 10.00);

		System.out.printf("Without adding Extra hours:%n%s", employee);

		employee.setHours(55);

		System.out.printf("%nAfter adding additonal working hours:%n%s", employee);
	}
}