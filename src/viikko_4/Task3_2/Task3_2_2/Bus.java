package viikko_4.Task3_2.Task3_2_2;

public class Bus extends AbstractVehicle {
    private final int capacity;

    public Bus(String type, String fuel, int capacity) {
        super(type, fuel);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void additionalInfo() {
        System.out.println("Capacity: " + getCapacity() + " passengers\n");
    }
}
