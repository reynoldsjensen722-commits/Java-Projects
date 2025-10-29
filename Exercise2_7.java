package chapter_2;

import java.util.Scanner;

public class Exercise2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int minutesInYear = 60 * 24 * 365;
        int years = minutes / minutesInYear;
        int remainingMinutes = minutes % minutesInYear;
        int days = remainingMinutes / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        input.close();
    }
}