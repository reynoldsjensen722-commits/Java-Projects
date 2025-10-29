package chapter_4;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next();

        if (!month.matches("Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec")) {
            System.out.println(month + " is not a correct month name");
            input.close();
            return;
        }

        int days;
        switch (month) {
            case "Jan": case "Mar": case "May": case "Jul":
            case "Aug": case "Oct": case "Dec":
                days = 31; break;
            case "Apr": case "Jun": case "Sep": case "Nov":
                days = 30; break;
            case "Feb":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) days = 29;
                else days = 28;
                break;
            default:
                days = 0;
        }

        System.out.println(month + " " + year + " has " + days + " days");
        input.close();
    }
}
