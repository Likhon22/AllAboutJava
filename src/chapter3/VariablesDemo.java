/**
 * Demonstrates the use of different variable types in Java.
 */
public class VariablesDemo {
    public static void main(String[] args) {
        // Demonstrate primitive variable types
        demonstrateVariables();
        
        // Demonstrate real-world variable example
        System.out.println("\nPlayer Example:");
        playerExample();
    }
    
    public static void demonstrateVariables() {
        // Primitive types demonstration
        byte smallNumber = 100;         // 8-bit integer (-128 to 127)
        short mediumNumber = 5000;      // 16-bit integer (-32,768 to 32,767)
        int standardNumber = 1000000;   // 32-bit integer (most common integer type)
        long largeNumber = 15000000000L; // 64-bit integer (note the L suffix)
        float decimalNumber = 5.75f;    // 32-bit floating point (note the f suffix)
        double preciseDecimal = 19.99d; // 64-bit floating point (more precise)
        boolean flag = true;            // true or false values
        char letter = 'A';              // Single character

        // Display all values
        System.out.println("byte value: " + smallNumber);
        System.out.println("short value: " + mediumNumber);
        System.out.println("int value: " + standardNumber);
        System.out.println("long value: " + largeNumber);
        System.out.println("float value: " + decimalNumber);
        System.out.println("double value: " + preciseDecimal);
        System.out.println("boolean value: " + flag);
        System.out.println("char value: " + letter + " (ASCII: " + (int)letter + ")");
    }
    
    public static void playerExample() {
        // Storing a player's information in a game
        String playerName = "Alex";
        int playerScore = 157;
        boolean hasWonBefore = true;
        double playerRating = 4.8;

        // Displaying the player's information
        System.out.println("Welcome back, " + playerName + "!");
        System.out.println("Your current score is: " + playerScore);
        System.out.println("Previous winner: " + hasWonBefore);
        System.out.println("Player rating: " + playerRating + "/5.0");
        
        // After defeating the dragon
        playerScore += 500;  // Add 500 points
        playerRating = 5.0;  // Perfect rating!
        hasWonBefore = true; // Definitely a winner now
        
        System.out.println("\n" + playerName + " has defeated the dragon!");
        System.out.println("New score: " + playerScore);
        System.out.println("New rating: " + playerRating + "/5.0");
    }
}
