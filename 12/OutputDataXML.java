// 15.4.c data testing program
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.bind.JAXB;

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

		// attempt to write to oldmast.xml
		try (BufferedWriter out = 
			Files.newBufferedWriter(Paths.get("oldmast.xml"))) {

			// stores the Accounts before XML serialization;
			Accounts accounts = new Accounts();
			for (Account acc : accArr)
				accounts.getAccounts().add(acc);

			// write AccountLIst's XML to output
			JAXB.marshal(accounts, out);
		}	
		catch (Exception e) {e.printStackTrace();}

		try (BufferedWriter out = 
			Files.newBufferedWriter(Paths.get("trans.xml"))) {
			// stores the TransactionRecords before XML serialization;
			TransactionRecords trs = new TransactionRecords();
			for (Account acc : accArr)
				trs.getTransactionRecords().add(acc);

			// write TransactionRecordsList's XML to output
			JAXB.marshal(trs, out);
		}	
		catch (Exception e) {e.printStackTrace();}



	}
}
