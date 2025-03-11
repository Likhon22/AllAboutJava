/**
 * Demonstrates type conversion (casting) in Java.
 */
public class TypeConversionExample {
    public static void main(String[] args) {
        demonstrateTypeConversion();
        
        // Practical example of conversion for a potion shop
        potionShopExample();
    }
    
    public static void demonstrateTypeConversion() {
        // Implicit conversion (widening) - happens automatically
        int smallNumber = 100;
        long bigNumber = smallNumber;    // int fits in long
        System.out.println("Implicit conversion from int to long: " + bigNumber);

        float floatVal = bigNumber;      // long fits in float
        System.out.println("Implicit conversion from long to float: " + floatVal);

        // Explicit conversion (narrowing) - requires casting
        double price = 19.99;
        int roundedPrice = (int)price;   // Drops decimal part, becomes 19
        System.out.println("Explicit conversion from double to int: " + roundedPrice);

        // Potential data loss example
        int largeInt = 1000000;
        byte smallByte = (byte)largeInt; // Overflow - only keeps lower 8 bits
        System.out.println("Converting large int to byte causes data loss: " + smallByte);
    }
    
    public static void potionShopExample() {
        // A customer wants to buy 2.5 liters of healing potion
        double potionAmount = 2.5;
        // But your bottles only come in whole units
        int bottleCount = (int)Math.ceil(potionAmount);

        System.out.println("\nPotion Shop Example:");
        System.out.println("Customer wants " + potionAmount + " liters");
        System.out.println("You'll need to sell " + bottleCount + " bottles");
    }
}
