// 16.13
// prints number of duplicate words in a SENTENCE
// assume the input is a sentence of one line (before the first \n)
import java.lang.StringBuilder;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class DuplicateWords {
	public static void main(String[] args) {
		String[] toks = getInput();
		Set<String> set = new HashSet<String>();
		int count = 0;
		for(String str : toks)
			System.out.println(str);

		for (String str : toks)
			if (!set.add(str)) {
				count++;
				System.out.printf("found duplicate \"%s\"%n", str);
			}
		System.out.printf("There are %d duplicates found.%n", count);
	}

	private static String[] getInput() {
		Scanner in = new Scanner(System.in);
			
		StringBuilder toks = new StringBuilder(); 

		System.out.print("Enter a sentence >");

		for (String tok : in.nextLine().split(" ")) {
			String str = tok.toLowerCase().replaceAll(
					"[^a-z\\d\\s]|[,.?!\"]","");
			toks.append(str + " ");
		}

		return toks.toString().split(" ");
	}
	

}
