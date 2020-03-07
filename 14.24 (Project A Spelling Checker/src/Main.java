
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String dictionaryFileName = "";
		String inputWord = "";

		try {
			dictionaryFileName = "C:\\Users\\Bond\\Downloads\\spelling-corrector-master\\dictionary\\words.txt";
			inputWord = "Eclispe";
		} catch (Exception e) {
			System.err.println("Invalid arguments: ");
			System.err.println("Usage: java <program> <dictionary_path> <word>");
		}

		SpellCorrector corrector = new SpellCorrector();

		corrector.useDictionary(dictionaryFileName);
		String suggestion = corrector.suggestSimilarWord(inputWord);
		if (suggestion == null) {
			suggestion = "No similar word found";
		}

		System.out.println("You entered: " + inputWord + "\n");
		System.out.println("Did you mean: " + suggestion + "?");

	}

}