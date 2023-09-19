package viikko_6.Task5_1.Task5_1_2;

/*
    Task 2: Parallel Number Summation

    Create a Java program that calculates the sum of numbers in parallel using multiple threads.
    In this exercise, each thread calculates the sum of a portion of the numbers.
*/

import java.util.concurrent.*;

public class ParallelNumberSummation {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 4; // Number of threads to use
        int chunkSize = numbers.length / numThreads; // Number of elements per thread

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Future<Integer>[] results = new Future[numThreads];

        int startIndex = 0;
        int endIndex = chunkSize;

        // Submit tasks to calculate the sum of portions of the array
        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                endIndex = numbers.length; // Last thread handles remaining elements
            }
            Callable<Integer> task = new SummationTask(numbers, startIndex, endIndex);
            results[i] = executor.submit(task);

            startIndex = endIndex;
            endIndex += chunkSize;
        }

        // Wait for all tasks to complete and retrieve results
        int totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                totalSum += results[i].get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

        System.out.println("Total Sum: " + totalSum);
    }

    static class SummationTask implements Callable<Integer> {
        private final int[] numbers;
        private final int startIndex;
        private final int endIndex;

        public SummationTask(int[] numbers, int startIndex, int endIndex) {
            this.numbers = numbers;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public Integer call() {
            int sum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += numbers[i];
            }
            return sum;
        }
    }
}
