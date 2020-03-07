
import java.io.IOException;

public interface ISpellCorrector {

	public void useDictionary(String dictionaryFileName) throws IOException;

	
	public String suggestSimilarWord(String inputWord);
}

