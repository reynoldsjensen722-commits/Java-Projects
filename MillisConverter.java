package chapter_6;

import java.util.Scanner;

public class MillisConverter {

    // Convert milliseconds to hours:minutes:seconds format
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;

        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;

        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;

        return hours + ":" + minutes + ":" + seconds;
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter time in milliseconds: ");
        long millis = input.nextLong();

        String timeString = convertMillis(millis);
        System.out.println("Time is " + timeString + " (hours:minutes:seconds)");

        input.close();
    }
}

