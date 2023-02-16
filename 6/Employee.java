// Employee.java

public class Employee { 
   private final String firstName;                        
   private final String lastName;                         
   private final String socialSecurityNumber;             

   public Employee(String firstName, String lastName, String socialSecurityNumber) {

      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
   } 

   // return first name
   public String getFirstName() {return firstName;}

   // return last name
   public String getLastName() {return lastName;}

   // return social security number
   public String getSocialSecurityNumber() {return socialSecurityNumber;}

   // return String representation of CommissionEmployee object         
   @Override // indicates that this method overrides a superclass method
   public String toString() {                                           
      return String.format("%s: %s %s%n%s: %s",     
         "commission employee", firstName, lastName,                    
         "social security number", socialSecurityNumber
	);                            
   }                                                                    
} 
