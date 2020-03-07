//11.21 (Catching Exceptions Using Outer Scopes)
import java.util.NoSuchElementException;
public class CatchingOuterScopeExceptions {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ArithmeticException exception) { // catch exception thrown in method1
			System.err.printf("%s%n%n", exception.getMessage());
}	}
// call method2; throw exceptions back to main
	public static void method1() throws NoSuchElementException {
		try {
			method2();
		} catch (ArrayIndexOutOfBoundsException excp) { // exceptions thrown from method1

			excp.printStackTrace();
		}	}
// call method3; throw exceptions back to method1
	public static void method2() throws ArrayIndexOutOfBoundsException {
		try {
			method3();
		} catch (NoSuchElementException exc) {

			exc.printStackTrace();
		}	}
	public static void method3() throws ArithmeticException {
		throw new ArithmeticException("Exception thrown in method3");
	}
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/
