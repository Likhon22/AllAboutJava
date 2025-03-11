import java.util.ArrayList;

/**
 * Demonstrates the use of generics in Java.
 */
public class GenericsExample {
    public static void main(String[] args) {
        System.out.println("=== Generics Example ===");
        
        // Generic box for strings
        System.out.println("--- Magic Box Example ---");
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Magic Scroll");
        System.out.println("Item in string box: " + stringBox.getItem());
        
        // Generic box for integers
        Box<Integer> numberBox = new Box<>();
        numberBox.setItem(42);
        System.out.println("Item in number box: " + numberBox.getItem());
        
        // Game inventory example
        System.out.println("\n--- Game Inventory Example ---");
        
        Inventory<Potion> potionBag = new Inventory<>();
        potionBag.addItem(new Potion("Health Potion", 50));
        potionBag.addItem(new Potion("Mana Potion", 75));
        
        Inventory<Weapon> armory = new Inventory<>();
        armory.addItem(new Weapon("Sword", 15));
        armory.addItem(new Weapon("Bow", 12));
        
        // Display inventories
        System.out.println("Potion Inventory:");
        displayInventory(potionBag);
        
        System.out.println("\nWeapon Inventory:");
        displayInventory(armory);
        
        // Generic method example
        System.out.println("\n--- Generic Method Example ---");
        displayItem("Magic Scroll");
        displayItem(new Weapon("Legendary Sword", 25));
        displayItem(42);
        
        // Type bounds example
        System.out.println("\n--- Type Bounds Example ---");
        MagicChest<MagicalItem> magicChest = new MagicChest<>();
        magicChest.store(new Wand("Wand of Lightning", 30));
        magicChest.activateMagic();
    }
    
    // Generic method that works with any type
    public static <T> void displayItem(T item) {
        System.out.println("Examining item: " + item.toString());
    }
    
    // Generic method that can display any inventory
    public static void displayInventory(Inventory<?> inventory) {
        inventory.displayItems();
        System.out.println("Total items: " + inventory.count());
    }
    
    // A generic box class that can hold any type
    static class Box<T> {
        private T item;
        
        public void setItem(T item) {
            this.item = item;
        }
        
        public T getItem() {
            return item;
        }
    }
    
    // A generic inventory that stores collections of items
    static class Inventory<E> {
        private ArrayList<E> items = new ArrayList<>();
        
        public void addItem(E item) {
            items.add(item);
        }
        
        public E retrieveItem(int index) {
            if (index >= 0 && index < items.size()) {
                return items.get(index);
            }
            return null;
        }
        
        public int count() {
            return items.size();
        }
        
        public void displayItems() {
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i+1) + ". " + items.get(i));
            }
        }
    }
    
    // Base item classes for the game
    static class GameItem {
        protected String name;
        
        public GameItem(String name) {
            this.name = name;
        }
        
        @Override
        public String toString() {
            return name;
        }
    }
    
    static class Potion extends GameItem {
        private int potency;
        
        public Potion(String name, int potency) {
            super(name);
            this.potency = potency;
        }
        
        @Override
        public String toString() {
            return name + " (Potency: " + potency + ")";
        }
    }
    
    static class Weapon extends GameItem {
        private int damage;
        
        public Weapon(String name, int damage) {
            super(name);
            this.damage = damage;
        }
        
        @Override
        public String toString() {
            return name + " (Damage: " + damage + ")";
        }
    }
    
    // Type bounds example - MagicalItem interface and implementation
    interface MagicalItem {
        void castSpell();
        String getName();
    }
    
    static class Wand implements MagicalItem {
        private String name;
        private int power;
        
        public Wand(String name, int power) {
            this.name = name;
            this.power = power;
        }
        
        public String getName() {
            return name;
        }
        
        public void castSpell() {
            System.out.println("The " + name + " shoots a bolt of energy! (Power: " + power + ")");
        }
    }
    
    // A chest that can only store magical items
    static class MagicChest<T extends MagicalItem> {
        private T item;
        
        public void store(T item) {
            System.out.println("The chest glows as you store: " + item.getName());
            this.item = item;
        }
        
        public void activateMagic() {
            if (item != null) {
                System.out.println("The chest's runes activate the stored item:");
                item.castSpell();  // Safe! We know it's a MagicalItem
            } else {
                System.out.println("The chest is empty.");
            }
        }
    }
}
