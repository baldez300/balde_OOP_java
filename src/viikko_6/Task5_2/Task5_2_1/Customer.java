package viikko_6.Task5_2.Task5_2_1;

public class Customer extends Thread {
    private static int customerIdCounter = 1;
    private Theater theater;
    private int customerId;
    private int numSeatsToReserve;

    public Customer(Theater theater, int numSeatsToReserve) {
        this.theater = theater;
        this.customerId = customerIdCounter++;
        this.numSeatsToReserve = numSeatsToReserve;
    }

    @Override
    public void run() {
        theater.reserveSeats(numSeatsToReserve, customerId);
    }
}
