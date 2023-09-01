package viikko_2.Task_4;

/*
    Add to Car class a cruise control feature.
    With cruise control feature, the driver can set the target speed, read the current target speed,
    and turn cruise control on or off.
    For cruise control there is a minimum and maximum speed that can be set.
    After target speed has been set and cruise control turned on,
    the car should accelerate or decelerate to reach the target speed.
    If reaching the target speed is not possible, cruise control must be turned off,
    and the driver be informed about this (perhaps the returning value of turnOn method could be used for this).
    Modify CarDriver class to test your cruise control.
    Do this before you implement cruise control in Car class.
    Why to modify CarDriver first?
*/

/*
    Modifying the CarDriver class first to test the cruise control feature
    before implementing it in the Car class is a good practice
    because it allows you to verify the functionality of the feature in isolation
    and ensures that it works correctly.
    This approach follows a common development pattern called "test-driven development" (TDD),
    where you write tests for a feature before implementing the feature itself.
*/

public class CarDriverCruiseControl {

    public static void main(String[] args) {
        CarCruiseControl myCar;

        myCar = new CarCruiseControl("Toyota Corolla", 50.0f, 110.0f);

        // Test the cruise control feature
        System.out.println("Turning on cruise control...");
        boolean cruiseControlOn = myCar.turnOnCruiseControl(80.0f); // Set the target speed to 80 km/h

        if (cruiseControlOn) {
            System.out.println("Cruise control is on.");
        } else {
            System.out.println("Cruise control could not be turned on.");
        }

        // Accelerate to the target speed
        while (cruiseControlOn && myCar.getSpeed() < myCar.getTargetSpeed()) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Decelerate to the target speed
        while (cruiseControlOn && myCar.getSpeed() > myCar.getTargetSpeed()) {
            myCar.decelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Turn off cruise control
        myCar.turnOffCruiseControl();

        System.out.println("Cruise control is off.");

        // Test other car actions (acceleration and deceleration)
        System.out.println("Testing acceleration and deceleration...");

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        System.out.println();

        while (myCar.getSpeed() > 0) {
            myCar.decelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}
