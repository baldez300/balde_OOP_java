package viikko_1;
/*
    Leiviskä, naula and luoti are medieval Finnish units of measurement.

    One leiviskä is 20 naula.
    One naula is 32 luoti.
    One luoti is 13.28 grams.
    Write a program that asks the user for a weight in grams and converts it to medieval measurements: leiviskä, naula, and luoti.
    The program should work in the following way:

    Weight (g): 30000
    30000 grams is 3 leiviskä, 10 naula, and 19.04 luoti.
    That is, leiviskä and naula are printed as integers, and luoti is printed with two decimal places.
*/

import java.util.Scanner;

public class Obsolete_measures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in (gram): ");
        int gram = Integer.parseInt(scanner.nextLine());

        int leiviska = (int) (gram / (20 * 32 * 13.28));
        int naula = (int) ((gram % (20 * 32 * 13.28)) / (32 * 13.28));
        double luoti = ((gram % (20 * 32 * 13.28)) % (32 * 13.28)) / 13.28;

        System.out.printf("%d grams is %d leviskä, %d naula, and %.2f luoti.",
                gram, leiviska, naula, luoti);

    }
}
