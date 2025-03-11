/**
 * Demonstrates various String operations and methods.
 */
public class StringAdventures {
    public static void main(String[] args) {
        // Creating and examining strings
        String message = "The quick brown fox jumps over the lazy dog";
        System.out.println("Original message: " + message);
        System.out.println("Length: " + message.length());
        System.out.println("Contains 'fox': " + message.contains("fox"));

        // Character access
        System.out.println("\nCharacter at index 4: " + message.charAt(4));

        // Substring extraction
        String animal = message.substring(16, 19);  // "fox"
        System.out.println("Extracted animal: " + animal);

        // Finding positions
        int firstSpace = message.indexOf(' ');
        int lastSpace = message.lastIndexOf(' ');
        System.out.println("First space at: " + firstSpace);
        System.out.println("Last space at: " + lastSpace);

        // Transformations
        System.out.println("\nUppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());

        // Replacement
        String replaced = message.replace("quick", "nimble");
        System.out.println("After replacement: " + replaced);

        // Starts with / Ends with
        System.out.println("\nStarts with 'The': " + message.startsWith("The"));
        System.out.println("Ends with 'dog': " + message.endsWith("dog"));

        // Splitting strings
        System.out.println("\nWords in the message:");
        String[] words = message.split(" ");
        for (String word : words) {
            System.out.println("- " + word);
        }

        // Trimming whitespace
        String paddedText = "   Hello, world!   ";
        System.out.println("\nBefore trimming: '" + paddedText + "'");
        System.out.println("After trimming: '" + paddedText.trim() + "'");

        // String comparison
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("\nEquals (case sensitive): " + str1.equals(str2));
        System.out.println("Equals (case insensitive): " + str1.equalsIgnoreCase(str2));

        // String concatenation
        String firstName = "Jane";
        String lastName = "Doe";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("\nConcatenated name: " + fullName);
        
        // Format spell names example
        formatSpellNames();
    }
    
    public static void formatSpellNames() {
        // Collection of raw spell names from ancient scrolls
        String[] rawSpellNames = {
            "fireball", "FROST NOVA", "Lightning strike", "  healing touch  "
        };

        System.out.println("\nFormatting spells for the official spell book:");
        for (String rawName : rawSpellNames) {
            // Clean up and format the spell name
            String formattedName = rawName.trim(); // Remove extra spaces
            formattedName = formattedName.substring(0, 1).toUpperCase() +
                           formattedName.substring(1).toLowerCase();

            System.out.println("- " + formattedName);
        }
    }
}
