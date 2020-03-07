//14.7 (Pig Latin) 1
import java.util.Scanner;

public class PigLatin {

	private void printLatinWord(String token) 
	{
		// TODO Auto-generated method stub
				
				String s=token.substring(0,1);
				String s1=token.substring(1);
				System.out.print(s1+s+"ay"+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter a sentence:\n");
	String sentence=s.nextLine();
	String[] tokens = sentence.split(" ");
	
	PigLatin p=new PigLatin();
	for(String token:tokens)
	{
		p.printLatinWord(token);
	}
	}
}