package viikko_4.Task3_2.Task3_2_4;

public class Car extends AbstractVehicle {
    private final String color;
    private final double fuelEfficiency;

    public Car(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel);
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getColor() {
        return color;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void additionalInfo() {
        System.out.println("Color: " + getColor());
    }

    @Override
    public double calculateFuelEfficiency() {
        System.out.println("Fuel efficiency: "+ getFuelEfficiency() +" l/100km\n");
        return getFuelEfficiency();
    }
}

