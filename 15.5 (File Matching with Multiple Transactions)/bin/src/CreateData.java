
// Create data to put into an account file and a transactions file.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;

public class CreateData {
	public static void main(String args[]) {
		Formatter outOldMaster = null;
		Formatter outTransaction = null;
		AccountRecord accounts[] = new AccountRecord[4];
		TransactionRecord transactions[] = new TransactionRecord[4];

		// create account records
		accounts[0] = new AccountRecord(100, "Alan", "Jones", 348.17);
		accounts[1] = new AccountRecord(300, "Mary", "Smith", 27.19);
		accounts[2] = new AccountRecord(500, "Sam", "Sharp", 0.00);
		accounts[3] = new AccountRecord(700, "Suzy", "Green", -14.22);

		// create transactions
		transactions[0] = new TransactionRecord(300, 83.89);
		transactions[1] = new TransactionRecord(300, 80.78);
		transactions[2] = new TransactionRecord(700, 1.53);

		try {
			// file stream for output file
			outOldMaster = new Formatter("src/oldmast.txt");

			for (int i = 0; i < accounts.length; i++) {
				outOldMaster.format("%d %s %s %.2f\n", accounts[i].getAccount(), accounts[i].getFirstName(),
						accounts[i].getLastName(), accounts[i].getBalance());
			} 
			
			outTransaction = new Formatter("src/trans.txt");

			for (int i = 0; i < transactions.length; i++) {
			
				outTransaction.format("%d %.2f\n", transactions[i].getAccount(), transactions[i].getAmount());
			} // end for
		} // end try
		catch (SecurityException securityException) {
			System.err.println("You do not have write access to this file.");
			System.exit(1);
		} // end catch
		catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error creating file.");
			System.exit(1);
		} // end catch
		catch (FormatterClosedException closedException) {
			System.err.println("Error writing to file - file has been closed.");
			System.exit(1);
		} // end catch
		catch (IllegalFormatException formatException) {
			System.err.println("Error with output.");
			System.exit(1);
		} // end catch
		finally {
			if (outOldMaster != null)
				outOldMaster.close();

			if (outTransaction != null)
				outTransaction.close();
		} // end finally
	} // end main
} // end class CreateData
