// Class TransactionRecord

public class TransactionRecord {	
	private int accountNumber;
	private double amount;

	// constructor
	public TransactionRecord(int accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	// default constructor
	public TransactionRecord() {
		this(0, 0.0);
	}

	public int getAcctNum() {
		return accountNumber;	
	}

	public void setAcctNum(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString(){
		return String.format("%s %s", this.accountNumber, this.amount);
	}
}
