// 15.4.c data testing program
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

public class OutputData {
	
	public static void main(String[] args) {
		TransactionRecord[] trArr = {
			new TransactionRecord(100,27.14), 
			new TransactionRecord(300,62.11),
			new TransactionRecord(400,100.56),
			new TransactionRecord(900,82.17)
		};
		Account[] accArr = {
			
			new Account(100, "Alan", "Jones", 348.17),
			new Account(300, "Mary", "Smith", 27.19),
			new Account(500, "Sam", "Sharp", 0.0),
			new Account(700, "Suzy", "Green", -14.22),
		};

		try (Formatter out = new Formatter("oldmast.txt")) {
			for (Account acc : accArr)
				out.format("%s%n", acc);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try (Formatter out = new Formatter("trans.txt")) {
			for (TransactionRecord tr : trArr)
				out.format("%s%n", tr);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
