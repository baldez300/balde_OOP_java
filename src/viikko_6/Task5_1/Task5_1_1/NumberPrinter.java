package viikko_6.Task5_1.Task5_1_1;

/*
    Task 1: Multi-threaded Number Printing

    Write a Java program that uses two threads to print numbers alternately.
    One thread should print odd numbers, and the other thread should print even numbers.
    The program should allow specifying a range of numbers to be printed.
    The output should be something like this:

    Odd Thread: 1
    Even Thread: 2
    Even Thread: 4
    Even Thread: 6
    Even Thread: 8
    Even Thread: 10
    Even Thread: 12
    Even Thread: 14
    Even Thread: 16
    Even Thread: 18
    Even Thread: 20
    Odd Thread: 3
    Odd Thread: 5
    Odd Thread: 7
    Odd Thread: 9
    Odd Thread: 11
    Odd Thread: 13
    Odd Thread: 15
    Odd Thread: 17
    Odd Thread: 19
    Printing complete.
*/

public class NumberPrinter {

    private static final int MAX_NUMBER = 20;

    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddNumberPrinter());
        Thread evenThread = new Thread(new EvenNumberPrinter());

        oddThread.start();
        evenThread.start();
    }

    private static class OddNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= MAX_NUMBER; i += 2) {
                System.out.println("Odd Thread: " + i);
            }

            try {
                Thread.sleep(100); // Sleep for 100 milliseconds to allow even thread to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class EvenNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= MAX_NUMBER; i += 2) {
                System.out.println("Even Thread: " + i);
            }

            try {
                Thread.sleep(100); // Sleep for 100 milliseconds to allow odd thread to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Printing complete.");
        }
    }
}
