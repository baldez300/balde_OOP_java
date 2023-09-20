package viikko_6.Task5_2.Task5_2_1;

public class TicketReservationSystem {

    public static void main(String[] args) {
        // Create a theater with 10 seats
        Theater theater = new Theater(10);

        // Create multiple threads representing customers
        Customer[] customers = {
            new Customer(theater, 1),
            new Customer(theater, 2),
            new Customer(theater, 1),
            new Customer(theater, 3),
            new Customer(theater, 1),
            new Customer(theater, 4),
            new Customer(theater, 3),
            new Customer(theater, 1),
            new Customer(theater, 3),
            new Customer(theater, 2)
        };

        // Start the customer threads
        for (Customer customer : customers) {
            customer.start();
        }
    }
}
