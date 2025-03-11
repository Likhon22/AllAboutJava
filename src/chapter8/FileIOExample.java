import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Demonstrates file input/output operations in Java.
 */
public class FileIOExample {
    public static void main(String[] args) {
        // File paths
        String savePath = "game_save.txt";
        String highScorePath = "high_scores.txt";
        
        // Write player data to a file
        savePlayerData(savePath);
        
        // Read player data from a file
        loadPlayerData(savePath);
        
        // Append a high score
        addHighScore(highScorePath, "Dragon Slayer", 9500);
        addHighScore(highScorePath, "Magic Master", 8200);
        
        // Read all high scores
        readHighScores(highScorePath);
        
        // Check if file exists and delete it if requested
        deleteFile(savePath);
    }
    
    // Write player data to a file
    public static void savePlayerData(String filePath) {
        System.out.println("\n=== Saving Player Data ===");
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write player information line by line
            writer.write("Hero Knight\n");  // Character name
            writer.write("Warrior\n");      // Character class
            writer.write("15\n");           // Character level
            writer.write("500\n");          // Health points
            writer.write("250\n");          // Mana points
            
            System.out.println("Player data saved successfully to " + filePath);
        } catch (IOException e) {
            System.out.println("Error saving player data: " + e.getMessage());
        }
    }
    
    // Read player data from a file
    public static void loadPlayerData(String filePath) {
        System.out.println("\n=== Loading Player Data ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read player information line by line
            String name = reader.readLine();
            String characterClass = reader.readLine();
            int level = Integer.parseInt(reader.readLine());
            int health = Integer.parseInt(reader.readLine());
            int mana = Integer.parseInt(reader.readLine());
            
            // Display the loaded character information
            System.out.println("Character loaded successfully!");
            System.out.println("Name: " + name);
            System.out.println("Class: " + characterClass);
            System.out.println("Level: " + level);
            System.out.println("Health: " + health);
            System.out.println("Mana: " + mana);
        } catch (IOException e) {
            System.out.println("Error loading player data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Save file is corrupted!");
        }
    }
    
    // Append a high score to a file
    public static void addHighScore(String filePath, String playerName, int score) {
        System.out.println("\n=== Adding High Score ===");
        try (FileWriter writer = new FileWriter(filePath, true)) { // true for append mode
            // Add the new high score as a new line
            writer.write(playerName + "," + score + "\n");
            System.out.println("High score recorded for " + playerName + ": " + score);
        } catch (IOException e) {
            System.out.println("Error saving high score: " + e.getMessage());
        }
    }
    
    // Read all high scores from a file
    public static void readHighScores(String filePath) {
        System.out.println("\n=== High Scores ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("PLAYER NAME\t\tSCORE");
            System.out.println("----------------------------");
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    String score = parts[1];
                    System.out.println(name + "\t\t" + score);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading high scores: " + e.getMessage());
        }
    }
    
    // Delete a file if it exists
    public static void deleteFile(String filePath) {
        System.out.println("\n=== File Management ===");
        File file = new File(filePath);
        
        if (file.exists()) {
            System.out.println("Save file exists: " + filePath);
            System.out.println("Deleting save file...");
            
            if (file.delete()) {
                System.out.println("Save file deleted successfully.");
            } else {
                System.out.println("Failed to delete save file.");
            }
        } else {
            System.out.println("Save file does not exist: " + filePath);
        }
    }
}
