package chapter_6;

import java.util.Calendar;


public class EpochTimeToDate {

    public static void main(String[] args) {
        // Get current time in milliseconds since Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Convert to total seconds
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        // Convert to total minutes
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        // Convert to total hours
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        // Use Calendar to get actual date
        Calendar calendar = Calendar.getInstance(); // local time zone by default

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 0-based month
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Display date and time
        System.out.printf("Current date and time: %d-%02d-%02d %02d:%02d:%02d\n",
                          year, month, day, currentHour, currentMinute, currentSecond);
    }
}

