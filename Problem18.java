// A bank has a fixed interest rate that should not be changed once it is defined.
// Question:
// Create a class Bank with a final variable interestRate.
// Create a method calculateInterest(double amount) that calculates the interest using
// the fixed rate.
// Write a program to calculate interest for different customers.

class Bank
{
    final double interestRate = 7.5;  // fixed interest rate

    double calculateInterest(double amount)
    {
        return (amount * interestRate) / 100;
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Bank b = new Bank();

        double interest1 = b.calculateInterest(10000);
        double interest2 = b.calculateInterest(5000);
        double interest3 = b.calculateInterest(20000);

        System.out.println("Interest for ₹10000 = " + interest1);
        System.out.println("Interest for ₹5000 = " + interest2);
        System.out.println("Interest for ₹20000 = " + interest3);
    }
}
