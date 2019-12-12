
public class Employee implements Payable, CompensationModel {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private CompensationModel compensation;	

	// constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.compensation = compensation;
	}

	public void setCompensation(CompensationModel compensation) {
		this.compensation = compensation;
	}

	public CompensationModel getCompensation() {
		return compensation;
	}

// return first name
	public String getFirstName() {
		return firstName;
	}

	// return last name
	public String getLastName() {
		return lastName;
	}

	// return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	
		public double earnings() {return 0;}

	public double getPaymentAmount() {return compensation.earnings();}  

	@Override
	public String toString() {
		return "\nEmployee is " + firstName + " " + lastName + ", socialSecurityNumber: "
				+ socialSecurityNumber + "\ncompensation=" + compensation + "\nPaymentdue=" + getPaymentAmount();
	}

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
