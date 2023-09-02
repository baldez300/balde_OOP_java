package viikko_2.Task2_2_1;

/*
    Exercise Description:
    In this exercise, you will create a Java program that simulates a simple grocery list manager using ArrayList.
    The program will allow users to perform various operations on a grocery list,
    such as adding items, removing items, displaying the list, and checking if a specific item is present.

    Instructions:
    Create a Java class named GroceryListManager.

    Inside the GroceryListManager class, declare an ArrayList to store the grocery items.
    Use the following code to create the ArrayList:

    import java.util.ArrayList;

    public class GroceryListManager {
        private ArrayList<String> groceryList = new ArrayList<>();

        // Add methods here
    }
    Implement the following methods inside the GroceryListManager class:

    addItem(String item): This method should add the given item to the grocery list.
    removeItem(String item): This method should remove the given item from the grocery list.
    displayList(): This method should display all the items in the grocery list.
    checkItem(String item):
    This method should check if the given item is present in the grocery list and return a boolean value.
    Create a main method in the GroceryListManager class to demonstrate the functionality of the methods you implemented.
    In the main method, perform the following actions:

    Add a few items to the grocery list.
    Display the grocery list.
    Check if a specific item is present in the grocery list.
    Remove an item from the grocery list.
    Display the updated grocery list.
    Example Output:
    Grocery List:
    1. Apples
    2. Milk
    3. Bread

    Is "Milk" in the grocery list? true

    Removing "Milk" from the list...

    Updated Grocery List:
    1. Apples
    2. Bread
    Note: You are encouraged to enhance the exercise by adding input validation
    and error handling to handle cases such as adding duplicate items, removing non-existent items, and so on.

*/


import java.util.ArrayList;

public class GroceryListManager {
    private final ArrayList<String> groceryList = new ArrayList<>();

    // Added method list
    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }


    public static void main(String[] args) {

        GroceryListManager groceryListManager = new GroceryListManager();

        // Add a few items to the grocery list.
        groceryListManager.addItem("Apples");
        groceryListManager.addItem("Milk");
        groceryListManager.addItem("Bread");

        // Display the grocery list.
        System.out.println("Grocery List:");
        groceryListManager.displayList();

        // Check if a specific item is present in the grocery list.
        System.out.println("\nIs \"Milk\" in the grocery list? " + groceryListManager.checkItem("Milk"));

        // Remove an item from the grocery list.
        System.out.println("\nRemoving \"Milk\" from the list...");
        groceryListManager.removeItem("Milk");

        // Display the updated grocery list.
        System.out.println("\nUpdated Grocery List:");
        groceryListManager.displayList();
    }

}
