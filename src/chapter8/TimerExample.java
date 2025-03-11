import java.util.Timer;
import java.util.TimerTask;

/**
 * Demonstrates using Timer and TimerTask for scheduling tasks.
 */
public class TimerExample {
    public static void main(String[] args) {
        System.out.println("=== Timer and TimerTask Example ===");
        
        // Create a timer
        Timer timer = new Timer();
        
        // Magical effect countdown task
        TimerTask magicTask = new TimerTask() {
            int countdown = 3;
            
            @Override
            public void run() {
                System.out.println("Magical effect happening!");
                countdown--;
                
                if (countdown == 0) {
                    System.out.println("Spell completed!");
                    timer.cancel();  // Stop the timer when done
                }
            }
        };
        
        // Schedule the task to run immediately and repeat every 2 seconds
        System.out.println("Casting spell...");
        timer.schedule(magicTask, 0, 2000);
        
        // Enemy scanning task
        TimerTask enemyScanner = new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nScanning for enemies...");
                // 30% chance to find an enemy
                if (Math.random() < 0.3) {
                    System.out.println("Enemy detected!");
                } else {
                    System.out.println("Area is clear.");
                }
            }
        };
        
        // Schedule the enemy scanner to run after 1 second and repeat every 5 seconds
        Timer enemyTimer = new Timer();
        enemyTimer.schedule(enemyScanner, 1000, 5000);
        
        // Note: In a real application, you would typically:
        // 1. Store timer references
        // 2. Cancel them appropriately when done
        // 3. Handle thread interruptions
        
        // For this example, we'll let the timers run until the main thread completes
        // In a real program, you might use timer.cancel() when appropriate
        
        System.out.println("\nTimer tasks are now running in the background.");
        System.out.println("(This example will run for about 10 seconds)");
        
        // Simulate the main program running for 10 seconds
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Clean up the timers
        enemyTimer.cancel();
        System.out.println("\nExample completed.");
    }
}
