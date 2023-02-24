// 10.13
// (Payroll System Modificaton) Modify the payroll system of Figs
// 10.4-10.9 to include private instane variable birthDate in class
// Employee. Use class Date of Fig. 8.7 to represent an employee's
// birthday. Add get methods to class Date. Assume that payroll is
// processed once per month. Create an aray of Employee variables to
// store references to various employee objects. IN a loop, calculate
// the payroll for each Employee (polymorphically), and add a $100.00
// bonus to the person's payroll ammount if the current month is the
// one in which the EMployee's birthday occurs.
// 10.15
// (Payroll System Modification) Modify the payroll system of Figs. 10.4-10.9
// to include an additional Employee subclass PieceWorker that represents an
// employee whos pay is based on the number of pieces of merchandice produced.
// Class PieceWorker should contain private instance varaibles wage (to store
// the employee's wage per piece) and pieces (to store th number of pieces
// produced). Provide a concrete implementation of method earnings in class
// PieceWorker that calculates the employee's earnings by multiplying the
// number of pieces produced by the wage per piece. Create an array of Employee
// variables to store references to objects of each concrete class in the new
// Emloyee hierarchy. For each Employee, display itsString representation and
// earnings.

public class BonusTest {
	static final Date TODAYS_DATE = new Date(5,31,2022);

	public static void main(String[] args) {
		SalariedEmployee sE =                                 
         		new SalariedEmployee("John", "Smith", "111-11-1111", 800.00,
			new Date(3,4,1999) );    
      		HourlyEmployee hE =                                     
         		new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40,
			new Date(5,4,1929) );  
		CommissionEmployee cE =                             
		        new CommissionEmployee(                                          
		        "Sue", "Jones", "333-33-3333", 10000, .06,
			new Date(5,10,1949) );                      
      		BasePlusCommissionEmployee bPCE =             
		        new BasePlusCommissionEmployee(                                  
         		"Bob", "Lewis", "444-44-4444", 5000.0, .04, 300.0,
			new Date(8,23,2013) );                  
		PieceWorker pW =
			new PieceWorker("Harley", "Quinn", "555-55-5555", 9.0, 30,
			new Date(9,3,2000) );
		
		// array of Employee objects
		Employee[] empArr = {sE, hE, cE, bPCE, pW};
		
		// begin loop

		System.out.printf("Employees processed polymorphically:%n%n");
		for (Employee emp : empArr) {
			// print class name
			System.out.printf("Employee %s %s is a %s%n", emp.getFirstName(), emp.getLastName(), emp.getClass().getName());

			// print toString of Employee
			System.out.println(emp); // invokes toString
			
			// print earnings with birthday bonus	
			System.out.printf(
			"earned $%,.2f%n%n", 
			emp.earnings() + (TODAYS_DATE.getMonth() == emp.getBirthDate().getMonth() ? 
			100.0 : 0.0) );
		} 
			
		
		
	}
}
