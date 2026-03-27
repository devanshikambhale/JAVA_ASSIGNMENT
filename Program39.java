// Online Shopping System
// Create a class OnlineShoppingSystem. Create threads for
// payment and order processing.
// Output: &#39;Processing payment...&#39; and &#39;Order confirmed...&#39;
class OnlineShoppingSystem {

    public static void main(String[] args) {

        Thread payment = new Thread(() -> {
            System.out.println("Processing payment...");
        });

        Thread order = new Thread(() -> {
            System.out.println("Order confirmed...");
        });

        payment.start();
        order.start();
    }
}