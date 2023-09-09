package viikko_4.Task3_1.Task3_1_3;


public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator\n");

        // Create an array of Shape objects
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 8.0);

        // Loop through the array and display the area of each shape
        for (Shape shape : shapes) {
            String shapeName = shape.getClass().getSimpleName();
            double area = shape.calculateArea();
            System.out.printf("Area of %s: %.1f%n", shapeName, area);

            // Print the area along with shape-specific information
            if (shape instanceof Circle) {
                double radius = ((Circle) shape).getRadius();
                System.out.printf("Area of Circle with radius %.1f: %.14f%n", radius, area);
            } else if (shape instanceof Rectangle) {
                double width = ((Rectangle) shape).getWidth();
                double height = ((Rectangle) shape).getHeight();
                System.out.printf("Area of Rectangle with width %.1f and height %.1f: %.1f%n", width, height, area);
            } else if (shape instanceof Triangle) {
                double base = ((Triangle) shape).getBase();
                double triHeight = ((Triangle) shape).getHeight();
                System.out.printf("Area of Triangle with base %.1f and height %.1f: %.1f%n", base, triHeight, area);
            }
        }
    }
}


