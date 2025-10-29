package chapter_6;

public class DaysInYear {

    // Method to return number of days in a given year
    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366; // Leap year
        } else {
            return 365; // Common year
        }
    }

    // Test program
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s\n", "Year", "Days in Year");
        System.out.println("----------------------------");

        for (int year = 2000; year <= 2020; year++) {
            System.out.printf("%-10d%-15d\n", year, numberOfDaysInAYear(year));
        }
    }
}
