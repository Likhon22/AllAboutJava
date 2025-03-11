/**
 * Demonstrates if-else statements and nested conditionals.
 */
public class ConditionalExamples {
    public static void main(String[] args) {
        // Demonstrate if-else with monster encounters
        System.out.println("=== Adventure Choice Scenarios ===");
        adventureChoice(75, 5);  // Good health, moderate monster
        adventureChoice(75, 9);  // Good health, tough monster
        adventureChoice(30, 5);  // Low health
        
        // More complex example with journey decisions
        System.out.println("\n=== Journey Decisions ===");
        journeyDecision(5, false, "night", "stormy");  // Poor, lost in storm at night
        journeyDecision(5, true, "night", "stormy");   // Poor but with map in storm
        journeyDecision(20, false, "day", "sunny");    // Well-funded day journey
    }
    
    public static void adventureChoice(int healthPoints, int monsterLevel) {
        System.out.println("Health: " + healthPoints + ", Monster Level: " + monsterLevel);

        if (healthPoints > 50) {
            System.out.println("You're ready to face the monster!");

            if (monsterLevel > 7) {
                System.out.println("But be careful, this monster is very strong!");
            } else {
                System.out.println("This should be a fair fight.");
            }
        } else {
            System.out.println("You should heal before this fight!");
        }
        System.out.println();
    }
    
    public static void journeyDecision(int gold, boolean hasMap, String timeOfDay, String weather) {
        System.out.println("Situation: You have " + gold + " gold. " +
                        (hasMap ? "You possess a map. " : "You don't have a map. ") +
                        "It's " + timeOfDay + " and the weather is " + weather + ".");

        if (gold < 10) {
            System.out.println("You don't have enough gold for inn lodging.");

            if (weather.equals("stormy")) {
                System.out.println("With the storm raging, you seek shelter in a cave.");

                if (!hasMap) {
                    System.out.println("Without a map, you become lost in the caverns...");
                } else {
                    System.out.println("Your map shows a safe path through the caverns.");
                }
            } else {
                System.out.println("You make camp under the stars.");
            }
        } else {
            System.out.println("You have enough gold for lodging!");

            if (timeOfDay.equals("night")) {
                System.out.println("You check into the cozy village inn.");
            } else {
                System.out.println("It's still " + timeOfDay + ", so you continue your journey.");

                if (weather.equals("sunny")) {
                    System.out.println("The pleasant weather makes for an enjoyable trip.");
                } else {
                    System.out.println("You travel cautiously through the " + weather + " conditions.");
                }
            }
        }
        System.out.println();
    }
}
