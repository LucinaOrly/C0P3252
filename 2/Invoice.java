// 3.12
// 
// (InvoiceClass) Create a class called Invoice that a hardware 
// store might use to represent an invoice for an item sold at 
// the store. An Invoice should include four pieces of information 
// as instance variables—a part number (type String), a part description 
// (type String), a quantity of the item being purchased (type int) and 
// a price per item (double). Your class should have a constructor 
// that initializes the four instance variables. Provide a set and a get 
// method for each instance variable. In addition, provide a method named 
// getInvoiceAmount that calculates the invoice amount (i.e., multiplies 
// the quantity by the price per item), then returns the amount as a 
// double value. If the quantity is not positive, it should be set to 0. 
// If the price per item is not positive, it should be set to 0.0. Write 
// a test app named InvoiceTest that demonstrates class Invoice’s 
// capabilities.

public class Invoice {
    public static String DEFAULT_NUM = "-1", DEFAULT_DESC = "default";

    private String partNum, desc;
    private int quan;
    private double price; // per part 

    // constructors
    public Invoice(String partNum, String desc, int quan, double price) {
        setPartNum(partNum);
        setDesc(desc);
        setQuantity(quan);
        setPrice(price);
    }
    public Invoice()
    {
        this(DEFAULT_NUM,DEFAULT_DESC,0,0.0);
    }

    // public methods
    public double getInvoiceAmount() {
        return quan * price;
    }

    
    // getters
    public String getPartNum() {return partNum;}
    public String getDesc() {return desc;}
    public int getQuantity() {return quan;}
    public double getPrice() {return price;}
    // setters 
    public void setPartNum(String partNum) {this.partNum = partNum;}
    public void setDesc(String desc) {this.desc = desc;}
    public void setQuantity(int quan) {this.quan = quan >= 0 ? quan : this.quan;}
    public void setPrice(double price) {this.price = price >= 0.0 ? price : this.price;}

}
