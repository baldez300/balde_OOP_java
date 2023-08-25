package viikko_1;

// A program that asks the user for the lengths of the legs of a right triangle and
// prints the length of the hypotenuse of the triangle

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter leg a: ");
        double legA = scanner.nextDouble();

        System.out.print("Enter leg b: ");
        double legB = scanner.nextDouble();

        double legC = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));

        System.out.printf("The length of the hypotenuse is %.1f", legC);
    }
}
