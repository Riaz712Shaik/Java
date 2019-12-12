public class BasePlusCommissionCompensationModel extends CommissionCompensationModel{
   private double baseSalary;
  
   //parametrized constructor
   public BasePlusCommissionCompensationModel(double grossSales,double commissionRate,
           double baseSalary){
       super(grossSales,commissionRate);
       this.baseSalary = baseSalary;
   }
  
   //earnings() method
   public double earnings(){
       return super.earnings() + baseSalary;
   }
  
   @Override
   public String toString() {
       String str = "\nBase Plus Commission Compensation with:";
       str = str + "\nGross Sales of: "+getGrossSales(); //inherited method
       str = str + "\nCommission Rate of: "+getCommissionRate();//inherited method
       str = str + "\nBase salary of: "+baseSalary;
       str = str + "\nEarnings: "+earnings();
      
       return str;  
   }

}