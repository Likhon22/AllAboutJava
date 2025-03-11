import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Demonstrates working with dates and times in Java.
 */
public class DateTimeExample {
    public static void main(String[] args) {
        System.out.println("=== Date and Time Examples ===");
        
        // Current date - today's quest log
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
        
        // Current time - when the dragon appeared
        LocalTime currentTime = LocalTime.now();
        System.out.println("The dragon appeared at: " + currentTime);
        
        // Both date and time - full timestamp of the event
        LocalDateTime eventMoment = LocalDateTime.now();
        System.out.println("Full chronicle entry: " + eventMoment);
        
        // Custom formatting for royal proclamations
        DateTimeFormatter royalFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTimestamp = eventMoment.format(royalFormat);
        System.out.println("Royal proclamation date: " + formattedTimestamp);
        
        // Scheduling a future quest
        System.out.println("\n=== Quest Scheduling ===");
        LocalDate questDeadline = today.plusDays(7);
        System.out.println("The quest begins today: " + today);
        System.out.println("You must return by: " + questDeadline);
        
        // Check if the quest is due on a weekend
        int dayOfWeek = questDeadline.getDayOfWeek().getValue(); // 1=Monday, 7=Sunday
        boolean isWeekend = (dayOfWeek == 6 || dayOfWeek == 7);
        System.out.println("Quest is due on a weekend: " + isWeekend);
        
        // Creating a countdown timer for midnight release
        System.out.println("\n=== Countdown Timer ===");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime midnight = now.toLocalDate().plusDays(1).atStartOfDay();
        
        // Calculate difference in hours and minutes
        long hoursUntil = Duration.between(now, midnight).toHours();
        long minutesUntil = Duration.between(now, midnight).toMinutes() % 60;
        
        System.out.println("New spell book releases at midnight!");
        System.out.println("Time until release: " + hoursUntil + " hours and " + minutesUntil + " minutes");
        
        // Compare dates for festival and tournament
        LocalDate festivalDate = LocalDate.of(2023, 12, 15);
        LocalDate tournamentDate = LocalDate.of(2023, 12, 25);
        System.out.println("\nFestival date: " + festivalDate);
        System.out.println("Tournament date: " + tournamentDate);
        System.out.println("Is the festival before the tournament? " + 
                          festivalDate.isBefore(tournamentDate));
    }
}
