// Bank Application
// Create a class BankApplication. Define method that throws
// exception using throws. Call method in main and handle
// exception.
// Output: &#39;Transaction processed&#39; or &#39;Exception handled in main&#39;
class BankApplication {

    // method using throws
    static void processTransaction(boolean error) throws Exception {
        if (error) {
            throw new Exception("Transaction Failed");
        }
        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {
        try {
            processTransaction(true);   // change to false for success
        }
        catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}