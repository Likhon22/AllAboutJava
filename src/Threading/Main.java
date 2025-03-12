
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Threading = allows to run multiple tasks simultaneously.Helps improve performance with time consuming operations(File I/O operations)
        // How to create a thread
        // 1. Create a class that extends Thread class
        // 2. implement the runnable interface(better)



        Scanner scanner = new Scanner(System.in);
  MyRunnable runnable = new MyRunnable();
  Thread thread = new Thread(runnable);
  thread.start();
        System.out.print("You have 5s to enter your name:");
    
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        scanner.close();
    }
}
