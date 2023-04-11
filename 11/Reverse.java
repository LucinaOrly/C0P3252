// 14.9
// (Display a Sentence with Its Words Reversed)
// Write an application that inputs a line of text, tokenizes the line with
// String method split and outputs the tokens in reverse order. Use spaace
// characters as delimiters.
//
// This program supports stdin and commandline arguments (watch for unix delimiters)
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		ArrayDeque<String> stck = new ArrayDeque<String>();
		Scanner in = new Scanner(System.in);

		// command line arguments
		if (args.length > 0)
			for (int i=0;i<args.length;i++)
				stck.addLast(args[i]);
		
		// stdin
		else { 
			System.out.print("Enter input sentence: ");
				stck.addAll(Arrays.asList(in.nextLine().split(" ")));
		}

		// print contents of stack first
		while (stck.peekLast() != null)
			System.out.printf("%s ", stck.pollLast());
		System.out.println();

		// java garbage collector deletes the collection :)
	}
}
