// 15.4.c data testing program

public class OutputData {
	public static String PrintTransact(TransactionRecord tr) {
		return String.format("%s %s%n", tr.accountNumber, tr.amount);
	}
	public static String PrintAccount(Account acct) {
		return String.format("%s %s %s %s%n",
			acct.accountNumber, acct.firstName, acct.lastName, acct.balance);
	}
	
	public static void main(String[] args) {
		TransactionRecord[] trArr = {
			new TransactionRecord(100,27.14), 
			new TransactionRecord(300,62.11),
			new TransactionRecord(400,100.56),
			new TransactionRecord(900,82.17)
		};
		Account[] accArr {
			
			new Account(100, "Alan", "Jones", 348.17);
			new Account(300 "Mary", "Smith", 27.19);
			new Account(500, "Sam", "Sharp", 0.0);
			new Account(700, "Suzy", "Green", -14.22);
		};

		for (TransactionRecord tr, trArr)
			PrintTranact(tr);
		for (Account acc, accArr)
			PrintAccount(acc);
	}
}
