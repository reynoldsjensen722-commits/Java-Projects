package chapter_6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShowCurrentTime {

    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define the format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format and display
        String formattedDateTime = now.format(formatter);
        System.out.println("Current date and time is: " + formattedDateTime);
    }
}

