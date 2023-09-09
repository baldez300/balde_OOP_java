package viikko_4.Task3_1.Task3_1_3;

/*
    Task 3: Shape Hierarchy and Polymorphism

    In this exercise, you will create a Java program that demonstrates the concept of polymorphism
    by implementing a shape hierarchy.
    You will define a base Shape class and derive various shapes such as Circle, Rectangle, and Triangle from it.
    The program will showcase the use of polymorphism to calculate and display the area of different shapes.

    Instructions:

    Create a Java class named Shape.

    Inside the Shape class, declare a method named calculateArea() that returns the area of the shape.
    The method should return an area of 0.

    Create three subclasses: Circle, Rectangle, and Triangle, each extending the Shape class.

    Implement the calculateArea() method in each subclass to calculate and return the area of the respective shape.
    Use appropriate instance variables and constructors for each shape.

    Create a Java class named ShapeCalculator with a main method to demonstrate polymorphism.
    In the main method, perform the following actions:

    Create an array of Shape objects containing instances of Circle, Rectangle, and Triangle.
    Loop through the array and display the area of each shape.
    Example Output:

    Shape Calculator

    Area of Circle with radius 5.0: 78.53981633974483
    Area of Rectangle with width 4.0 and height 6.0: 24.0
    Area of Triangle with base 3.0 and height 8.0: 12.0
*/

public class Shape {
    // Method to calculate the area of the shape
    public double calculateArea() {
        return 0.0; // Default area for any shape
    }
}
