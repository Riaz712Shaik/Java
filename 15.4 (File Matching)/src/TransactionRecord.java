// A class that represents one transaction record.

public class TransactionRecord
{
private int account;
private double amount;

// no-argument constructor calls other constructor with default values
 public TransactionRecord()
 {
 this( 0, 0.0 );
 } // end no-argument TransactionRecord

 // initialize a record
 public TransactionRecord( int acct, double amt )
 {
 setAccount( acct );
 setAmount( amt );
 } // end two-argument TransactionRecord

 // set account number
 public void setAccount( int acct )

 {
 account = acct;
 } // end method setAccount

 // get account number
 public int getAccount()
 {
 return account;
 } // end method getAccount

 // set amount
 public void setAmount( double amt )
 {
 amount = amt;
 } // end method setAmount

 // get amount
 public double getAmount()
 {
 return amount;
 } // end method getAmount
 } // end class TransactionRecord