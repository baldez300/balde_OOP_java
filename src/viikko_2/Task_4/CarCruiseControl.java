package viikko_2.Task_4;

public class CarCruiseControl {
    private float speed;
    private float gasolineLevel;
    private final String typeName;
    private float topSpeed;

    // New instance variables for cruise control
    private boolean cruiseControlOn;
    private float targetSpeed;

    public CarCruiseControl(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.topSpeed = 0; // Default topSpeed when not specified in the constructor
        cruiseControlOn = false; // Cruise control is initially off
        targetSpeed = 0; // Default target speed when cruise control is off
    }

    public CarCruiseControl(String typeName, float gasolineTankCapacity, float topSpeed) {
        this(typeName); // Call the existing constructor to initialize typeName
        this.gasolineLevel = gasolineTankCapacity;
        this.topSpeed = topSpeed; // Set the topSpeed provided in the constructor
        speed = 0; // Initialize speed to zero
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            // Ensure speed does not exceed topSpeed
            speed = Math.min(speed, topSpeed);
        } else {
            speed = 0;
        }
    }

    public void decelerate() {
        if (gasolineLevel > 0) {
            speed = Math.max(0, speed - 15);
        } else {
            speed = 0;
        }
    }

    public float getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    // Methods to control cruise control
    public boolean turnOnCruiseControl(float targetSpeed) {
        if (!cruiseControlOn && targetSpeed >= 30.0f && targetSpeed <= topSpeed) {
            cruiseControlOn = true;
            this.targetSpeed = targetSpeed;
            return true;
        }
        return false;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
        targetSpeed = 0;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public float getTargetSpeed() {
        return targetSpeed;
    }
}
