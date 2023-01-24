// 3.15
// (Removing Duplicated Code in Method main) In the AccountTest class of Fig. 3.9 , 
// method main contains six statements (lines 11–12, 13–14, 26–27, 28–29, 38–39 and 
//40–41) that each display an Account object’s name and balance. Study these statements 
// and you’ll notice that they differ only in the Account object being manipulated—account1 
//or account2. In this exercise, you’ll define a new displayAccount method that
//contains one copy of that output statement. The method’s parameter will be an
//Account object and the method will output the object’s name and balance.
//You’ll then replace the six duplicated statements in main with calls to
//displayAccount, passing as an argument the specific Account object to output.
//Modify class AccountTest of Fig. 3.9 to declare method displayAccount (Fig. 3.20
//) after the closing right brace of main and before the closing right brace of
//class AccountTest. Replace the comment in the method’s body with a statement
//that displays accountToDisplay’s name and balance.

import java.util.Scanner;

public class AccountTest {
    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n", 
            accountToDisplay.getName(), 
            accountToDisplay.getBalance());
    }

    public static void main(String[] args) {
        
        Account account1 = new Account ("Jane Green", 50.0);
        Account account2 = new Account ("John Blue", 0.0);

        // display initial balance of each object
        displayAccount(account1);
        displayAccount(account2);
       
        // Scanner asks for user input
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        // display
        displayAccount(account1);
        displayAccount(account2);

        // new input
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);

        // display
        displayAccount(account1);
        displayAccount(account2);

    } 
}