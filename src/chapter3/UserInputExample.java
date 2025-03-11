import java.util.Scanner;

/**
 * Demonstrates how to get input from users.
 */
public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Adventure game example
        System.out.println("=== Adventure Game Input Example ===");
        adventureGameInput(scanner);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
    
    public static void adventureGameInput(Scanner scanner) {
        // Prompt for and read the player's name
        System.out.println("What is your name, adventurer?");
        String name = scanner.nextLine();  // Reads a full line of text

        // Prompt for and read the player's experience
        System.out.println("How many years have you been adventuring?");
        int years = scanner.nextInt();  // Reads an integer
        scanner.nextLine();  // Consume the leftover newline
        
        // Greet the player with their information
        System.out.println("Welcome, " + name + ", a " + years + "-year veteran!");
        
        // Path choice
        System.out.println("\nYou come to a fork in the road.");
        System.out.println("Do you go (1) through the dark forest or (2) over the misty mountains?");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.println("You bravely enter the dark forest...");
        } else {
            System.out.println("You begin the treacherous climb over the misty mountains...");
        }
    }
}
