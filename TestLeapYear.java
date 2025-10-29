package chapter_3;
import java.util.Scanner;

public class TestLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

        input.close();
    }
}
