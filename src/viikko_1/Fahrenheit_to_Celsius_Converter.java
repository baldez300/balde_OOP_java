package viikko_1;

// A program that prompts the user to enter a temperature in Fahrenheit and converts it to Celsius.
// Displays the converted temperature on the console with one decimal place.

import java.util.Scanner;

public class Fahrenheit_to_Celsius_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32 ) * 5 / 9;

        System.out.printf("The temperature in Celsius is %.1f", celsius);
    }
}
