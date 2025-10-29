package chapter_6;

import java.util.Scanner;

public class PrintCalendarSimplified {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for year and month
        System.out.print("Enter full year (e.g., 2025): ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        printMonth(year, month);
        input.close();
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDays = getNumberOfDaysInMonth(year, month);

        // Print spaces before the first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%4d", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    /** Use Zeller’s Congruence to calculate the start day */
    public static int getStartDay(int year, int month) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        int q = 1; // First day of the month
        int k = year % 100;
        int j = year / 100;

        int h = (q + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Convert Zeller's output to Sunday = 0, ..., Saturday = 6
        return (h + 6) % 7;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return isLeapYear(year) ? 29 : 28;
            default: return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}

