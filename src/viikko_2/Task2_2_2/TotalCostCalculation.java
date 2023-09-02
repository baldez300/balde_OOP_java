package viikko_2.Task2_2_2;

/*
    Task 2: Total Cost Calculation

    Modify the GroceryListManager class to store both the item name and its corresponding cost as a pair
    (e.g., using a HashMap<String, Double>). Add the following methods:

    addItem(String item, double cost): This method should add the given item and its cost to the grocery list.
    calculateTotalCost(): This method should calculate and return the total cost of all items in the grocery list.

 */


import java.util.HashMap;
import java.util.Map;

public class TotalCostCalculation {
    // Use a HashMap to store item names and their corresponding costs
    private final HashMap<String, Double> groceryList = new HashMap<>();

    // Add an item with its cost to the grocery list
    public void addItem(String item, double cost) {
        // Check if the item already exists in the list, and if it does, update its cost
        if (groceryList.containsKey(item)) {
            double existingCost = groceryList.get(item);
            groceryList.put(item, existingCost + cost);
        } else {
            // If it's a new item, simply add it with its cost
            groceryList.put(item, cost);
        }
    }

    /*
    // Remove an item from the grocery list
    public void removeItem(String item) {
        groceryList.remove(item);
    }
    */

    // Display the grocery list with item names and costs
    public void displayList() {
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() +" €") ;
        }
    }

    // Check if a specific item is present in the grocery list
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // Calculate and return the total cost of all items in the grocery list
    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (double cost : groceryList.values()) {
            totalCost += cost;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        TotalCostCalculation totalCostCalculation = new TotalCostCalculation();

        // Add items with their costs to the grocery list
        totalCostCalculation.addItem("Apples", 2.99);
        totalCostCalculation.addItem("Milk", 1.99);
        totalCostCalculation.addItem("Bread", 2.49);
        totalCostCalculation.addItem("Orange", 1.04);
        totalCostCalculation.addItem("Apples", 1.49); // Update the cost of existing item

        // Display the grocery list with item names and costs
        System.out.println("Grocery List:");
        totalCostCalculation.displayList();

        // Check if a specific item is present in the grocery list
        System.out.println("\nIs \"Milk\" in the grocery list? " + totalCostCalculation.checkItem("Milk"));

        // Calculate and display the total cost of all items in the grocery list
        double totalCost = totalCostCalculation.calculateTotalCost();
        System.out.println("\nTotal Cost: " + totalCost +" €");
    }
}

