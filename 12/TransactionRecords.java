import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class TransactionRecords {
	@XmlElement(name="transactionRecord")
	private List<TransactionRecord> transactionRecords = new ArrayList<>();

	public List<TransactionRecord> getTransactionRecords() {return transactionRecords;}
}
