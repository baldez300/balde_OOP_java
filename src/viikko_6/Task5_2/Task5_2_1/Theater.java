package viikko_6.Task5_2.Task5_2_1;

/*
   Task 1: Ticket Reservation System

    Create a Java program that simulates a ticket reservation system for a limited number of seats in a theater. Implement synchronization to ensure that multiple threads representing customers can reserve seats without exceeding the available capacity.

    One possibility for the output:

    Customer 2 reserved 1 tickets.
    Customer 5 reserved 2 tickets.
    Customer 1 reserved 2 tickets.
    Customer 3 reserved 3 tickets.
    Customer 4 reserved 1 tickets.
    Customer 6 couldn't reserve 2 tickets.
    Customer 7 reserved 1 tickets.
    Customer 9 couldn't reserve 3 tickets.
    Customer 8 couldn't reserve 1 tickets.
    Customer 10 couldn't reserve 3 tickets.
    Customer 11 couldn't reserve 2 tickets.
    Customer 14 couldn't reserve 4 tickets.
    Customer 15 couldn't reserve 3 tickets.
    Customer 12 couldn't reserve 4 tickets.
    Customer 13 couldn't reserve 1 tickets.
*/

public class Theater {
    private int totalSeats;
    private int availableSeats;

    public Theater(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public synchronized boolean reserveSeats(int numSeats, int customerId) {
        if (numSeats <= availableSeats) {
            availableSeats -= numSeats;
            System.out.println("Customer " + customerId + " reserved " + numSeats + " tickets.");
            return true;
        } else {
            System.out.println("Customer " + customerId + " couldn't reserve " + numSeats + " tickets.");
            return false;
        }
    }
}
