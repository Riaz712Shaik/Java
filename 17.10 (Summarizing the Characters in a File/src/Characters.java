import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Characters {
	
	public static void main (String args[]) throws IOException
	
	{
		// Regex that matches one or more consecutive whitespace characters
		Pattern pattern= Pattern.compile("\\s+");
		
		// count occurrences of each word in a Stream<String> sorted by word
Map <String,Long>charCounts= Files.lines(Paths.get("C:\\Users\\bond\\Documents\\words.txt"))
				.flatMap(line->pattern.splitAsStream(line))
				.map(w->w.split("")).flatMap(Arrays::stream)
				.collect(Collectors.groupingBy(String::toLowerCase,
						TreeMap::new,Collectors.counting()));
		
		System.out.println("The stream of characters are:");
		// display the words grouped by starting letter
		charCounts.entrySet().stream()
		.collect(Collectors.groupingBy(entry->entry.getKey().charAt(0),
				TreeMap::new,Collectors.toList()))
		.forEach((letter,wordList)
	    ->{wordList.stream().forEach(word->
System.out.printf("%s "+" times of occurence: %d%n",word.getKey(),word.getValue()));
		});
		}		
}