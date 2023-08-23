// Program that asks the user three integers and prints their sum, product and average.
    // Hint: try the modified program with integers 3, 4, and 6.
    // The sum should be 13, the product 72, and the average 4.3333333333333.
    // If the average is something else, find out why and modify the program accordingly.
    // Add the explanation as a comment to the program. Commit your changes to GitHub.


import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.print("Give the second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.print("Give the third number: ");
        int third = Integer.parseInt(scanner.nextLine());

        double average = first + second + third;

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));
        System.out.println("The average of the numbers is " + (average / 3));
    }
}
