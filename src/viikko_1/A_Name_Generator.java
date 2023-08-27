package viikko_1;

/*
    A program that generates random names by combining first and last names from hard-coded name arrays.
    The program should work as follows:

    Create two arrays, firstNames and lastNames, which contain first and last names.

    Ask the user how many random names the program should generate.

    Generate random names using the following logic:

    Choose the index value for the first name randomly.
    Choose the index value for the last name randomly.
    Use the index values to create a random full name (i.e. first name and last name).
    Print the generated full name.
    Repeat these steps as many times as the user-specified number of names to generate.
*/

import java.util.Random;
import java.util.Scanner;

public class A_Name_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] firstNames = {
                "Emma", "Liam", "Olivia", "Noah", "Ava",
                "Isabella", "Sophia", "Mia", "Jackson", "Lucas"
        };

        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Jones", "Brown",
                "Davis", "Miller", "Wilson", "Moore", "Taylor"
        };

        System.out.print("How many random names do you want to generate?: ");
        int numNames = scanner.nextInt();

        System.out.println("Generated name(s):");

        for (int i = 0; i < numNames; i++) {
            int firstNameIndex = random.nextInt(firstNames.length);
            int lastNameIndex = random.nextInt(lastNames.length);

            String fullName = firstNames[firstNameIndex] +" " + lastNames[lastNameIndex];
            System.out.println(fullName);
        }

        scanner.close();
    }
}

