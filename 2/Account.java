// Note: Copied from the textbook for use with AccountTest.java 

// Fig. 3.8: Account.java
// Account class with a double instance variable // and deposit method that perform validation.

 public class Account {
   private String name; // instance variable
   private double balance; // instance variable

   // Account constructor that receives two para
   public Account(String name, double balance) {
      this.name = name; // assign name to instan

      
   if (balance > 0.0) { // if the balance is
      this.balance = balance; // assign it to
    }  } 
// method that deposits (adds) only a valid a
public void deposit(double depositAmount) {

 if (depositAmount > 0.0) { // if the depos
    balance = balance + depositAmount; // a
 }  } 
// method returns the account balance
     public double getBalance() {


return balance;  }

   // method that sets the name
public void setName(String name) {

this.name = name;  }

// method that returns the name
   public String getName() {
 return name;  }
 }
  