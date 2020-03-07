
// Read poll results from a file and output ratings.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentPoll {
	public void displayData() {
		int frequency[] = new int[6];

		Formatter writer = null;
		Scanner pollNumbers = null;

		try {
			pollNumbers = new Scanner(new File("numbers.txt"));

			writer = new Formatter("output.txt");

			writer.format("%-12s%-12s\n", "Rating", "Frequency");

			// for each answer, use that value as subscript to
			// determine element to increment
			while (pollNumbers.hasNext())
				++frequency[pollNumbers.nextInt()];

			// append frequencies to String output
			for (int rating = 1; rating < frequency.length; rating++)
				writer.format("%-12d%-12d\n", rating, frequency[rating]);
		} // end try
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Enter rating 1-5");
		}
		catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error: Files cannot be opened.");
		} // end catch
		catch (FormatterClosedException formatterClosedException) {
			System.err.println("Error: Output file is closed.");
		} // end catch
		catch (SecurityException securityException) {
			System.err.println("Error opening file for writing.");
		} // end catch
		catch (IllegalFormatException illegalFormatException) {
			System.err.println("Error writing data to file.");
		} // end catch
		catch (NoSuchElementException noSuchElementException) {
			System.err.println("Error reading from file.");
		} // end catch
		catch (IllegalStateException illegalStateException) {
			System.err.println("Error: Input file is closed.");
		} // end catch
		finally {
			if (writer != null)
				writer.close();

			if (pollNumbers != null)
				pollNumbers.close();
		} // end finally
	} // end displayData
} // end class StudentPoll