/**
 * Demonstrates 2D arrays in Java using game board examples.
 */
public class GridWorldExploration {
    public static void main(String[] args) {
        // Creating a 2D array - a 3x3 game board
        char[][] gameBoard = new char[3][3];

        // Fill with empty spaces
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                gameBoard[row][col] = '-';
            }
        }

        // Place some game pieces
        gameBoard[0][0] = 'X'; // Top left
        gameBoard[1][1] = 'O'; // Center
        gameBoard[2][2] = 'X'; // Bottom right

        // Display the game board
        System.out.println("Game Board:");
        displayBoard(gameBoard);

        // Example of a pre-initialized 2D array - a small dungeon map
        // 1 represents walls, 0 represents open paths
        int[][] dungeonMap = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1}
        };

        // Display the dungeon map
        System.out.println("\nDungeon Map:");
        for (int[] row : dungeonMap) {
            for (int cell : row) {
                // Print walls as # and paths as spaces for better visualization
                System.out.print(cell == 1 ? "# " : "  ");
            }
            System.out.println();
        }
        
        // Show temple map example
        displayTempleMap();
    }

    // Helper method to display the game board
    public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void displayTempleMap() {
        // Temple map: 0 = open path, 1 = wall, 2 = hidden passage, 3 = treasure
        int[][] templeMap = {
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1, 3, 1},
            {1, 0, 1, 2, 1, 0, 1},
            {1, 0, 1, 0, 0, 0, 1},
            {1, 3, 2, 0, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1}
        };

        System.out.println("\nTemple Map Legend:");
        System.out.println("# = Wall, ' ' = Path, H = Hidden Passage, T = Treasure\n");

        // Display the temple map
        for (int[] row : templeMap) {
            for (int cell : row) {
                if (cell == 0) System.out.print("  "); // Path
                else if (cell == 1) System.out.print("# "); // Wall
                else if (cell == 2) System.out.print("H "); // Hidden passage
                else if (cell == 3) System.out.print("T "); // Treasure
            }
            System.out.println();
        }
    }
}
