
public class PieceWorker extends Employee {
private int id;

	public PieceWorker(String firstname, String lastname, int SSN, int id)
	{
	super(firstname, lastname, SSN);
	
	this.id = id;
	
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
@Override
public String toString() {
	return String.format("%s%n%s%s", super.toString(), "EmployeeID is:", id);
}
}