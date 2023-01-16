// 2.25
// application that reads an integer and determines 
// and prints whether it's odd or even

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int num; 
		
		System.out.print("Enter an integer: ");
		num = input.nextInt();

		System.out.printf("The integer %d is ", num);
		if (num % 2 != 0) 				// odd 
			System.out.println("odd!");
		else						// even
			System.out.println("even!");
	}
}
