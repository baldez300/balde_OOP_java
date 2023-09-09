package viikko_4.Task3_1.Task3_1_4;


public class Circle extends Shape {
    private final double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method to calculate the area of a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

