/**
 * Demonstrates basic array operations in Java.
 */
public class ArrayAdventure {
    public static void main(String[] args) {
        // Creating an array of player scores
        int[] scores = new int[5]; // Creates an array with 5 elements (all initialized to 0)

        // Assigning values to array elements
        scores[0] = 95;  // First element (zero-indexed)
        scores[1] = 87;
        scores[2] = 92;
        scores[3] = 78;
        scores[4] = 88;

        // Accessing array elements
        System.out.println("First score: " + scores[0]);
        System.out.println("Last score: " + scores[4]);

        // Getting array length
        System.out.println("Number of scores: " + scores.length);

        // Array initialization shorthand
        String[] players = {"Alex", "Morgan", "Casey", "Taylor", "Jordan"};

        // Looping through an array
        System.out.println("\nPlayer scores:");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i] + ": " + scores[i]);
        }

        // Calculating average score
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.printf("Average score: %.2f\n", average);
        
        // A new player joins the team
        System.out.println("\nAdding a new player...");
        addNewPlayer(players, scores);
    }
    
    public static void addNewPlayer(String[] players, int[] scores) {
        // A new player joins!
        String newPlayer = "Riley";
        int newScore = 91;

        // Create new, larger arrays
        String[] updatedPlayers = new String[players.length + 1];
        int[] updatedScores = new int[scores.length + 1];

        // Copy existing data
        for (int i = 0; i < players.length; i++) {
            updatedPlayers[i] = players[i];
            updatedScores[i] = scores[i];
        }

        // Add the new player
        updatedPlayers[updatedPlayers.length - 1] = newPlayer;
        updatedScores[updatedScores.length - 1] = newScore;

        // Display updated roster
        System.out.println("\nUpdated guild roster:");
        for (int i = 0; i < updatedPlayers.length; i++) {
            System.out.println(updatedPlayers[i] + ": " + updatedScores[i]);
        }
    }
}
