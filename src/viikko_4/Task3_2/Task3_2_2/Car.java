package viikko_4.Task3_2.Task3_2_2;

public class Car extends AbstractVehicle {
    private final String color;

    public Car(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void additionalInfo() {
        System.out.println("Color: " + getColor() +"\n");
    }
}
