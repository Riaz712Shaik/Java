
import java.util.Random;
import java.util.LinkedList;
import java.util.Collections;

public class InsertSortedOrder {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 25; i++)
			list.add(random.nextInt(100));
		
		Collections.sort(list);
		
		int sum = 0; double avg = 0;
		
		for (int i = 0; i < 25; i++) {
			sum += list.get(i);
		}
		avg = sum / 25;
		System.out.println("\nList Of elements after sorting" + list);
		System.out.println("\nSum of the elements: " + sum);
		System.out.println("floating-point average of the elements : " + avg);

	}
}