package viikko_4.Task3_2.Task3_2_2;

/*
    Task 2: Vehicle Inheritance Hierarchy

    Create a more complex inheritance hierarchy for vehicles by introducing abstract classes.
    Modify the exercise to have an abstract class AbstractVehicle that implements the Vehicle interface,
    and then have the Car, Motorcycle, and Bus classes extend AbstractVehicle.
    Implement additional methods and attributes in the abstract class.
*/

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
