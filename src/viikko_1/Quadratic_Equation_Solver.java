package viikko_1;

/*
    A program that prompts the user to enter the coefficients of a quadratic equation (ax^2 + bx + c = 0) and
    calculates its roots using the quadratic formula.
    Display the roots on the console.
    If the equation has no real roots, display the message "No real roots".
*/

import java.util.Scanner;

public class Quadratic_Equation_Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the coefficient b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the coefficient c: ");
        double c = Double.parseDouble(scanner.nextLine());

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        }
        else {
            System.out.println("No real roots.");
        }
    }
}
