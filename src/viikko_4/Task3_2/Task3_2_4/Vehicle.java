package viikko_4.Task3_2.Task3_2_4;

/*
    Task 4: Fuel Efficiency Calculation

    Add a method calculateFuelEfficiency() to the Vehicle interface.
    Implement this method in the vehicle classes to calculate
    and return the fuel efficiency (miles per gallon or kilometers per liter) of each vehicle type.
*/

// Interface Vehicle
interface Vehicle {

    void start();

    void stop();

    void getInfo();

    void additionalInfo();

    double calculateFuelEfficiency();
}
