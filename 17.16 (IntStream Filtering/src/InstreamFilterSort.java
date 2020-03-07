	import java.security.SecureRandom;

import java.util.stream.IntStream;

public class InstreamFilterSort
{
	public static void main(String[] args)
	{
		IntStream st;
		SecureRandom sr = new SecureRandom();		

		int[] randomArray = new int[50];		
		st = sr.ints(50, 1,1000);		
		
		randomArray = st
				        .filter(i -> i%2 == 1)
				        .sorted()
				        .toArray();		
		
		for (int v : randomArray)		
			 //System.out.printf("Random numbers : %s%n", v);
			System.out.print(v + " ");
		 

	}
}