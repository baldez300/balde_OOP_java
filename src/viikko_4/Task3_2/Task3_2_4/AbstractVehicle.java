package viikko_4.Task3_2.Task3_2_4;

abstract class AbstractVehicle implements Vehicle {
    private final String type;
    private final String fuel;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    public String getType() {
        return this.type;
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public void start() {
        System.out.println(getType() +" is starting...");
    }

    @Override
    public void stop() {
        System.out.println(getType() + " is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println(getType() +" Information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuel());
    }
}
