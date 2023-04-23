// 16.10 
// Class Names.java
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

public class Names {
	public static final String FILE_NAME = "names.txt";

	public static void main(String[] args) {
		// import names from file with duplicated names
		HashSet<String> names = importNames(FILE_NAME);

		Scanner in = new Scanner(System.in);
		Boolean quit = false;
		while (!quit) {
			System.out.print("Enter name (q to quit)>");

			String tok = in.next().toLowerCase();
			if ( !tok.equals("q") ) {
				if (names.contains(tok))
					System.out.printf("Name %s found in set!%n", tok);
			}
			else quit = true;
		}


	}
	
	// Scan a file for names
	public static HashSet<String> importNames(String fileName) {
		HashSet<String> set = new HashSet<String>();
		try (Scanner in = new Scanner(Paths.get(fileName))) {
			while(in.hasNext()) {
				String tok = in.next().toLowerCase();
				if(!set.add(tok))
					System.out.printf("Rejected %s(Already Exists!)%n",tok);
			}
		}
		catch (Exception e) { e.printStackTrace(); }
		
		return set;
	}

}
