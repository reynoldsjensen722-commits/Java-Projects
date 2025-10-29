package chapter_5;
import java.util.Scanner;

public class NumberStatsUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positives = 0, negatives = 0, count = 0;
        double sum = 0;

        System.out.print("Enter integers, the input ends if it is 0: ");
        while (true) {
            int n = input.nextInt();
            if (n == 0) break;
            if (n > 0) positives++; else negatives++;
            sum += n;
            count++;
        }
        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is " + positives);
            System.out.println("The number of negatives is " + negatives);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + (sum / count));
        }
        input.close();
    }
}
