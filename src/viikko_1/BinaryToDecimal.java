package viikko_1;

/*
    A program that prompts the user to enter a binary number (composed of 0s and 1s) and converts it to decimal.
    Display the decimal equivalent on the console.
    Hint: use the charAt method of the String class to retrieve the individual bits in the input string.
*/

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        String binaryStr = scanner.nextLine();

        int decimal = 0;
        int power = 0;

        for (int i = binaryStr.length() -1; i >= 0; i--) {
            char bit = binaryStr.charAt(i);

            if (bit == '1') {
                decimal += (int) Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal: " + decimal);
    }
}
