
// Create poll results and output them to a file.
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateResults {
	private int getValue() {
		int result = -1;
		Scanner scanner = new Scanner(System.in);

		// prompt the user for input
		System.out.print("Enter integer result (1 - 5), -1 to quit: ");

		try {
			result = scanner.nextInt();
		} // end try
		catch (NoSuchElementException noSuchElementException)

		{
			System.err.println("Error with input.");
			System.exit(1);
		} // end catch

		return result;
	} // end method getValue

	private void outputData() {
		Formatter pollNumbers = null;

		try {
			// create the output stream
			pollNumbers = new Formatter("numbers.txt");

			int pollValue = getValue(); // get a number from the user

			// test for the sentinel value
			while (pollValue != -1) {
				// if the number is valid
				if (pollValue > 0 && pollValue < 6)

					// write the value
					pollNumbers.format("%d\n", pollValue);

				pollValue = getValue(); // get another value
			} // end while

			pollNumbers.close(); // close the file
		} // end try
		
		catch (SecurityException securityException) {
			System.err.println("Error opening file.");
		} // end catch
		catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Output file cannot be found.");
		} // end catch
		catch (IllegalFormatException illegalFormatException) {
			System.err.println("Error with the output's format.");
		} // end catch
		catch (FormatterClosedException formatterClosedException) {
			System.err.println("File has been closed.");
		} // end catch
		finally {
			if (pollNumbers != null)
				pollNumbers.close();
		} // end finally
	} // end method outputData

	public static void main(String args[]) {
		CreateResults application = new CreateResults();
		application.outputData();
	} // end main
} // end class CreateResults