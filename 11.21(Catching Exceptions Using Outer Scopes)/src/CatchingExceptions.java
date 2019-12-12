public class CatchingExceptions {
	public static void main(String args[]) {
  int z = 0;
  try {
	  if (z == 1) {
		  throw new ArithmeticException();
	  }
  throw new NullPointerException();
	}
  catch(NullPointerException n) {
	  System.out.println("The caught exception is:\n" + n);
  }
}
}

