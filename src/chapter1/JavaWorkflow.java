/**
 * This class demonstrates the Java workflow - from source code to execution.
 * 
 * The process:
 * 1. Write Java code (.java file)
 * 2. Compile with javac to bytecode (.class file)
 * 3. Run on the JVM which converts bytecode to machine code
 */
public class JavaWorkflow {
    public static void main(String[] args) {
        System.out.println("This code was written as a .java file");
        System.out.println("Then compiled to bytecode with javac");
        System.out.println("Now it's running on the Java Virtual Machine");
        System.out.println("The JVM translates bytecode to your computer's machine code");
        
        // Show some system properties to demonstrate JVM information
        System.out.println("\nYour JVM details:");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("JVM Name: " + System.getProperty("java.vm.name"));
        System.out.println("OS Name: " + System.getProperty("os.name"));
    }
}
