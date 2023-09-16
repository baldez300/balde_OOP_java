package viikko_5.Task4_2;

/*
    Assignments
    Submit the answer of this assignment as a pdf file.
    The file should contain the source codes of the relevant classes as well as an explanation of how you used GitHub Copilot to write the code.
    For each assignment, evaluate the applicability of GitHub Copilot for your own coding style.
    What are the benefits and drawbacks of using GitHub Copilot?

    Assignment 1: Using GitHub Copilot to write methods
    In a new project, write a Calculator class that has the ability to sum positive integers.
    A negative integer should throw an exception.

    The class acts as the model in the MVC pattern. It should have the following methods:

    A method that resets the calculator to zero.
    A method that adds an integer to the calculator.
    A method that returns the current value of the calculator.
    In addition, write a temporary main method that creates an instance of the Calculator class and uses it to calculate the sum of a few integers.

    Explore various way in which you can use GitHub Copilot to write the sum method.
    For example, try the following:

    Write the method signature and let GitHub Copilot write the method body.
    Write the method signature and the first line of the method body, and let GitHub Copilot write the rest.
    Then, modify the code to use a different loop structure (while instead of for, or vice versa) in the body.
    Write a comment where you describe the method in English, letting GitHub Copilot write the method body based on the comment.

*/

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
