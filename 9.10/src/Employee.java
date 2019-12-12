
public class Employee {
	
private String firstname;
private String lastname;
private int SSN;

	public Employee(String firstname, String lastname, int SSN)
	{
	this.firstname = firstname;
	this.lastname = lastname;
	this.SSN = SSN;
	
}
	

public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public double getSSN() {
		return SSN;
	}


	public void setSSN(int sSN) {
		SSN = sSN;
	}
@Override
public String toString()
{
return String.format("%s%s%n%s%s%n%s%s","Firstname is:", firstname, "Lastname is:", lastname,"SSN number is:", SSN);

}
}
