// Producer Consumer System

// Create a class Restaurant. Chef prepares food and waiter serves
// it using wait() and notify().
// Output: &#39;Chef prepared food&#39; and &#39;Waiter served food&#39;
class Restaurant {
    boolean foodReady = false;

    synchronized void prepareFood() {
        while (foodReady) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() {
        while (!foodReady) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Waiter served food");
        foodReady = false;
        notify();
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> r.prepareFood());
        Thread waiter = new Thread(() -> r.serveFood());

        chef.start();
        waiter.start();
    }
}