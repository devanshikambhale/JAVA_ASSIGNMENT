// ATM Withdrawal System
// Create a class ATMWithdrawal. Accept account balance and

// withdrawal amount from the user. If withdrawal amount is
// greater than balance, throw an exception manually using throw.
// Otherwise deduct amount and display updated balance.
// Output: If sufficient balance: &#39;Withdrawal successful.
// Remaining balance: &lt;balance&gt;&#39; Else: &#39;Insufficient Balance&#39;
import java.util.Scanner;

class ATMWithdrawal {

    // Method to perform withdrawal
    public void withdraw(double balance, double amount) {
        try {
            if (amount > balance) {
                // Manually throwing exception
                throw new Exception("Insufficient Balance");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawal successful.");
                System.out.println("Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept account balance
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        // Accept withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        ATMWithdrawal atm = new ATMWithdrawal();

        // Perform withdrawal
        atm.withdraw(balance, amount);

        sc.close();
    }
}