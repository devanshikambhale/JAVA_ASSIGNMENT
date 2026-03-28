// Chat Application
// Create a class ChatApplication. Create threads for sending and
// receiving messages. Demonstrate thread lifecycle.
// Output: Sending and receiving messages.
class ChatApplication {

    public static void main(String[] args) {

        Thread sender = new Thread(() -> {
            System.out.println("Sending message...");
        });

        Thread receiver = new Thread(() -> {
            System.out.println("Receiving message...");
        });

        System.out.println("Thread State (Before start): " + sender.getState());

        sender.start();
        receiver.start();

        System.out.println("Thread State (After start): " + sender.getState());
    }
}