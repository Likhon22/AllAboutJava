/**
 * Demonstrates how Java garbage collection works.
 */
public class GarbageCollectionDemo {
    public static void main(String[] args) {
        System.out.println("Garbage Collection Demo");
        garbageCollectionExample();
    }
    
    public static void garbageCollectionExample() {
        // Object creation (in heap)
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println("Builder created: " + builder);  // Object is accessible
        
        // Object becomes eligible for GC
        builder = null;  // Remove reference
        System.out.println("Builder reference removed: " + builder);  // Outputs: null
        
        // Create many objects to encourage garbage collection
        System.out.println("Creating many objects...");
        for(int i = 0; i < 1000000; i++) {
            String temp = new String("temp" + i);
            // No reference kept, these objects become eligible for GC
        }
        
        // At some point, GC will reclaim memory
        System.gc();  // Suggestion to run garbage collection (not guaranteed)
        System.out.println("Garbage collection requested");
        
        // Show memory stats
        long beforeGC = Runtime.getRuntime().freeMemory() / 1024 / 1024;
        System.out.println("Free memory before forcing GC: " + beforeGC + " MB");
        
        // Force garbage collection again for demo
        System.gc();
        System.runFinalization();
        
        long afterGC = Runtime.getRuntime().freeMemory() / 1024 / 1024;
        System.out.println("Free memory after forcing GC: " + afterGC + " MB");
        System.out.println("Difference: " + (afterGC - beforeGC) + " MB");
    }
}
