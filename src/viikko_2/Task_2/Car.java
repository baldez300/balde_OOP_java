package viikko_2.Task_2;

/*
    Modify Car class so that it has an additional constructor with gasoline tank capacity and top speed arguments.
*/


public class Car {
    private float speed;
    private float gasolineLevel;
    private final String typeName;
    private float topSpeed;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.topSpeed = 0; // Default topSpeed when not specified in the constructor
    }

    public Car(String typeName, float gasolineTankCapacity, float topSpeed) {
        this(typeName); // Call the existing constructor to initialize typeName
        this.gasolineLevel = gasolineTankCapacity;
        this.topSpeed = topSpeed; // Set the topSpeed provided in the constructor
        this.speed = 0; // Initialize speed to zero
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

    /*
    public void fillTank() {
        gasolineLevel = 100;
    }

    public float getGasolineLevel() {
        return gasolineLevel;
    }
    */
}

