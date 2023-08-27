package viikko_1;

/*
    A program that prompts the user to enter two positive integers, start and end (where start < end).
    The program should generate and display all the prime numbers between start and end, inclusive.

    A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.

    The program should use control structures (such as loops and conditional statements)
    to implement the logic for generating and checking prime numbers.
*/

import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int startNum = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter end number: ");
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= endNum; i++) {
            boolean isPrime = true;
            int sqrtNum = (int) Math.sqrt(i);

            for (int j = 2; j <= sqrtNum; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && i > 1) {
                System.out.println("Prime number: " + i);
            }
        }

    }
}
