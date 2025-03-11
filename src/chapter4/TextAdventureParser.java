import java.util.Scanner;

/**
 * A simple text-based adventure game that parses user commands.
 */
public class TextAdventureParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Game world representation
        String[][] roomDescriptions = {
            {"You are in a dusty castle entrance. Corridors lead north and east.", "North Corridor", "East Corridor"},
            {"You are in the north corridor. There's a door to the east and a passage south.", "Guard Room", "Castle Entrance", null},
            {"This is the east corridor. There's a door to the north and a passage west.", "Throne Room", null, "Castle Entrance"}
        };

        // Player's current position (room index)
        int currentRoom = 0;

        System.out.println("Welcome to Text Adventure!");
        System.out.println("Type 'help' for commands.");

        boolean gameRunning = true;
        while (gameRunning) {
            // Display current room description
            System.out.println("\n" + roomDescriptions[currentRoom][0]);

            // Get player's command
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            // Parse and execute command
            if (input.equals("quit") || input.equals("exit")) {
                System.out.println("Thanks for playing!");
                gameRunning = false;
            }
            else if (input.equals("help")) {
                System.out.println("Available commands:");
                System.out.println("  go [direction] - Move in a direction (north, east, south, west)");
                System.out.println("  look - Look around the current room");
                System.out.println("  take [item] - Pick up an item");
                System.out.println("  quit - End the game");
            }
            else if (input.equals("look")) {
                System.out.println(roomDescriptions[currentRoom][0]);
            }
            else if (input.startsWith("go ") || input.startsWith("move ")) {
                // Extract the direction from command (after "go " or "move ")
                String direction = input.substring(input.indexOf(' ') + 1);
                movePlayer(direction, currentRoom, roomDescriptions);

                // Update player's position based on direction
                switch (direction) {
                    case "north":
                        if (roomDescriptions[currentRoom][1] != null) {
                            if (currentRoom == 0) currentRoom = 1;
                            else if (currentRoom == 2) currentRoom = 3;
                        }
                        break;
                    case "east":
                        if (roomDescriptions[currentRoom][2] != null) {
                            if (currentRoom == 0) currentRoom = 2;
                            else if (currentRoom == 1) currentRoom = 3;
                        }
                        break;
                    case "south":
                        if (roomDescriptions[currentRoom][3] != null) {
                            if (currentRoom == 1) currentRoom = 0;
                        }
                        break;
                    case "west":
                        if (currentRoom == 2) currentRoom = 0;
                        break;
                }
            }
            else if (input.startsWith("take ") || input.startsWith("pick up ")) {
                // Extract the item name
                String item = input.startsWith("take ") ?
                             input.substring(5) :
                             input.substring(8);

                if (currentRoom == 0 && item.equalsIgnoreCase("key")) {
                    System.out.println("You pick up a rusty key. It might open something nearby.");
                }
                else if (currentRoom == 2 && item.equalsIgnoreCase("sword")) {
                    System.out.println("You pick up the ceremonial sword. It glimmers in the light.");
                }
                else {
                    System.out.println("You don't see a " + item + " here.");
                }
            }
            else {
                System.out.println("I don't understand '" + input + "'. Type 'help' for commands.");
            }
        }

        scanner.close();
    }

    private static void movePlayer(String direction, int currentRoom, String[][] roomMap) {
        // Direction mapping to array indices: 1=north, 2=east, 3=south, 4=west
        int dirIndex;
        switch (direction) {
            case "north": dirIndex = 1; break;
            case "east": dirIndex = 2; break;
            case "south": dirIndex = 3; break;
            case "west": dirIndex = 4; break;
            default:
                System.out.println("Unknown direction: " + direction);
                return;
        }

        // Check if movement is possible
        if (dirIndex <= 3 && roomMap[currentRoom][dirIndex] != null) {
            System.out.println("You move " + direction + "...");
        }
        else if (direction.equals("west") && (currentRoom == 2)) {
            System.out.println("You move west...");
        }
        else {
            System.out.println("You can't go that way.");
        }
    }
}
