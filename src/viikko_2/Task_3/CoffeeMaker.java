package viikko_2.Task_3;

/*
    A coffee maker has a selector for coffee type (normal/espresso) and a selector for coffee amount (10–80 ml).
    It also has an of/off switch that behaves in the same way as TV of/off switch. Coffee type and amount selectors behave like TV channel switch,
    i.e., they can only be changed when the device is on, and the device remembers the selections even when it is switched off.
*/

public class CoffeeMaker {
    private boolean on;
    private int coffeeAmount;
    private String coffeeType;

    public CoffeeMaker() {
        this.on = false;
        this.coffeeAmount = 10;
        this.coffeeType = "normal";
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setCoffeeAmount(int amount) {
        if (this.on && amount >= 10 && amount <= 80) {
            this.coffeeAmount = amount;
        }
    }

    public void setCoffeeType(String type) {
        if (this.on && (type.equals("normal") || type.equals("espresso"))) {
            this.coffeeType = type;
        }
    }

    public boolean isOn() {
        return this.on;
    }

    public int getCoffeeAmount() {
        return this.coffeeAmount;
    }

    public String getCoffeeType() {
        return this.coffeeType;
    }

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        System.out.println(coffeeMaker.isOn()); // false
        System.out.println(coffeeMaker.getCoffeeAmount()); // 10
        System.out.println(coffeeMaker.getCoffeeType()); // normal

        coffeeMaker.turnOn();
        System.out.println(coffeeMaker.isOn()); // true

        coffeeMaker.setCoffeeAmount(20);
        System.out.println(coffeeMaker.getCoffeeAmount()); // 20

        coffeeMaker.setCoffeeType("espresso");
        System.out.println(coffeeMaker.getCoffeeType()); // espresso

        coffeeMaker.turnOff();
        System.out.println(coffeeMaker.isOn()); // false

        coffeeMaker.setCoffeeAmount(30);
        System.out.println(coffeeMaker.getCoffeeAmount()); // 20

        coffeeMaker.setCoffeeType("normal");
        System.out.println(coffeeMaker.getCoffeeType()); // espresso
    }
}
