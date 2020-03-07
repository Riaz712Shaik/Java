//14.21 (Writing the Word Equivalent of a Check Amount) (1.1)
import java.util.Scanner;
public class CheckAmount 
{
   public static void main(String[] args) 
    { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a dollar amount between 0.0 - 999.99: ");
    String amount = sc.next();
    DollarAmountInWord dollarAmountInWord = new DollarAmountInWord(amount);
    String amountWord = dollarAmountInWord.getWord();
    System.out.printf("\nDollar amount in word: %s\n", amountWord);
    }
    
}