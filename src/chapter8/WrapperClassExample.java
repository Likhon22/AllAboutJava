import java.util.ArrayList;

/**
 * Demonstrates the use of wrapper classes in Java.
 */
public class WrapperClassExample {
    public static void main(String[] args) {
        System.out.println("=== Wrapper Classes Example ===");
        
        // Level 1: The Basics - primitive to wrapper conversion
        Integer a = Integer.valueOf(5);  // Explicit conversion (old way)
        System.out.println("Integer a: " + a);
        
        // Level 2: Autoboxing - automatic conversion from primitive to wrapper
        Integer b = 6;  // Java automatically converts int to Integer
        System.out.println("Integer b (autoboxed): " + b);
        
        // Unboxing - automatic conversion from wrapper to primitive
        int c = b;  // Java automatically converts Integer to int
        System.out.println("int c (unboxed): " + c);
        
        // Level 3: Special wrapper methods
        String numString = "42";
        int parsed = Integer.parseInt(numString);
        System.out.println("\nParsed string \"" + numString + "\" to int: " + parsed);
        
        // Converting numbers to different string formats
        int treasure = 255;
        System.out.println("Treasure in decimal: " + Integer.toString(treasure));
        System.out.println("Treasure in binary: " + Integer.toBinaryString(treasure));
        System.out.println("Treasure in hexadecimal: " + Integer.toHexString(treasure));
        
        // Level 4: Working with null values (not possible with primitives)
        Integer questReward = null;  // Can be null (unlike primitive int)
        System.out.println("\nInitial quest reward: " + questReward);
        
        // Check for null before using
        if (questReward == null) {
            System.out.println("Quest not completed yet!");
            questReward = 500;  // Assign a value when quest completes
        }
        
        System.out.println("Final quest reward: " + questReward);
        
        // Level 5: Wrappers with collections
        System.out.println("\n=== Wrappers with Collections ===");
        
        ArrayList<Integer> playerScores = new ArrayList<>();
        playerScores.add(850);  // Autoboxing happens here
        playerScores.add(920);
        playerScores.add(760);
        
        System.out.println("Player scores: " + playerScores);
        
        // Calculate total using unboxing
        int total = 0;
        for (Integer score : playerScores) {
            total += score;  // Unboxing happens here
        }
        
        System.out.println("Total score: " + total);
        System.out.println("Average score: " + (total / playerScores.size()));
        
        // Constants available in wrapper classes
        System.out.println("\n=== Wrapper Constants ===");
        System.out.println("Maximum possible Integer value: " + Integer.MAX_VALUE);
        System.out.println("Minimum possible Integer value: " + Integer.MIN_VALUE);
        System.out.println("Maximum possible health in our game: " + Short.MAX_VALUE);
    }
}
