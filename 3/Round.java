// 6.9 
// Write an application that reads double
// values and uses the preceding statement to
// round each of the numbers to the nearest
// integer. For each number processsed, display
// both the original number and the rounded
// number
// 
// Assume user inputs double values
import java.util.Scanner;

public class Round {

	public static void main(String[] args) {
		if (args.length < 2) { // no command line arguments
			System.out.print ("Enter double values (separate by whitespace):");

			Scanner in = new Scanner(System.in);
			args = in.nextLine().split(" ");

		}
		
		for (int i = 0; i < args.length; i++)
			printResult(Double.parseDouble(args[i]));		
			
	}	
	
	public static void printResult(double num) {
		System.out.printf("Number:%f Rounded:%.0f%n", num, Math.floor(num + 0.5));
	}
}

