public class Employee {
   //private fields
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private CommissionCompensationModel compensation;
  
   //Parametried constructor
   public Employee(String firstName, String lastName, String socialSecurityNumber,
           CommissionCompensationModel commissionModel) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.socialSecurityNumber = socialSecurityNumber;
       this.compensation = commissionModel;
   }
  
   //setter for Compensation
   public void setCompensation(CommissionCompensationModel compensation) {
       this.compensation = compensation;
   }
  
  
   //the getters
   public String getFirstName() {
       return firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public String getSocialSecurityNumber() {
       return socialSecurityNumber;
   }

   public CommissionCompensationModel getCompensation() {
       return compensation;
   }
  
   //method: earnings()
   public double earnings(){
       return this.compensation.earnings();
   }
  
   //toString method
   @Override
   public String toString() {
       String str = "";
       str = str+firstName+" "+lastName;
       str = str+"\n"+"Social Security Number:"+socialSecurityNumber;
       str = str+ compensation.toString();
      
       return str;
   }
  
}