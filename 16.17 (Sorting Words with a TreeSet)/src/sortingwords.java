import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class sortingwords {

	public static void main(String[] args) {
		
	
		System.out.print("Input sentence:\n");

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		word = word.toLowerCase();

		String[] strings = word.split(" ");

		TreeSet<String> treeset = new TreeSet<String>();
		for (int i = 0; i < strings.length; i++)
			treeset.add(strings[i]);

		Iterator<String> it = treeset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
