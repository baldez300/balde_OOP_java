package viikko_4.Task3_2.Task3_2_1;

public class Car implements Vehicle {
    private final String type;
    private final String fuel;
    private final String color;

    public Car(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public String getFuel() {
        return this.fuel;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Car Information:");
    }
}
