import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates using ArrayList in Java.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println("Integer list: " + list); // Prints: [4, 7, 9, 11]

        // Creating an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("Fruit list: " + fruits); // Prints: [Apple, Banana, Orange, Mango]

        // Removing an item
        fruits.remove(1); // Removes "Banana"
        System.out.println("After removing index 1: " + fruits); // Prints: [Apple, Orange, Mango]

        // Changing an item
        fruits.set(1, "Grapes"); // Changes "Orange" to "Grapes"
        System.out.println("After changing index 1: " + fruits); // Prints: [Apple, Grapes, Mango]

        // Getting an item
        System.out.println("Item at index 2: " + fruits.get(2)); // Prints: Mango

        // Getting the size
        System.out.println("List size: " + fruits.size()); // Prints: 3

        // Sorting
        Collections.sort(fruits);
        System.out.println("After sorting: " + fruits); // Prints: [Apple, Grapes, Mango]
        
        // Using ArrayList for a game inventory
        demonstrateGameInventory();
    }
    
    public static void demonstrateGameInventory() {
        System.out.println("\n=== Game Inventory Example ===");
        
        // Create a player inventory
        ArrayList<String> inventory = new ArrayList<>();
        
        // Add initial items
        inventory.add("Health Potion");
        inventory.add("Rusty Sword");
        inventory.add("Leather Armor");
        
        // Display inventory
        System.out.println("Initial inventory:");
        displayInventory(inventory);
        
        // Player finds a new item
        System.out.println("\nYou found a Magic Staff!");
        inventory.add("Magic Staff");
        
        // Player uses a potion
        System.out.println("You used a Health Potion!");
        inventory.remove("Health Potion");
        
        // Check if player has an item
        String itemToCheck = "Leather Armor";
        if (inventory.contains(itemToCheck)) {
            System.out.println("You are wearing " + itemToCheck);
        }
        
        // Display updated inventory
        System.out.println("\nUpdated inventory:");
        displayInventory(inventory);
    }
    
    // Helper method to display inventory with item numbers
    private static void displayInventory(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }
}
