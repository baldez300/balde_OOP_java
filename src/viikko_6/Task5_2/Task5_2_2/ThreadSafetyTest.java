package viikko_6.Task5_2.Task5_2_2;

public class ThreadSafetyTest {

    public static void main(String[] args) {
        final ThreadSafeArrayList<String> threadSafeArrayList = new ThreadSafeArrayList<>();

        // To add elements to the ArrayList
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                threadSafeArrayList.addElement("Thread 1");
            }
        });

        // To remove elements from the ArrayList
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                threadSafeArrayList.removeElement("Thread 2");
            }
        });

        // To get the size of the ArrayList
        Thread thread3 = new Thread(() -> {
            int size = threadSafeArrayList.getSize();
            System.out.println("Size of the ArrayList: " + size);
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println("Threads were interrupted.");
        }

        int finalSize = threadSafeArrayList.getSize();
        System.out.println("Final size of the ArrayList: " + finalSize);
    }
}
