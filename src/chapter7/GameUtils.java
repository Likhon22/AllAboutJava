/**
 * Utility class demonstrating various method types.
 */
public class GameUtils {
    // Method with no parameters and no return value
    public static void showGameTitle() {
        System.out.println("======================");
        System.out.println("= THE GRAND ADVENTURE =");
        System.out.println("======================");
    }

    // Method with parameters but no return value
    public static void greetPlayer(String name) {
        System.out.println("Welcome to the adventure, " + name + "!");
        showGameTime(); // Methods can call other methods
    }

    // Method with parameters and return value
    public static int rollDice(int sides) {
        // Generate a random number between 1 and sides
        int result = (int)(Math.random() * sides) + 1;
        return result; // Send this value back to the caller
    }

    // Method with no parameters but with return value
    public static void showGameTime() {
        // Getting current time
        java.time.LocalTime time = java.time.LocalTime.now();
        System.out.println("It is currently " + time);
    }

    // Main method to demonstrate method calls
    public static void main(String[] args) {
        // Call methods in sequence
        showGameTitle();
        greetPlayer("Morgan");

        // Store and use returned value
        int diceRoll = rollDice(20);
        System.out.println("You roll a " + diceRoll + " on a 20-sided dice.");

        // Conditional based on method result
        if (diceRoll > 15) {
            System.out.println("That's a great roll!");
        } else if (diceRoll > 5) {
            System.out.println("That's an average roll.");
        } else {
            System.out.println("That's an unfortunate roll!");
        }
    }
}
