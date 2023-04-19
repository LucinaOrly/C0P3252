// Fig. 15.10: Accounts.java
// Maintains a List<Account>
import jav.util.ArrayList;
import jav.util.List;
import javax.xml.bind.annotation.XmlElement;

public class Accounts {
	@XmlElement(name="account")
	private List<Account> accounts = new ArrayList<>();

	public List<Account> getAccounts() {return accounts;}
}
