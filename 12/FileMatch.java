// 15.4.d
// Class FileMatch.java
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileMatch {
	public static final String OLD_MASTER = "oldmast.txt",
							TRANSACTIONS = "trans.txt";

	public static void main(String[] args) {
		HashMap<Integer, Account> accMap = new HashMap<Integer,Account>();
		HashMap<Integer, TransactionRecord> trMap = new HashMap<Integer, TransactionRecord>();
		// scan files and retrieve data into HashMaps
		try (Scanner in = new Scanner(Paths.get(OLD_MASTER))) {
			while (in.hasNext()) {
				int tmp = in.nextInt();
				accMap.put(tmp, new Account(
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
					tmp, in.nextDouble()
					));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// match both maps for accountNumbers
		try (Formatter out = new Formatter("newmast.txt"); Formatter log = new Formatter("log.txt") ) {
			for (int num : trMap.keySet()) {
				Account acc = accMap.get(num); 

				if (acc != null) { // if there is an account existing for that Transaction

					// add to account balance
					acc.setBalance(acc.getBalance() + trMap.get(num).getAmount());
				}
				else // else output to log.txt
					log.format("Unmatched transaction record for account number %s%n", 
						num);
			}

			// output all accounts to newmast.txt
			for (Account acc : accMap.values()) {
				out.format("%s%n", acc);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		
	}
}
