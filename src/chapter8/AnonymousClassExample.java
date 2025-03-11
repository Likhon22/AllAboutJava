/**
 * Demonstrates the use of anonymous classes in Java.
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
        System.out.println("=== Anonymous Class Example ===");
        
        // Create a regular dog that barks normally
        Dog dog1 = new Dog();
        dog1.bark();  // Normal dog bark
        
        // Create a special dog using an anonymous class
        Dog dog2 = new Dog() {
            @Override
            void bark() {
                System.out.println("Meow");  // This dog meows instead!
            }
        };
        dog2.bark();  // Special dog sound
        
        // Create a button with an anonymous event handler
        Button attackButton = new Button("Attack!");
        attackButton.setOnAction(new EventHandler() {
            @Override
            public void handleEvent() {
                System.out.println("The hero swings their sword!");
                System.out.println("Enemy takes 25 damage!");
            }
        });
        
        // Simulate button click
        attackButton.click();
    }
    
    // Simple Dog class for demonstration
    static class Dog {
        void bark() {
            System.out.println("Woof");
        }
    }
    
    // Simple Button class for demonstration
    static class Button {
        private String label;
        private EventHandler action;
        
        public Button(String label) {
            this.label = label;
        }
        
        public void setOnAction(EventHandler action) {
            this.action = action;
        }
        
        public void click() {
            System.out.println("Button '" + label + "' was clicked!");
            if (action != null) {
                action.handleEvent();
            }
        }
    }
    
    // Simple EventHandler interface for demonstration
    interface EventHandler {
        void handleEvent();
    }
}
