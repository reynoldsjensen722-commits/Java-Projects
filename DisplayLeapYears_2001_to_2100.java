package chapter_5;

public class DisplayLeapYears_2001_to_2100 {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 2001; year <= 2100; year++) {
            boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (leap) {
                System.out.printf("%6d", year);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        if (count % 10 != 0) System.out.println();
        System.out.println("Total leap years: " + count);
    }
}

