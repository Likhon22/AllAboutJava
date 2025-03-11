/**
 * Demonstrates the use of StringBuilder for efficient string manipulation.
 */
public class StringBuilderMagic {
    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder spellBuilder = new StringBuilder("Magic");
        System.out.println("Initial spell: " + spellBuilder);

        // Appending to a StringBuilder
        spellBuilder.append(" Missile");
        System.out.println("After append: " + spellBuilder);

        // Inserting text at a specific position
        spellBuilder.insert(5, " Ice");
        System.out.println("After insert: " + spellBuilder);

        // Replacing a portion of the text
        spellBuilder.replace(10, 17, "Arrow");
        System.out.println("After replacement: " + spellBuilder);

        // Deleting a portion
        spellBuilder.delete(5, 9);  // Remove " Ice"
        System.out.println("After deletion: " + spellBuilder);

        // Reversing the string
        spellBuilder.reverse();
        System.out.println("Reversed: " + spellBuilder);
        spellBuilder.reverse();  // Reverse back for further operations

        // Converting StringBuilder to String
        String finalSpell = spellBuilder.toString();
        System.out.println("Final spell as String: " + finalSpell);

        // Performance comparison for many concatenations
        long startTime = System.nanoTime();
        String result1 = "";
        for (int i = 0; i < 10000; i++) {
            result1 += "a";  // Inefficient - creates a new String each time
        }
        long endTime = System.nanoTime();
        System.out.println("\nTime for String concatenation: " +
                          (endTime - startTime) / 1_000_000.0 + " ms");

        // Using StringBuilder for the same task
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");  // Efficient - modifies the same object
        }
        String result2 = sb.toString();
        endTime = System.nanoTime();
        System.out.println("Time for StringBuilder: " +
                          (endTime - startTime) / 1_000_000.0 + " ms");

        // Verify both approaches produced the same result
        System.out.println("Results match: " + result1.equals(result2));
        
        // Spell creation example
        buildMagicIncantation();
    }
    
    public static void buildMagicIncantation() {
        // Spell components collected by the wizard
        String[] elements = {"fire", "wind", "earth", "water"};
        String[] modifiers = {"greater", "lesser", "arcane", "primal"};
        String target = "transformation";

        // Randomly select components
        String element = elements[(int)(Math.random() * elements.length)];
        String modifier = modifiers[(int)(Math.random() * modifiers.length)];

        // Build the incantation
        StringBuilder incantation = new StringBuilder();
        incantation.append("By the power of ")
                  .append(modifier)
                  .append(" ")
                  .append(element)
                  .append(", I invoke the ")
                  .append(target)
                  .append("!");

        System.out.println("\nThe wizard raises his staff and chants:");
        System.out.println(incantation.toString());

        // Add dramatic effect
        incantation.insert(0, "\"");
        incantation.append("\"");
        incantation.append(" *magical sparks fly from the staff*");

        System.out.println("\nThe complete scene:");
        System.out.println(incantation.toString());
    }
}
