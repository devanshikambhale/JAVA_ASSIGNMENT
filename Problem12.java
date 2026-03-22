// Design a payment processing system.
// Create an abstract class Payment with an abstract method pay(double amount).
// Create subclasses:
//  CreditCardPayment
//  UPIPayment
//  NetBankingPayment
// // Each subclass should implement the pay() method differently.

abstract class Payment
{
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment
{
    void pay(double amount)
    {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment extends Payment
{
    void pay(double amount)
    {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class NetBankingPayment extends Payment
{
    void pay(double amount)
    {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Payment p1 = new CreditCardPayment();
        p1.pay(1500.0);

        Payment p2 = new UPIPayment();
        p2.pay(500.0);

        Payment p3 = new NetBankingPayment();
        p3.pay(2000.0);
    }
}