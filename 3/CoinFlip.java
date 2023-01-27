// 6.29
// (Coin Tossing) Write an application that simulates coin tossing. Let the
// program toss a coin each time the user chooses the "Toss Coin" menu option.
// Count the number of times each side of the coin appears. Display the
// results. The program should call a separate method flip that takes no
// arguments and returns a value from a Coin enum (HEADS and TAILS)

import java.util.Scanner;
import java.security.SecureRandom;

public class CoinToss {

	// final variables
	static final SecureRandom ran = new SecureRandom();
	static enum Coin {TAILS,HEADS};

	// static variables
	static int headCount = 0, tailCount = 0;	

	// main method
	public static void main(String[] args) {
		boolean exit = false;
		while (!exit)		
		
		switch(printMenu()) {

		case 1: // Flip a coin
			String result = "";
			switch (flip())	{

			case TAILS: 
				tailCount++; 
				result = "TAILS";
				break;
			case HEADS: 
				headCount++; 
				result = "HEADS";
				break;
			}

			System.out.printf("Coin flip resulted in %s!", result);
			break;	
		case 2: // exit
			exit = true;	
			break;
		}	
	}
	
	// required methods
	public static Coin flip() {
		return (ran.nextInt(2) == 0 ? Coin.TAILS : Coin.HEADS);
	}

	// helper methods
	public static int printMenu() {
		printResults();
		System.out.print("\nMenu\n========================\n1. Flip a Coin\n2. Exit\nMake a selection: ");	

		return (new Scanner(System.in)).nextInt();
	}
	public static void printResults() {
		System.out.printf("Heads: %d%nTails: %d%n", 
			headCount,
		 	tailCount);
	}
	

}
