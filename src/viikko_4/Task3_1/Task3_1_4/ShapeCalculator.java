package viikko_4.Task3_1.Task3_1_4;


public class ShapeCalculator {

    // Method to check if two shapes are compatible for a specific operation
    public static boolean areShapesCompatible(Shape shape1, Shape shape2) {

        // Check if the shapes have compatible types for the operation
        if ((shape1 instanceof Circle && shape2 instanceof Circle) ||
                (shape1 instanceof Rectangle && shape2 instanceof Rectangle) ||
                (shape1 instanceof Triangle && shape2 instanceof Triangle)) {
            return true;
        } else {
            // Shapes have incompatible types
            return false;
        }
    }

    public static void main(String[] args) {

        // Test the areShapesCompatible method
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 8.0);

        System.out.println("Are Circle and Rectangle compatible? " + areShapesCompatible(circle, rectangle)); // false
        System.out.println("Are Triangle and Triangle compatible? " + areShapesCompatible(triangle, triangle)); // true
        System.out.println("Are Rectangle and Triangle compatible? " + areShapesCompatible(rectangle, triangle)); // false
    }
}



