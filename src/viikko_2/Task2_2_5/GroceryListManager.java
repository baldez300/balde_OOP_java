package viikko_2.Task2_2_5;

import java.util.ArrayList;

// GroceryListManager class manages multiple shopping lists.
public class GroceryListManager {
    // Instance variable to store a list of shopping lists.
    private final ArrayList<ShoppingList> shoppingLists = new ArrayList<>(); // List of shopping lists

    // Add a new shopping list with a specified purpose.
    public void addShoppingList(String purpose) {
        shoppingLists.add(new ShoppingList(purpose));
    }

    // Add an item to a specific shopping list with a specified quantity.
    public void addItemToShoppingList(String purpose, String item, int quantity) {
        for (ShoppingList shoppingList : shoppingLists) {
            if (shoppingList.getPurpose().equalsIgnoreCase(purpose)) {
                shoppingList.addItem(item, quantity);
                return;
            }
        }
        System.out.println("Shopping list with purpose '" + purpose + "' not found.");
    }

    // Remove an item from a specific shopping list with a specified quantity.
    public void removeItemFromShoppingList(String purpose, String item, int quantity) {
        for (ShoppingList shoppingList : shoppingLists) {
            if (shoppingList.getPurpose().equalsIgnoreCase(purpose)) {
                shoppingList.removeItem(item, quantity);
                return;
            }
        }
        System.out.println("Shopping list with purpose '" + purpose + "' not found.");
    }

    // Display the items and their quantities in a specific shopping list.
    public void displayShoppingList(String purpose) {
        for (ShoppingList shoppingList : shoppingLists) {
            if (shoppingList.getPurpose().equalsIgnoreCase(purpose)) {
                shoppingList.displayList();
                return;
            }
        }
        System.out.println("Shopping list with purpose '" + purpose + "' not found.");
    }

    // Main method to demonstrate the functionality of the GroceryListManager class.
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Create shopping lists
        manager.addShoppingList("Backyard BBQ");
        manager.addShoppingList("Weekend Camping");

        // Add items to shopping lists
        manager.addItemToShoppingList("Backyard BBQ", "Burger", 10);
        manager.addItemToShoppingList("Backyard BBQ", "Hot Dog", 15);
        manager.addItemToShoppingList("Weekend Camping", "Tent", 1);
        manager.addItemToShoppingList("Weekend Camping", "Sleeping Bag", 2);

        // Display shopping lists
        manager.displayShoppingList("Backyard BBQ");
        manager.displayShoppingList("Weekend Camping");

        // Remove items from shopping lists
        manager.removeItemFromShoppingList("Backyard BBQ", "Burger", 5);
        manager.removeItemFromShoppingList("Weekend Camping", "Sleeping Bag", 1);

        // Display updated shopping lists
        manager.displayShoppingList("Backyard BBQ");
        manager.displayShoppingList("Weekend Camping");
    }
}