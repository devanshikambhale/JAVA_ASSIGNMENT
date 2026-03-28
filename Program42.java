// Banking System
// Create a class BankingSystem. Multiple threads access shared
// account balance using synchronized block.
// Output: Balance deduction messages.
class BankingSystem {
    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + ", Balance: " + balance);
            } else {
                System.out.println("Insufficient balance for " + amount);
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem account = new BankingSystem();

        Thread t1 = new Thread(() -> account.withdraw(400));
        Thread t2 = new Thread(() -> account.withdraw(500));
        Thread t3 = new Thread(() -> account.withdraw(300));

        t1.start();
        t2.start();
        t3.start();
    }
}