package viikko_4.Task3_1.Task3_1_2;

public class BusMain {
    public static void main(String[] args) {
        // Create a bus with a type name, gasoline tank capacity, top speed, and maximum passenger capacity
        Bus myBus = new Bus("City Bus", 100, 70, 50);

        // Display initial information about the bus
        System.out.println("Bus Information:");

        // Add passengers to the bus
        myBus.passengerEnter(10);
        myBus.passengerEnter(20);

        // Display the current passenger count
        System.out.println("\nCurrent Passenger Count: " + myBus.getPassengerCount() + "\n");

        // Try to add too many passengers
        myBus.passengerEnter(40);

        // Remove some passengers from the bus
        myBus.passengerExit(5);
        myBus.passengerExit(15);

        // Display the current passenger count
        System.out.println("Current Passenger Count: " + myBus.getPassengerCount() + "\n");

        // Calculate and display the total number of passengers
        int totalPassengers = myBus.calculateTotalPassengers();
        System.out.println("Total Passengers: " + totalPassengers);

        // Fill the bus's gasoline tank
        myBus.fillTank();
    }
}


