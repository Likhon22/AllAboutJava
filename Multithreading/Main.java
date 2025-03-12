
public class Main {
    public static void main(String[] args) {
        // multi-threading= Enables program to run multiple threads concurrently
        // Thread= a single sequence of execution within a program

        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
    }
}
