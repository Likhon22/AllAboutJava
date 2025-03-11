import java.util.Timer;
import java.util.TimerTask;

/**
 * Demonstrates using Timer and TimerTask in Java.
 */
public class TimerExample {
    public static void main(String[] args) {
        System.out.println("=== Timer Example ===");
        System.out.println("Starting magical countdown...");
        
        // Create a magical timer
        Timer timer = new Timer();

        // Create a task to be scheduled
        TimerTask task = new TimerTask() {
            int countdown = 3;

            @Override
            public void run() {
                System.out.println("Magical effect happening! " + countdown + " seconds remaining");
                countdown--;

                if (countdown < 0) {
                    System.out.println("Spell completed!");
                    timer.cancel();  // Stop the timer when done
                }
            }
        };

        // Schedule the task to run every 1 second (1000ms) starting immediately
        timer.schedule(task, 0, 1000);
        
        System.out.println("Timer scheduled. Main thread continues...");
        
        // The main thread will continue executing
        // In a real application, you might wait for user input or do other processing
        
        // Let the program run for a bit to see the timer in action
        try {
            Thread.sleep(5000);  // Wait 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main program exiting.");
    }
}
