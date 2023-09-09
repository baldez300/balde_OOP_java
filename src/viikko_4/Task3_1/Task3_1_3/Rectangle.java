package viikko_4.Task3_1.Task3_1_3;


public class Rectangle extends Shape {
    private final double width;
    private final double height;

    // Constructor to initialize the width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the calculateArea method to calculate the area of a rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

