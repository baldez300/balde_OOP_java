package viikko_1;

/*
    A program that takes an array of integers as input from the user and finds the subarray with the maximum sum.
    The program should work as follows:

    Ask the user for the number of integers in the array.
    Prompt the user to enter the integers into the array.
    Find the subarray with the maximum sum using the following logic:
    Iterate through all possible subarrays in the array.
    Calculate the sum of each subarray.
    Keep track of the maximum sum found and the corresponding subarray indices.
    Print the maximum sum and the corresponding indices. (Use the indices shown to the user, i.e., starting from 1.)
    Example:

    Enter the size of the array: 8
    Enter the integers into the array:
    Enter integer 1: -2
    Enter integer 2: 1
    Enter integer 3: -3
    Enter integer 4: 4
    Enter integer 5: -1
    Enter integer 6: 2
    Enter integer 7: 1
    Enter integer 8: -5

    Maximum sum: 6
    Integers: 4-7
*/

import java.util.Scanner;

public class FindingTheMaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers in the array?: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int maxSum = 0;
        int maxSumStartIndex = 0;
        int maxSumEndIndex = 0;

        for (int i = 0; i < arraySize; i++) {
            int sum = 0;

            for (int j = i; j < arraySize; j++) {
                sum += array[j];

                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumStartIndex = i;
                    maxSumEndIndex = j;
                }
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (maxSumStartIndex + 1) + "-" + (maxSumEndIndex + 1));

        scanner.close();

    }
}
