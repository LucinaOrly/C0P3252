// 6.30
// (Guess the Number) Write an application that plays "guess the number" as
// follows: Your program chooses the number to be guessed by selecting a random
// integer [1, 1000]. The player inputs a first guess. If the player's guess is
// incorrect, your program shuold display Too High. Try again. or Too low. Try
// again. to help the player "zero in" on thecorrect answer. The program should
// prompt the user for thenext guess. When the user eners the correct answer,
// display Congratualations. You guessed the number!, and allow the useer to
// choose whether to play again. [Note: the guessing technique employed in this
// program is similar to a binary search, which is discussed in Chapter 19,
// searching, sorting and Big O.]

import java.util.InputMismatchException;
import java.util.Scanner;
import java.security.SecureRandom;

public class GuessTheNumber {
	static final int 
		MAX_INT = 1000,
		MIN_INT = 1;
		
	public static void main(String[] args) {
		boolean exit = false;
		SecureRandom ran = new SecureRandom();
		Scanner in = new Scanner(System.in);	

		// game logic loop
		do {
			System.out.println("Choosing a new number...");
			// choose a random number between [MIN_INT, MAX_INT]
			int winCondition = ran.nextInt(MAX_INT - MIN_INT + 1) + MIN_INT;	
			System.out.println("New number chosen!");
			
			int userGuess = MIN_INT - 1;
			// gameplay loop
			while (userGuess != winCondition) {
			
				// get input
				System.out.printf("Enter a guess between [%d,%d]: ", MIN_INT, MAX_INT);
				try {
					userGuess = in.nextInt();
				} 
				catch(InputMismatchException e) {
					System.out.printf("Invalid input (%s)%n", e);
				}
				
				// compare user's guess with chosen number
				String res = "Congratualations. You guessed the number!";
				if (userGuess < winCondition)
					res = "Too Low. Try again.";
				else if (userGuess > winCondition)
					res = "Too High. Try again.";
				
				System.out.println(res);
			}	
			// prompt to play again
			System.out.println("Play again ? (y/n)");
			switch(in.next().charAt(0)) {
			case 'y':
				System.out.println("Resetting the game...");	
				in.nextLine();

				break;
			case 'n':
			default:				
				exit = true;
			}
		} while(!exit);
		
	}

}
