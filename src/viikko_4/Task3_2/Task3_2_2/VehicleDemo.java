package viikko_4.Task3_2.Task3_2_2;

public class VehicleDemo {

    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car("Car", "Petrol", "Red");
        car.start();
        car.stop();
        car.getInfo();
        car.additionalInfo();

        Vehicle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        motorcycle.additionalInfo();

        Vehicle bus = new Bus("Bus", "Diesel", 40);
        bus.start();
        bus.stop();
        bus.getInfo();
        bus.additionalInfo();
    }
}
