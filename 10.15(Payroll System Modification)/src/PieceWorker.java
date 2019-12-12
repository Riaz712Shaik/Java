public class PieceWorker extends Employee {
	private double wage;
	private int pieces;
	public PieceWorker(String firstName, String lastName, 
		      String socialSecurityNumber, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber);
	{		
	if (pieces < 0.0) // validate pieces
		{
        throw new IllegalArgumentException("pieces must be >= 0.0");
		}
	this.wage = wage;
	this.pieces = pieces;
	}	
}
	
	// earnings=  number of pieces produced by the wage per piece

	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	@Override
	public double earnings() {
		return pieces * wage;
	}
	@Override                                                             
	   public String toString() {                                            
	      return String.format("PieceWorker: %s%n%s: %s%n%s: %s", 
	    	         super.toString(), "Wage per piece",getWage(), "Number of pieces produced", getPieces());
	     
	
	}
	
	}
	