package viikko_2.Task2_2_5;

/*
    Create a separate class named ShoppingList that represents a list of items needed for a specific purpose
    (e.g., "Backyard BBQ", "Weekend Camping").
    The ShoppingList class should have methods to add items, remove items, and display the list.
    Use the ShoppingList class within the GroceryListManager class to manage multiple shopping lists.
*/


import java.util.HashMap;
import java.util.Map;

// ShoppingList class represents a list of items needed for a specific purpose.
class ShoppingList {
    // Instance variables
    private final String purpose;
    private final Map<String, Integer> itemList = new HashMap<>(); // Map to store items and their quantities

    // Constructor to create a ShoppingList with a specified purpose.
    public ShoppingList(String purpose) {
        this.purpose = purpose;
    }

    // Add an item to the shopping list with a specified quantity.
    public void addItem(String item, int quantity) {
        itemList.put(item, itemList.getOrDefault(item, 0) + quantity);
    }

    // Remove an item from the shopping list with a specified quantity.
    public void removeItem(String item, int quantity) {
        if (itemList.containsKey(item)) {
            int currentQuantity = itemList.get(item);
            if (quantity >= currentQuantity) {
                itemList.remove(item);
            } else {
                itemList.put(item, currentQuantity - quantity);
            }
        }
    }

    // Display the items and their quantities in the shopping list.
    public void displayList() {
        System.out.println("\n" + purpose + " Shopping List:");
        for (Map.Entry<String, Integer> entry : itemList.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(item + " (" + quantity + ")");
        }
    }

    // Get the purpose of the shopping list.
    public String getPurpose() {
        return purpose;
    }
}
