package chapter_3;
import java.util.Scanner;

public class FutureDayFromToday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today’s day (0=Sun..6=Sat): ");
        int today = input.nextInt();

        System.out.print("Enter days elapsed: ");
        int elapsed = input.nextInt();

        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if (today < 0 || today > 6) {
            System.out.println("Invalid day index");
            input.close();
            return;
        }

        int future = (today + elapsed) % 7;
        System.out.println("Today is " + days[today] + " and the future day is " + days[future]);

        input.close();
    }
}

