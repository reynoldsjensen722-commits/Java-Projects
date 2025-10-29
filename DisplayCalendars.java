package chapter_5;

import java.util.Scanner;

public class DisplayCalendars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for year and first day of the year (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        System.out.print("Enter full year (e.g., 2013): ");
        int year = input.nextInt();

        System.out.print("Enter first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int startDay = input.nextInt();

        // Loop through each month
        for (int month = 1; month <= 12; month++) {
            String monthName = getMonthName(month);

            // Print header
            System.out.println("\n         " + monthName + " " + year);
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            // Calculate start spacing
            int dayOfWeek = startDay;
            for (int i = 0; i < dayOfWeek; i++) {
                System.out.print("    ");
            }

            // Get number of days in month
            int daysInMonth = getDaysInMonth(month, year);

            // Print days of the month
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%4d", day);
                dayOfWeek++;
                if (dayOfWeek == 7) {
                    System.out.println(); // New line
                    dayOfWeek = 0;
                }
            }

            // Update startDay for next month
            startDay = dayOfWeek;
            System.out.println(); // Blank line after each month
        }

        input.close();
    }

    // Returns the name of the month
    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Unknown";
        };
    }

    // Returns the number of days in the specified month and year
    public static int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 0;
        };
    }

    // Returns true if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

