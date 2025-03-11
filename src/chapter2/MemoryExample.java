/**
 * This class demonstrates how Java uses stack and heap memory.
 */
public class MemoryExample {
    public static void main(String[] args) {
        // Stack memory examples
        System.out.println("== STACK MEMORY EXAMPLES ==");
        stackExample();
        
        // Heap memory examples
        System.out.println("\n== HEAP MEMORY EXAMPLES ==");
        heapExample();
    }
    
    public static void stackExample() {
        // These primitive variables are stored in stack memory
        int x = 10;                  // stored in stack
        boolean isValid = true;      // stored in stack
        
        System.out.println("Stack variables:");
        System.out.println("x = " + x);
        System.out.println("isValid = " + isValid);
        
        // When this method ends, x and isValid are automatically removed from stack
        
        // Objects are stored in heap, but references are in stack
        Object obj = new Object();   // reference stored in stack, object in heap
        System.out.println("Object reference (in stack): " + obj);
    }
    
    public static void heapExample() {
        // Objects are stored in the heap
        String name = new String("Java");  // String object in heap
        System.out.println("String in heap: " + name);
        
        // Arrays are stored in heap
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println("Array in heap: first element = " + numbers[0]);
        
        // Show memory stats
        long totalMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long freeMemory = Runtime.getRuntime().freeMemory() / 1024 / 1024;
        System.out.println("Total memory: " + totalMemory + " MB");
        System.out.println("Free memory: " + freeMemory + " MB");
        System.out.println("Used memory: " + (totalMemory - freeMemory) + " MB");
    }
}
