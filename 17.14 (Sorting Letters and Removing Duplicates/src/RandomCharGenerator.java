import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomCharGenerator {

	public static void main(String[] args) {
		Random r = new Random();
		List Charac = new ArrayList();
		

	for (int i = 0; i < 30; i++)		{
			char c = (char) (r.nextInt(26) + 'a');
			Charac.add(c);

		}

		System.out.println("Original Characters" + "characters : ");
		Charac.stream().forEach(cr -> System.out.println(cr));
		System.out.println();
		
		System.out.println("Ascending order:");
        Charac.stream().sorted().forEach(cr -> System.out.print(cr));
		System.out.println();
		
		System.out.println("Descending order:");
        Charac = (List) Charac.stream().sorted().collect(Collectors.toList());
		Collections.reverse(Charac);

		Charac.forEach(cr -> System.out.print(cr));
		System.out.println();
		System.out.println("Ascending order with " + "Distinct characrers:");
		Charac.stream().distinct().sorted().forEach(cr -> System.out.print(cr));
	}

}