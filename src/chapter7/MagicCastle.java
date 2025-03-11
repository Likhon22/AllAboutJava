/**
 * Demonstrates access modifiers in Java using a castle metaphor.
 */
public class MagicCastle {
    // Level 1: Everyone can see the castle name (even visitors from other kingdoms)
    public String castleName = "Whispering Peaks";

    // Level 4: Only family members (this class and child classes) can access the treasure room
    protected int goldCoins = 5000;

    // Level 5: Only people in this village (package) can see the kitchen
    String kitchenContents = "Magic ingredients and recipes";

    // The number 1 rule: Only the castle owner can enter the private chambers
    private String secretSpell = "Abracadabra";

    // Methods can have security levels too!
    public void welcomeVisitors() {
        System.out.println("Welcome to " + castleName + "!");
        // Public methods can call private methods
        castSecretSpell();
    }

    private void castSecretSpell() {
        System.out.println("Casting: " + secretSpell);
        // Only methods in THIS class can call this
    }
    
    // Main method to demonstrate access
    public static void main(String[] args) {
        MagicCastle castle = new MagicCastle();
        
        // These work fine from within the castle
        System.out.println("Castle name: " + castle.castleName);         // Public - accessible everywhere
        System.out.println("Gold coins: " + castle.goldCoins);           // Protected - accessible in same class
        System.out.println("Kitchen: " + castle.kitchenContents);        // Default - accessible in same package
        System.out.println("Secret spell: " + castle.secretSpell);       // Private - accessible only in same class
        
        castle.welcomeVisitors();    // Public method can be called
        
        // Create and demonstrate a child castle
        TowerCastle tower = new TowerCastle();
        tower.showDetails();
    }
}

// A child class that extends MagicCastle
class TowerCastle extends MagicCastle {
    private int towerHeight = 100;
    
    public void showDetails() {
        System.out.println("\n=== Tower Castle Details ===");
        System.out.println("Castle name: " + castleName);         // Can access public members
        System.out.println("Gold coins: " + goldCoins);           // Can access protected members
        System.out.println("Kitchen: " + kitchenContents);        // Can access default members from same package
        // Cannot access the privateSpell variable (it's private to MagicCastle)
        System.out.println("Tower height: " + towerHeight);       // Can access its own private members
    }
}
