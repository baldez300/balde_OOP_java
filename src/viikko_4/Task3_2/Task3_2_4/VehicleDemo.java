package viikko_4.Task3_2.Task3_2_4;

public class VehicleDemo {

    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car("Car", "Petrol", "Red", 6.5);
        car.start();
        car.stop();
        car.getInfo();
        car.additionalInfo();
        car.calculateFuelEfficiency();

        Vehicle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black", 5.0);
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        motorcycle.additionalInfo();
        motorcycle.calculateFuelEfficiency();

        Vehicle bus = new Bus("Bus", "Diesel", 40, 12.0);
        bus.start();
        bus.stop();
        bus.getInfo();
        bus.additionalInfo();
        bus.calculateFuelEfficiency();
    }
}
