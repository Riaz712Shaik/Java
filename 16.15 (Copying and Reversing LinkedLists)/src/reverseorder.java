import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class reverseorder {

	public static void main(String[] args) {

		Character[] characters = { 'o', 'n', 'i', 'h', 't', 'r', 'a', 'b', 'z', 'f' };
		List<Character> list = new LinkedList<>();
		for (Character character : characters) {
			list.add(character);
		}
		System.out.println("list contains: " + list);

		Collections.reverse(list);

		Character[] lettersCopy = new Character[10];
		List<Character> copyList = Arrays.asList(lettersCopy);

		Collections.copy(copyList, list);
		System.out.printf("%n%ncopy of the first list in reverse order:%n" + list);

	}

}