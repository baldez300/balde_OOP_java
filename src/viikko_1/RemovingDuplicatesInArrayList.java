package viikko_1;

/*
    A program that takes an array of integers as input from the user and removes all the duplicate numbers from it.
    The program should work as follows:

    Ask the user for the size of the array.
    Prompt the user to enter the integers into the array.
    Remove all the duplicate numbers from the array using the following logic:
    Create a new array that stores only one occurrence of each number.
    Keep only the first occurrence of each number and discard any subsequent occurrences.
    Print the resulting array without the duplicate numbers.
    In this assignment, you can make the new array as big as the original array, even though it may not be completely filled.

    Example:

    Enter the size of the array: 8
    Enter the integers into the array:
    Enter integer 1: 1
    Enter integer 2: 2
    Enter integer 3: 3
    Enter integer 4: 2
    Enter integer 5: 1
    Enter integer 6: 3
    Enter integer 7: 4
    Enter integer 8: 5

    The array without duplicates:
    1 2 3 4 5
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemovingDuplicatesInArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int sizeOfArray = scanner.nextInt();

        HashSet<Integer> uniqueSetEle = new HashSet<>();
        ArrayList<Integer> resultArray = new ArrayList<>();

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter integer "+ (i + 1) +": ");
            int num = scanner.nextInt();

            if (uniqueSetEle.add(num)) {
                resultArray.add(num);
            }
        }

        System.out.println();
        System.out.println("The array without duplicate:");
        for (int numElement : resultArray) {
            System.out.print(numElement +" ");
        }

        scanner.close();
    }
}
