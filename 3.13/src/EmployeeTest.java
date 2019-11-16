public class EmployeeTest {

public static void main(String[] args) {

// TODO Auto-generated method stub

Employee e = new Employee("Anirudh","Xen",104.2);

//Employee e1;

//passing values through construct0r

//e1=new Employee("Xen","hai",5); ok na sir?
//yearly salary? take monthly sal rerutn it with*12

//System.out.println("First Employee Salary"+e.getMonthlySalary()); //return the first employ salary
System.out.printf("%s%n%s%n",  e, e.getMonthlySalary()); // call the toString metod how?
//wait for so
System.out.printf("%s%n%s%n", "Yearly Salary:", e.getMonthlySalary()*12);

}

} // alrgiht thanks