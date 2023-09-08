package viikko_4.Task3_1.Task3_1_2;


public class Bus extends Car {
    private int passengerCount;
    private int maxPassengers;

    public Bus(String typeName, float gasolineTankCapacity, float topSpeed, int maxPassengers) {
        super(typeName, gasolineTankCapacity, topSpeed);
        this.passengerCount = 0;
        this.maxPassengers = maxPassengers;
    }

    public void passengerEnter(int count) {
        if (count > 0 && count <= maxPassengers - passengerCount) {
            passengerCount += count;
            System.out.println(count + " passengers entered the bus.");
        } else {
            System.out.println("Invalid number of passengers.\n");
        }
    }

    public void passengerExit(int count) {
        if (count > 0 && count <= passengerCount) {
            passengerCount -= count;
            System.out.println(count + " passengers exited the bus.");
        } else {
            System.out.println("Invalid number of passengers to exit.\n");
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int calculateTotalPassengers() {
        return passengerCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Current Passengers: " + passengerCount + ", Maximum Capacity: " + maxPassengers;
    }
}


