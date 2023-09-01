package viikko_2.Task_2;

/**/

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 50.0f, 110.0f);

        //myCar.fillTank(); // No need to fill the tank here, as it's already initialized in the constructor

        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        System.out.println();

        while(myCar.getSpeed() > 0) {
            myCar.decelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}
