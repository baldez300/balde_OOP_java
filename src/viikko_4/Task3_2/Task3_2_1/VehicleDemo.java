package viikko_4.Task3_2.Task3_2_1;

public class VehicleDemo {

    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car("Car", "Petrol", "Red");
        car.start();
        car.stop();
        car.getInfo();
        System.out.println("Type: "+ ((Car) car).getType());
        System.out.println("Fuel: "+ ((Car) car).getFuel());
        System.out.println("Color: "+ ((Car) car).getColor() + "\n");

        Vehicle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        System.out.println("Type: "+ ((Motorcycle) motorcycle).getType());
        System.out.println("Fuel: "+ ((Motorcycle) motorcycle).getFuel());
        System.out.println("Color: "+ ((Motorcycle) motorcycle).getColor() + "\n");

        Vehicle bus = new Bus("Bus", "Diesel", 40);
        bus.start();
        bus.stop();
        bus.getInfo();
        System.out.println("Type: "+ ((Bus) bus).getType());
        System.out.println("Fuel: "+ ((Bus) bus).getFuel());
        System.out.println("Capacity: "+ ((Bus) bus).getCapacity() + " passengers\n");
    }
}
