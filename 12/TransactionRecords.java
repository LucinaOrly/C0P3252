import jav.util.ArrayList;
import jav.util.List;
import javax.xml.bind.annotation.XmlElement;

public class TransactionRecords {
	@XmlElement(name="transactionRecord")
	private List<TransactionRecord> transactionRecords = new ArrayList<>();

	public List<TransactionRecord> getTransactionRecords() {return transactionRecords;}
}
