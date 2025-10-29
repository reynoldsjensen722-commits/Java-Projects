package chapter_3;
import java.util.Scanner;

public class Exercise3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today’s day (0 for Sunday, 1 for Monday, …, 6 for Saturday): ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int futureDay = (today + elapsed) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Today is " + days[today] + " and the future day is " + days[futureDay]);

        input.close();
    }
}
