public class RethrowingExceptions {
   public static void main(String[] args) {
      try {
         somemethod(); 
      } 
      catch (Exception exception) { // exceptions thrown from method1
         exception.printStackTrace();
         
         System.err.printf("%s%n%n", exception.getMessage());
         exception.printStackTrace(); 
         // obtain the stack-trace information
         StackTraceElement[] traceElements = exception.getStackTrace();
         
         System.out.printf("%nStack trace from getStackTrace:%n");
         System.out.println("Class\t\tFile\t\t\tLine\tMethod");

         // loop through traceElements to get exception description
         for (StackTraceElement element : traceElements) {
            System.out.printf("%s\t", element.getClassName());
            System.out.printf("%s\t", element.getFileName());
            System.out.printf("%s\t", element.getLineNumber());
            System.out.printf("%s%n", element.getMethodName());
         } 
      } 
   } 

   // call method2; throw exceptions back to main
   public static void somemethod() throws Exception {
      try {
    	  somemethod2(); 
      } 
      catch (Exception exception) { // exception thrown from method2
         throw new Exception("Exception thrown in somemethod", exception);
      } 
   }

   // call method3; throw exceptions back to method1
	/*
	 * public static void method2() throws Exception { try { method3(); } catch
	 * (Exception exception) { // exception thrown from method3 throw new
	 * Exception("Exception thrown in method2", exception); } }
	 */
   // throw Exception back to method2
   public static void somemethod2() throws Exception {
      throw new Exception("Exception thrown in somemethod2");
   } 
} 

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/