/**
 * Demonstrates object-oriented programming concepts.
 */
public class OOPExamples {
    public static void main(String[] args) {
        System.out.println("=== Game Character Example ===");
        
        // Create different character types
        Warrior hero = new Warrior("Thorin", "Battle Axe");
        Wizard enemy = new Wizard("Malakar");

        // The battle begins!
        hero.attack(enemy);
        enemy.attack(hero);
        hero.defend();
        enemy.meditate();
        
        System.out.println("\n=== Vehicle Polymorphism Example ===");
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Toyota", "Camry");
        vehicles[1] = new Boat("Sailboat");
        vehicles[2] = new Car("Honda", "Civic");
        
        for (Vehicle v : vehicles) {
            v.move(); // Polymorphic method call - each vehicle moves differently
        }
    }
}

// Base character class with common traits
abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int level;

    // All characters can take damage
    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(name + " takes " + amount + " damage! Health: " + health);
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }

    // But each type attacks differently
    public abstract void attack(GameCharacter target);
}

// A warrior is a type of character
class Warrior extends GameCharacter {
    private String weapon;

    public Warrior(String name, String weapon) {
        this.name = name;
        this.health = 100;
        this.level = 1;
        this.weapon = weapon;
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = level * 5;
        System.out.println(name + " swings " + weapon + " for " + damage + " damage!");
        target.takeDamage(damage);
    }

    // Warriors can also defend
    public void defend() {
        System.out.println(name + " raises shield, reducing next damage by 50%!");
    }
}

// A wizard is also a character, but works differently
class Wizard extends GameCharacter {
    private int mana;

    public Wizard(String name) {
        this.name = name;
        this.health = 60;
        this.level = 1;
        this.mana = 100;
    }

    @Override
    public void attack(GameCharacter target) {
        if (mana >= 10) {
            int damage = level * 8;
            System.out.println(name + " casts a spell for " + damage + " damage!");
            target.takeDamage(damage);
            mana -= 10;
        } else {
            System.out.println(name + " is out of mana and cannot attack!");
        }
    }

    // Wizards can restore mana
    public void meditate() {
        mana += 20;
        System.out.println(name + " meditates and recovers 20 mana. Total mana: " + mana);
    }
}

// Vehicle class hierarchy for polymorphism example
abstract class Vehicle {
    protected String type;
    
    public Vehicle(String type) {
        this.type = type;
    }
    
    public abstract void move();
}

class Car extends Vehicle {
    private String make;
    
    public Car(String make, String model) {
        super("Car");
        this.make = make;
    }
    
    @Override
    public void move() {
        System.out.println(make + " " + type + " drives on the road");
    }
}

class Boat extends Vehicle {
    public Boat(String type) {
        super(type);
    }
    
    @Override
    public void move() {
        System.out.println(type + " sails on the water");
    }
}
