package viikko_2.Task_2_2_4;

/*
    Task 4: Quantity Tracking

    Extend the GroceryListManager class to track the quantity of each item in the list.
    Add the following methods:

    addItemWithQuantity(String item, int quantity): This method should add the given item along with its quantity to the grocery list.
    updateQuantity(String item, int newQuantity): This method should update the quantity of the specified item in the grocery list.
    displayAvailableItems(): This method should display items along with their quantities that have a positive quantity.
*/

import java.util.HashMap;
import java.util.Map;

public class QuantityTracking {
    // Store items and their quantities using a HashMap
    private final Map<String, Integer> groceryList = new HashMap<>();

    public void addItemWithQuantity(String item, int quantity) {
        if (item != null && !item.trim().isEmpty() && quantity > 0) {
            if (groceryList.containsKey(item)) {
                // If the item already exists, update its quantity by adding the new quantity
                int currentQuantity = groceryList.get(item);
                groceryList.put(item, currentQuantity + quantity);
            } else {
                // If the item is not in the list, add it with the given quantity
                groceryList.put(item, quantity);
            }
            System.out.println(item + " (" + quantity + ") added to the grocery list.");
        } else {
            System.out.println("Invalid item or quantity. Item cannot be empty or null, and quantity must be positive.");
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        if (item != null && !item.trim().isEmpty() && newQuantity >= 0) {
            if (groceryList.containsKey(item)) {
                // Update the quantity of the specified item
                groceryList.put(item, newQuantity);
                System.out.println("\nQuantity of " + item + " updated to " + newQuantity + ".");
            } else {
                System.out.println("\n"+ item + " is not in the grocery list. Cannot update quantity.");
            }
        } else {
            System.out.println("\nInvalid item or quantity. Item cannot be empty or null, and quantity must be non-negative.");
        }
    }

    public void displayAvailableItems() {
        System.out.println("\nAvailable Items:");
        for (Map.Entry<String, Integer> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            if (quantity > 0) {
                System.out.println(item + " (" + quantity + ")");
            }
        }
    }

    // ... (Other methods from the previous code)

    public static void main(String[] args) {
        QuantityTracking quantityTracking = new QuantityTracking();

        // Add items with quantities to the grocery list.
        quantityTracking.addItemWithQuantity("Apples", 5);
        quantityTracking.addItemWithQuantity("Milk", 2);
        quantityTracking.addItemWithQuantity("Bread", 3);

        // Display available items with quantities.
        quantityTracking.displayAvailableItems();

        // Update the quantity of an item.
        quantityTracking.updateQuantity("Milk", 1);

        // Display available items with updated quantities.
        quantityTracking.displayAvailableItems();
    }
}

