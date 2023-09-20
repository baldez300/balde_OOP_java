package viikko_6.Task5_2.Task5_2_2;

/*
    Task 2: Thread-safe

    Assuming ArrayList is not thread-safe,
    design a class that has methods for adding an element to an ArrayList collection,
    querying the size of the collection, and removing an element from the collection.
    The elements may be any objects of your choice, such as Strings.
    The class you design should be thread-safe.
    Design a class that you can use to test thread-safety of your class.
*/

/*
    We use the synchronized keyword on the methods to ensure that only
    one thread can access these methods at a time, making them thread-safe.
 */

import java.util.ArrayList;

public class ThreadSafeArrayList<E> {

    private final ArrayList<E> arrayList = new ArrayList<>();

    public synchronized void addElement(E element) {
        arrayList.add(element);
    }

    public synchronized void removeElement(E element) {
        arrayList.remove(element);
    }


    public synchronized int getSize() {
        return arrayList.size();
    }
}
