package viikko_4.Task3_2.Task3_2_3;

class ElectricMotorcycle extends AbstractVehicle implements ElectricVehicle {
    private final String color;

    public ElectricMotorcycle(String type, String fuel, String color) {
        super(type, fuel, "Nickel-cadmium");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void additionalInfo() {
        System.out.println("Color: " + getColor());
        displayBatterType();
    }

    @Override
    public void charge() {
        System.out.println(getType() +" is charging...");
    }
}
