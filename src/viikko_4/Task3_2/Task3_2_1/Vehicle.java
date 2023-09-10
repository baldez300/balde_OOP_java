package viikko_4.Task3_2.Task3_2_1;

/*
    Task 1: Vehicle Interfaces and Implementations

    In this exercise, you will create a Java program to demonstrate the concept of interfaces and their implementations.
    You will define an interface Vehicle with methods for starting, stopping, and getting information about vehicles.
    Then, you will create classes Car, Motorcycle, and Bus that implement the Vehicle interface.
    The program will showcase how different vehicle types share a common interface.

    Instructions:

    Create a Java interface named Vehicle with the following methods:

    start(): This method should print a message indicating that the vehicle is starting.
    stop(): This method should print a message indicating that the vehicle is stopping.
    getInfo(): This method should return a string containing information about the vehicle.
    Create three classes: Car, Motorcycle, and Bus, each implementing the Vehicle interface.

    Implement the start(), stop(), and getInfo() methods in each class with appropriate messages and vehicle information.

    Create a Java class named VehicleDemo with a main method to demonstrate the interface implementations.
    In the main method, perform the following actions:

    Create instances of Car, Motorcycle, and Bus.
    Start and stop each vehicle.
    Display information about each vehicle.

    Example Output:

    Vehicle Demonstration

    Car is starting...
    Car is stopping...
    Car Information:
    Type: Car
    Fuel: Petrol
    Color: Red

    Motorcycle is starting...
    Motorcycle is stopping...
    Motorcycle Information:
    Type: Motorcycle
    Fuel: Gasoline
    Color: Black

    Bus is starting...
    Bus is stopping...
    Bus Information:
    Type: Bus
    Fuel: Diesel
    Capacity: 40 passengers
*/

// Interface Vehicle
interface Vehicle {

    void start();

    void stop();

    void getInfo();
}
