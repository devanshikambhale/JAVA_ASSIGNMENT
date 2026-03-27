// Railway Reservation System

// Create a class RailwayReservation. Use synchronization to
// avoid double booking.
// Output: &#39;Ticket booked successfully&#39; or &#39;No tickets available&#39;
class RailwayReservation {
    int tickets = 1;   // only 1 ticket available

    synchronized void bookTicket() {
        if (tickets > 0) {
            System.out.println("Ticket booked successfully");
            tickets--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation rr = new RailwayReservation();

        Thread t1 = new Thread(() -> rr.bookTicket());
        Thread t2 = new Thread(() -> rr.bookTicket());

        t1.start();
        t2.start();
    }
}