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

    public void addItem(String item) {
        if (item != null && !item.trim().isEmpty()) {
            if (!groceryList.contains(item)) {
                groceryList.add(item);
                System.out.println(item + " => added to the grocery list.");
            } else {
                System.out.println(item + " is already in the grocery list. Duplicate items not allowed.");
            }
        } else {
            System.out.println("Invalid item. Item cannot be empty or null.");
        }
    }

    public void removeItem(String item) {
        if (item != null && !item.trim().isEmpty()) {
            if (groceryList.contains(item)) {
                groceryList.remove(item);
                System.out.println(item + " removed from the grocery list.");
            } else {
                System.out.println(item + " is not in the grocery list. Cannot remove.");
            }
        } else {
            System.out.println("Invalid item. Item cannot be empty or null.");
        }
    }

    public void displayList() {
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            // System.out.println("Grocery List:");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println(i + 1 + ". " + groceryList.get(i));
            }
        }
    }

    public boolean checkItem(String item) {
        if (item != null && !item.trim().isEmpty()) {
            return groceryList.contains(item);
        }
        System.out.println("Invalid item. Item cannot be empty or null.");
        return false;
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

        // Attempt to add duplicate item.
        groceryListManager.addItem("Milk");

        // Remove an item from the grocery list.
        System.out.println("\nRemoving \"Milk\" from the list...");
        groceryListManager.removeItem("Milk");

        // Attempt to remove a non-existent item.
        System.out.println("\nRemoving \"Milk\" again...");
        groceryListManager.removeItem("Milk");

        // Display the updated grocery list.
        System.out.println("\nUpdated Grocery List:");
        groceryListManager.displayList();
    }
}

