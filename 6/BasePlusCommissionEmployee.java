// Fig. 9.9: BasePlusCommissionEmployee.java (modified)
// BasePlusCommissionEmployee inherits protected instance   
// variables from CommissionEmployee.

public class BasePlusCommissionEmployee extends CommissionEmployee {
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary) {
      super(firstName, lastName, socialSecurityNumber,
         grossSales, commissionRate);                 

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0) {                   
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }        

      this.baseSalary = baseSalary;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary() {return baseSalary;}

   // calculate earnings
   @Override // indicates that this method overrides a super.toStringclass method
   public double earnings() {
      return baseSalary + (getCommissionRate() * getGrossSales());
   } 

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
      return String.format( "%s%n%s: %.2f", super.toString(), "base salary", baseSalary);                                  
   }
} 
