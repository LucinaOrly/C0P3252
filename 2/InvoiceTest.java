// test program for the Invoice class

public class InvoiceTest {
    public static void main(String[] args) {
            // test default constructor
            Invoice inv1 = new Invoice();
            // test constructor
            Invoice inv2 = new Invoice("00000055", "Starburst", 56, 0.50); 
            // test negative values on constructor
            Invoice inv3 = new Invoice("00000076", "BitCoin", -460, -1234.00);

            Invoice[] arr = {inv1, inv2, inv3}; 

            System.out.printf("%s13%s10%s13%s10%s10%n=========================================%n",
                "Total",
                "Quantity",
                "Price Per",
                "Item Number",
                "Description");
            for(Invoice item : arr) {
                printInv(item);
            }

            // testing setters
            inv1.setPrice(-10.0);
            inv1.setQuantity(1);
            inv1.setDesc("I put a negative price on this invoice");
            inv1.setItemNumber(00000043);
            printInv(inv1);

            inv1.setDesc("Piano");
            inv1.setQuantity(3);
            inv1.setItemNumber(00000044);
            printInv(inv1);
    }

    public static void printInv(Invoice inv) {
        System.out.printf("%f10.2%d10%f10.2%s10%-s10%n", 
            inv.getInvoiceAmmount(),
            inv.getQuantity(), 
            inv.getPrice(),
            inv.getItemNum(),
            inv.getDesc()
            )
    }
}