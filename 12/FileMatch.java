// 15.4.d
// Class FileMatch.java
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.collections.HashMap;

public class FileMatch {
	public static final String OLD_MASTER = "oldmast.txt",
							TRANSACTIONS = "trans.txt";

	public static void main(String[] args) {
		HashMap<int, Account> acctMap = new HashMap<int,Account>();

		// scan files and retrieve data into HashMaps
		try (Scanner in = new Scanner(Paths.get(OLD_MASTER))) {
			while (in.hasNext()) {
				int tmp = in.nextInt();
				acctMap.put(tmp, new Account(
					tmp, in.next(), in.next(), in.nextDouble()
					));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try (Scanner in = new Scanner(Paths.get(TRANSACTIONS))) {
			while (in.hasNext()) {
				int tmp = in.nextInt();
				trMap.put(tmp, new TransactionRecord(
					tmp, in.nextDouble();
					));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// match both maps for accountNumbers
		
	}
}
