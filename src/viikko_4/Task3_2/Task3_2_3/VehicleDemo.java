package viikko_4.Task3_2.Task3_2_3;

public class VehicleDemo {

    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");

        ElectricCar electricCar = new ElectricCar("Electric Car", "Lithium-ion", "Blue");
        electricCar.start();
        electricCar.stop();
        electricCar.getInfo();
        electricCar.additionalInfo();
        electricCar.charge();

        System.out.println();

        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("Electric Motorcycle", "NiMH", "Yellow");
        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.getInfo();
        electricMotorcycle.additionalInfo();
        electricMotorcycle.charge();

    }
}
