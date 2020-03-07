import java.util.Scanner;

public class Pig {

	private void printLatinWord(String token) 
	{
		// TODO Auto-generated method stub
				
				String temp=token.substring(0,1);
				String temp2=token.substring(1);
				System.out.print(temp2+temp+"ay"+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter a sentence:\n");
	String sentence=s.nextLine();
	String[] tokens = sentence.split(" ");
	
	Pig p=new Pig();
	for(String token:tokens)
	{
		p.printLatinWord(token);
	}
	}
}