package viikko_2.Task2_2_3;

/*
    Task 3: Categorizing Items

    Enhance the GroceryListManager class to support categorizing items.
    Each item should belong to a category (e.g., "Fruits", "Dairy", "Bakery"). Add the following methods:

    addItemWithCategory(String item, String category):
    This method should add the given item to the grocery list along with its category.
    displayByCategory(String category): This method should display all items in the specified category.
*/


import java.util.HashMap;
import java.util.Map;

public class CategorizingItem {
    // Use a HashMap to store item names and their corresponding categories
    private final HashMap<String, String> groceryList = new HashMap<>();

    public void addItemWithCategory(String item, String category) {
        if (item != null && !item.trim().isEmpty() && category != null && !category.trim().isEmpty()) {
            if (!groceryList.containsKey(item)) {
                groceryList.put(item, category);
                System.out.println(item + " => added to the grocery list in category: " + category);
            } else {
                System.out.println(item + " is already in the grocery list. Duplicate items not allowed.");
            }
        } else {
            System.out.println("Invalid item or category. Item and category cannot be empty or null.");
        }
    }

    public void removeItem(String item) {
        if (item != null && !item.trim().isEmpty()) {
            if (groceryList.containsKey(item)) {
                String removedCategory = groceryList.remove(item);
                System.out.println(item + " removed from the grocery list in category: " + removedCategory);
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
            System.out.println("Grocery List:");
            for (Map.Entry<String, String> entry : groceryList.entrySet()) {
                System.out.println(entry.getKey() + " => Category: " + entry.getValue());
            }
        }
    }

    public boolean checkItem(String item) {
        if (item != null && !item.trim().isEmpty()) {
            return groceryList.containsKey(item);
        }
        System.out.println("Invalid item. Item cannot be empty or null.");
        return false;
    }

    public void displayByCategory(String category) {
        if (category != null && !category.trim().isEmpty()) {
            System.out.println("Items in Category \"" + category + "\":");
            for (Map.Entry<String, String> entry : groceryList.entrySet()) {
                if (entry.getValue().equalsIgnoreCase(category)) {
                    System.out.println(entry.getKey());
                }
            }
        } else {
            System.out.println("Invalid category. Category cannot be empty or null.");
        }
    }

    public static void main(String[] args) {

        CategorizingItem groceryListManager = new CategorizingItem();

        // Add items with their categories to the grocery list
        groceryListManager.addItemWithCategory("Apples", "Fruits");
        groceryListManager.addItemWithCategory("Milk", "Dairy");
        groceryListManager.addItemWithCategory("Bread", "Bakery");
        groceryListManager.addItemWithCategory("Bananas", "Fruits");
        System.out.println();

        // Display the grocery list.
        groceryListManager.displayList();

        // Check if a specific item is present in the grocery list.
        System.out.println("\nIs \"Milk\" in the grocery list? " + groceryListManager.checkItem("Milk"));

        // Attempt to add duplicate item.
        groceryListManager.addItemWithCategory("Milk", "Dairy");

        // Remove an item from the grocery list.
        System.out.println("\nRemoving \"Milk\" from the list...");
        groceryListManager.removeItem("Milk");

        // Attempt to remove a non-existent item.
        System.out.println("\nRemoving \"Milk\" again...");
        groceryListManager.removeItem("Milk");

        // Display the updated grocery list.
        System.out.println("\nUpdated Grocery List:");
        groceryListManager.displayList();
        System.out.println();

        // Display items in a specific category
        groceryListManager.displayByCategory("Fruits");
    }
}

