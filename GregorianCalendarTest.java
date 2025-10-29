package chapter_9;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class GregorianCalendarTest {
    public static void main(String[] args) {
        // Task 1: Current date
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1; // 0-based
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Current date:");
        System.out.printf("%d-%02d-%02d\n", currentYear, currentMonth, currentDay);

        // Task 2: Set specific elapsed time
        long millis = 1234567898765L;
        calendar.setTimeInMillis(millis);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Date for elapsed time 1234567898765L:");
        System.out.printf("%d-%02d-%02d\n", year, month, day);
    }
}

