package viikko_4.Task3_1.Task3_1_1;

public class CarMain {
    public static void main(String[] args) {
        // Create a regular car
        Car regularCar = new Car("Regular Car", 60, 120);

        // Create a sports car
        SportCar sportsCar = new SportCar("Sports Car", 80, 200);

        // Accelerate the regular car and sports car
        for (int i = 0; i < 6; i++) {
            regularCar.accelerate();
            sportsCar.accelerate();

            // Display the speeds
            System.out.println("Regular Car Speed: " + regularCar.getSpeed() + " km/h");
            System.out.println("Sports Car Speed: " + sportsCar.getSpeed() + " km/h");
        }

        // Enable turbo mode for the sports car
        sportsCar.enableTurboMode();

        // Accelerate the sports car with turbo mode
        sportsCar.accelerate();
        System.out.println("\nSports Car Speed with Turbo Mode: " + sportsCar.getSpeed() + " km/h\n");

        // Disable turbo mode for the sports car
        sportsCar.disableTurboMode();

        // Decelerate both cars
        while (regularCar.getSpeed() > 0 || sportsCar.getSpeed() > 0) {
            regularCar.decelerate();
            sportsCar.decelerate();

            // Display the speeds
            System.out.println("Regular Car Speed: " + regularCar.getSpeed() + " km/h");
            System.out.println("Sports Car Speed: " + sportsCar.getSpeed() + " km/h");
        }
    }
}

