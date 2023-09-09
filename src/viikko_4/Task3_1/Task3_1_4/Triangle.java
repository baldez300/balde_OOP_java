package viikko_4.Task3_1.Task3_1_4;


public class Triangle extends Shape {
    private final double base;
    private final double height;

    // Constructor to initialize the base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override the calculateArea method to calculate the area of a triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
