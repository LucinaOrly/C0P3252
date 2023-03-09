// Fig. 11.3: DivideByZeroWithExceptionHandling.java
// Handling ArithmeticExceptions and InputMismatchExceptions.
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling
{
   // demonstrates throwing an exception when a divide-by-zero occurs
   public static int quotient(int numerator, int denominator)
      throws ArithmeticException {
      return numerator / denominator; // possible division by zero
   } 

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
      boolean continueLoop = true; // determines if more input is needed

      do {                                                                
			int numerator = 0, denominator = 0;
         try { // read two numbers and calculate quotient                 
            System.out.print("Please enter an integer numerator: ");    
            numerator = scanner.nextInt();                            

            System.out.print("Please enter an integer denominator: ");  
            denominator = scanner.nextInt();                          
           
            // Modified for Assignment 8
            if (denominator == 0) 
               throw new ArithmeticException("Oops, can't do that!.");
                                                                          
            int result = quotient(numerator, denominator);              
            System.out.printf("%nResult: %d / %d = %d%n%n", numerator,     
               denominator, result);                                     

            continueLoop = false; // input successful; end looping        
         }                                                              
         catch (InputMismatchException inputMismatchException) {        
            System.err.printf("%nException: %s%n",                       
               inputMismatchException);                                  

            scanner.nextLine(); // discard input so user can try again    
            System.out.printf(                                          
               "You must enter integers. Please try again.%n%n");          
         }                                                              
         catch (ArithmeticException arithmeticException) {              
            System.err.printf("%nException: %s%n", arithmeticException);

            System.out.printf(                                          
               "Zero is an invalid denominator. Please try again.%n%n");   
         }                                                              
			finally {
				System.out.printf("Numerator is %d%nDenominator is %d%n%n", numerator, denominator);
			}
      } while (continueLoop);                                           
   } 
} 

