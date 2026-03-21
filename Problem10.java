// Create an interface Bank with method getInterestRate(). Create classes SBI,
// HDFC, and ICICI that implement the interface and return different interest rates.
// Write a Java program to display the interest rate of each bank.

interface Bank
{
    float getInterestRate();
}

class SBI implements Bank
{
    public float getInterestRate()
    {
        return 6.5f;
    }
}

class HDFC implements Bank
{
    public float getInterestRate()
    {
        return 7.0f;
    }
}

class ICICI implements Bank
{
    public float getInterestRate()
    {
        return 6.8f;
    }
}

class mainclass
{
    public static void main(String args[])
    {
        SBI s = new SBI();
        HDFC h = new HDFC();
        ICICI i = new ICICI();

        System.out.println("SBI Interest Rate: " + s.getInterestRate());
        System.out.println("HDFC Interest Rate: " + h.getInterestRate());
        System.out.println("ICICI Interest Rate: " + i.getInterestRate());
    }
}