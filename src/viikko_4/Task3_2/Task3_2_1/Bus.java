package viikko_4.Task3_2.Task3_2_1;

public class Bus implements Vehicle {

    private final String type;
    private final String fuel;
    private final int capacity;

    public Bus(String type, String fuel, int capacity) {
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;
    }

    public String getType() {
        return this.type;
    }

    public String getFuel() {
        return this.fuel;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus Information:");
    }
}
