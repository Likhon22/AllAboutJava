/**
 * Demonstrates different types of loops in Java.
 */
public class LoopExamples {
    public static void main(String[] args) {
        // For loop example
        System.out.println("=== For Loop Example ===");
        countdownToAdventure();
        
        // Nested for loops
        System.out.println("\n=== Nested Loops Example ===");
        demonstrateNestedLoops();
        
        // While loop example
        System.out.println("\n=== While Loop Example ===");
        simulateBattle();
        
        // Enhanced for loop example
        System.out.println("\n=== Enhanced For Loop Example ===");
        displayInventory();
    }
    
    public static void countdownToAdventure() {
        // Countdown to adventure!
        System.out.println("Adventure begins in:");
        for (int i = 10; i > 0; i--) {
            // This loop runs exactly 10 times (i=10,9,8,...,1)
            System.out.println(i + "...");

            // Let's demonstrate how we could simulate a delay
            // (In real applications, you would use Thread.sleep)
            if (i == 5) {
                System.out.println("Halfway there!");
            }
        }
        System.out.println("Let's go!");
    }

    public static void demonstrateNestedLoops() {
        // Creating a small coordinate grid using nested loops
        System.out.println("Exploring the dungeon grid:");
        for (int y = 0; y < 3; y++) {        // Rows
            for (int x = 0; x < 3; x++) {    // Columns
                System.out.print("(" + x + "," + y + ") ");
            }
            System.out.println(); // New line after each row
        }
    }
    
    public static void simulateBattle() {
        // Monster battle simulator with random elements
        int playerHealth = 100;
        int monsterHealth = 80;
        int roundCount = 1;

        System.out.println("Battle begins!");
        System.out.println("Player health: " + playerHealth);
        System.out.println("Monster health: " + monsterHealth);

        // This loop continues as long as both combatants have health
        while (playerHealth > 0 && monsterHealth > 0) {
            System.out.println("\n--- Round " + roundCount + " ---");

            // Player attacks monster with random damage
            int playerAttack = (int)(Math.random() * 15) + 5; // 5-20 damage
            monsterHealth -= playerAttack;
            System.out.println("You hit the monster for " + playerAttack + " damage!");

            if (monsterHealth <= 0) {
                System.out.println("Monster health reduced to " + monsterHealth);
                System.out.println("You defeated the monster!");
                break;  // Exit the loop early
            }

            // Monster attacks player with random damage
            int monsterAttack = (int)(Math.random() * 10) + 3; // 3-13 damage
            playerHealth -= monsterAttack;
            System.out.println("The monster hits you for " + monsterAttack + " damage!");

            if (playerHealth <= 0) {
                System.out.println("Player health reduced to " + playerHealth);
                System.out.println("You were defeated...");
                break;  // Exit the loop early
            }

            System.out.println("Your health: " + playerHealth);
            System.out.println("Monster health: " + monsterHealth);
            roundCount++;
        }

        System.out.println("\nBattle ended after " + roundCount + " rounds.");
    }
    
    public static void displayInventory() {
        // Define an array of inventory items
        String[] inventory = {"health potion", "magic scroll", "golden key", "sword"};

        System.out.println("Your inventory contains:");

        // Standard way to loop through an array
        System.out.println("Using standard for loop:");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println((i+1) + ". " + inventory[i]);
        }

        // Enhanced for loop - simpler syntax
        System.out.println("\nUsing enhanced for loop:");
        for (String item : inventory) {
            // The loop automatically gets each item one by one
            System.out.println("- " + item);
        }

        // You can also use enhanced for loop with numeric arrays
        int[] damages = {5, 10, 15, 20};
        int totalDamage = 0;

        System.out.println("\nCalculating total damage:");
        for (int damage : damages) {
            totalDamage += damage;
            System.out.println("Added " + damage + " damage, total is now " + totalDamage);
        }
    }
}
