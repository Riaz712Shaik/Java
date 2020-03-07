import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class CountWords {

	public static void main(String[] args) {

		System.out.print("Please input a sentence:\n");

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		String[] strings = sentence.split(" ");

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			String temp = strings[i].toLowerCase();
			if (hashMap.containsKey(temp)) {
				int number = hashMap.get(temp) + 1;
				hashMap.remove(temp);
				hashMap.put(temp, number);
			} else {
				hashMap.put(temp, 1);
			}
		}

		Iterator<Entry<String, Integer>> iterator = hashMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> mapEntry = iterator.next();
			System.out.printf("%nDuplicates are :%nWord\t\tValue%n");
		      
			System.out.printf("%-10s%10s%n", mapEntry.getKey(), mapEntry.getValue());
		}

	}

}
