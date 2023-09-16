The Calculator class is a simple Java class that represents a basic calculator with the ability to perform mathematical operations.

``` 
public class Calculator {
    // A variable that holds the value of the calculator.
    private int valueOfInt;

    // A method that resets the calculator to zero.
    public void reset() {
        this.valueOfInt = 0;
    }

    // A method that adds an integer to the calculator.
    // A negative integer should throw an exception.
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Only positive numbers allowed");
        }

        // Looping the number of times the number is.
        int i = 0;
        while (i < number) {
            this.valueOfInt++;
            i++;
        }
    }

    // A method that returns the current value of the calculator.
    public int getValue() {
        return this.valueOfInt;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Performing some calculations.
        calc.reset();
        calc.add(5);
        calc.add(10);
        calc.add(15);
        System.out.println("Total: "+ calc.getValue());
    }
}
```

Class: Calculator

private int valueOfInt: This is a private instance variable that holds the current value of the calculator.

Method: reset()

This method resets the calculator's value to zero.
It sets the valueOfInt variable to 0, effectively clearing any previous calculations.

Method: add(int number)

This method allows you to add a positive integer to the calculator's value.
It takes an integer number as a parameter.
If number is negative, it throws an IllegalArgumentException with the message "Only positive numbers allowed."
If number is positive, it adds number to the current value of the calculator.
The addition is performed using a while loop that iterates number times, incrementing the valueOfInt variable with each iteration.

Method: getValue()

This method retrieves and returns the current value of the calculator.
It simply returns the value stored in the valueOfInt instance variable.

Method: main(String[] args)

This is the main method that serves as an entry point for running and testing the Calculator class.
Inside the main method, an instance of the Calculator class, calc, is created.
Several calculations are performed using the reset() and add(int number) methods.
The results are displayed by calling calc.getValue() and printing the total value.

Overall, the Calculator class provides a basic calculator functionality with the ability to reset the calculator, 
add positive integers, and retrieve the current total. It also includes error handling to prevent the addition of negative numbers.

