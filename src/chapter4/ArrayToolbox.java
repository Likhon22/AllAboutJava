import java.util.Arrays;

/**
 * Demonstrates the utility methods in the Arrays class.
 */
public class ArrayToolbox {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {7, 2, 9, 4, 5, 1, 8, 3, 6};
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting an array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Binary search (array must be sorted first)
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("The number 5 is at index: " + index);

        // Filling an array with a value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // Copying an array
        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copyOfNumbers));

        // Comparing arrays
        boolean areEqual = Arrays.equals(numbers, copyOfNumbers);
        System.out.println("Are arrays equal? " + areEqual);

        // Partial array copy
        int[] partialCopy = Arrays.copyOfRange(numbers, 3, 7);
        System.out.println("Partial copy (index 3 to 6): " + Arrays.toString(partialCopy));
        
        // Tournament ranking example
        rankTournamentPlayers();
    }
    
    public static void rankTournamentPlayers() {
        // Tournament ranking example
        System.out.println("\n=== Tournament Rankings ===");
        
        String[] contestants = {"Elara", "Thorne", "Morgan", "Ash", "Rowan"};
        int[] scores = {42, 85, 67, 91, 38};

        // Print original line-up
        System.out.println("Tournament contestants:");
        for (int i = 0; i < contestants.length; i++) {
            System.out.println(contestants[i] + ": " + scores[i]);
        }

        // Sort scores while keeping track of which score belongs to which contestant
        // (In real applications, you'd create a Player class to keep these together)
        // This is a simple demonstration using parallel arrays
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    // Swap scores
                    int tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    // Swap contestant names to keep them aligned with scores
                    String tempName = contestants[i];
                    contestants[i] = contestants[j];
                    contestants[j] = tempName;
                }
            }
        }

        // Print rankings
        System.out.println("\nTournament rankings:");
        for (int i = 0; i < contestants.length; i++) {
            System.out.println((i+1) + ". " + contestants[i] + " (" + scores[i] + " points)");
        }
    }
}
