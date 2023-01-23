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

            System.out.printf("%-13s%-10s%-13s%-10s%-10s%n=========================================%n",
                "Total",
                "Quantity",
                "PricePer",
                "ItemNum",
                "Description");
            for(Invoice item : arr) {
                printInv(item);
            }

            // testing setters
            inv1.setPrice(-10.0);
            inv1.setQuantity(1);
            inv1.setDesc("I put a negative price on this invoice");
            inv1.setPartNum("00000043");
            printInv(inv1);

            inv1.setDesc("Piano");
            inv1.setQuantity(3);
            inv1.setPartNum("00000044");
            printInv(inv1);
    }

    public static void printInv(Invoice inv) {
        System.out.printf("%10.2f %10d %10.2f %10s %-10s%n", 
            inv.getInvoiceAmount(),
            inv.getQuantity(), 
            inv.getPrice(),
            inv.getPartNum(),
            inv.getDesc()
            );
    }
}
