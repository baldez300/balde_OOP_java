package viikko_4.Task3_4.Task3_4_2;

/*
    Task 2: Generate number sequence and store it to a CSV file for spreadsheet application

    Generate a Fibonacci sequence of 100 numbers and write them to a CSV file.
    Then read the content of the file with a spreadsheet application.
*/

import java.io.FileWriter;
import java.io.IOException;

public class FibonacciGenerator {
    public static void main(String[] args) {
        int n = 100;  // Number of Fibonacci numbers to generate
        long[] fibonacci = new long[n];

        // Generate the Fibonacci sequence
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Write the Fibonacci sequence to a CSV file
        String csvFileName = "fibonacci_sequence.csv";
        try (FileWriter writer = new FileWriter(csvFileName)) {
            for (int i = 0; i < n; i++) {
                writer.append(Long.toString(fibonacci[i]));
                writer.append("\n");
            }
            System.out.println("Fibonacci sequence has been written to " + csvFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

