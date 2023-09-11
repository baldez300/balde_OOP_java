package viikko_4.Task3_2.Task3_2_3;

class ElectricCar extends AbstractVehicle implements ElectricVehicle {
    private final String color;

    public ElectricCar(String type, String fuel, String color) {
        super(type, fuel, "Lithium-ion");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void additionalInfo() {
        System.out.println("Color: " + getColor());
        displayBatterType();
    }

    @Override
    public void charge() {
        System.out.println(getType() +" is charging...");
    }
}
