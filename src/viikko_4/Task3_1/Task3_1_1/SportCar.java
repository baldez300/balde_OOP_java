package viikko_4.Task3_1.Task3_1_1;


public class SportCar extends Car {
    private boolean turboModeEnabled;

    public SportCar(String typeName, float gasolineTankCapacity, float topSpeed) {
        super(typeName, gasolineTankCapacity, topSpeed);
        this.turboModeEnabled = false; // Turbo mode is initially disabled
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            int accelerationFactor = turboModeEnabled ? 30 : 20;
            setSpeed(getSpeed() + accelerationFactor);
            setSpeed(Math.min(getSpeed(), getTopSpeed()));
        } else {
            setSpeed(0);
        }
    }

    @Override
    public void decelerate() {
        if (getGasolineLevel() > 0) {
            int decelerationFactor = turboModeEnabled ? 40 : 30;
            setSpeed(Math.max(0, getSpeed() - decelerationFactor));
        } else {
            setSpeed(0);
        }
    }

    public void enableTurboMode() {
        turboModeEnabled = true;
    }

    public void disableTurboMode() {
        turboModeEnabled = false;
    }

    public boolean isTurboModeEnabled() {
        return turboModeEnabled;
    }
}

