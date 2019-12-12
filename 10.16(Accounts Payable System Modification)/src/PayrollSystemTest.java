public class PayrollSystemTest {
   public static void main(String[] args) {
	   
	   Payable[] payableObjects = new Payable[6]; 
	   
	   payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
       payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
	   payableObjects[2] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
	   payableObjects[3] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
	   payableObjects[4] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
	   payableObjects[5] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);	   
	   
	   System.out.printf("Invoices and Employees processed polymorphically:%n%n"); 
	// First output a String representation of each Payable object.
	      for (int j = 0; j < payableObjects.length; j++) {      
	         System.out.printf("Current Payable %d is a %s%n", j,  
	        		 payableObjects[j].getClass().getName());   
	      }
   
		      // generically process each element in array payableObjects
		      for (Payable currentPayable : payableObjects) {
		         // output currentPayable and its appropriate payment amount
		         System.out.printf("%n%s %npayment due: $%,.2f%n", 
		            currentPayable.toString(), // could invoke implicitly
		            currentPayable.getPaymentAmount());

      
         // determine whether element is a BasePlusCommissionEmployee
         if (currentPayable instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
        	 BasePlusCommissionEmployee Employee =  
               (BasePlusCommissionEmployee) currentPayable;

        	 Employee.setBaseSalary(1.10 * Employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               Employee.getBaseSalary());
         } 

        
      } 

                                                 
   } 
} 