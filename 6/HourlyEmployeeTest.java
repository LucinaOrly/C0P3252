// 9.15
// (Creating a new Subclass of Employee) Other types of Employees might include
// Salaried-Employees who get paid a fixed weekly salary, PieceWorkers who get
// paid a fixed weekly salary, PieceWorkers who get paid by the number of
// pieces they produce or HourlyEmployees who get paid an hourly wage with
// time-and-a-half--1.5 times the hourly wage-- for hours worked over 40 hours.
//
// Create Class HourlyEmployee that inherits from class Employee (Excerise
// 9.14) and has instance variable hours (a double) that represents the wages
// per hour, a construction that takes as arguments a first name, a last name,
// a social security number, an hourly wage and the number of hours worked, set
// and get methods for manipulationg the hours earnings based on the hours
// worked and a toString method that returns the HourlyEmployee's String
// representation. Method setWage should ensure that wage is nonnegative, and
// setHours should ensure that the value of hours is between 0 and 168 (the
// total number of hours in a week). Use class HourlyEmployee in a test program
// that is similar to the one in Fig. 9.5

public class HourlyEmployeeTest {
   public static void main(String[] args) {
      // instantiate HourlyEmployee object
      HourlyEmployee employee =             
         new HourlyEmployee(                
         "Bob", "Marley", "420-13-5678", 10.50, 41);
     
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
          employee.toString());
	
	
	
	System.out.print("Test bad argument hours: ");
	try {new HourlyEmployee("error","check", "123-45-6789", -1, HourlyEmployee.HOURS_PER_WEEK + 2);}
	catch (IllegalArgumentException e) {
		System.out.printf("success! (%s)%n", e);
	}
	
   } 
} 
