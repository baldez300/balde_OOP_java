package viikko_4.Task3_2.Task3_2_4;

public class Bus extends AbstractVehicle {
    private final int capacity;
    private final double fuelEfficiency;

    public Bus(String type, String fuel, int capacity, double fuelEfficiency) {
        super(type, fuel);
        this.capacity = capacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void additionalInfo() {
        System.out.println("Capacity: " + getCapacity() + " passengers");
    }

    @Override
    public double calculateFuelEfficiency() {
        System.out.println("Fuel efficiency: "+ getFuelEfficiency() +" l/100km\n");
        return getFuelEfficiency();
    }
}
