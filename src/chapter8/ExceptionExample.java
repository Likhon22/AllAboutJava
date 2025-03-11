import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demonstrates exception handling in Java.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== Basic Exception Handling ===");
        divideNumbers(10, 2);
        divideNumbers(10, 0);  // This will cause an exception
        
        System.out.println("\n=== Array Exception Example ===");
        accessArray();
        
        System.out.println("\n=== File Exception Example ===");
        readGameConfigFile("config.txt");
        
        System.out.println("\n=== User Input Validation ===");
        validateUserInput();
    }
    
    // Example of handling arithmetic exception
    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
    
    // Example of handling array index out of bounds exception
    public static void accessArray() {
        int[] scores = {85, 92, 78, 95};
        
        try {
            System.out.println("First score: " + scores[0]);
            System.out.println("Last score: " + scores[3]);
            System.out.println("Invalid score: " + scores[4]);  // This will cause an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Trying to access an invalid array index!");
        }
        
        System.out.println("Program continues...");
    }
    
    // Example of handling file not found exception
    public static void readGameConfigFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            System.out.println("Reading configuration...");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Configuration file '" + fileName + "' not found!");
            System.out.println("Using default configuration.");
        }
    }
    
    // Example of validating user input with exception handling
    public static void validateUserInput() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your character level (1-100): ");
            String input = scanner.nextLine();
            int level = Integer.parseInt(input);
            
            if (level < 1 || level > 100) {
                throw new IllegalArgumentException("Level must be between 1 and 100");
            }
            
            System.out.println("Character level set to: " + level);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This will always execute, even if there was an exception
            System.out.println("Input processing complete.");
        }
    }
}
