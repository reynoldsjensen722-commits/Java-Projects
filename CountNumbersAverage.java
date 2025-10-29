package chapter_5;
import java.util.Scanner;

public class CountNumbersAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int totalCount = 0;
        double sum = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        while (number != 0) {
            if (number > 0)
                positiveCount++;
            else
                negativeCount++;

            sum += number;
            totalCount++;

            number = input.nextInt(); // read next number
        }

        if (totalCount == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            double average = sum / totalCount;
            System.out.println("The number of positives is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);
        }

        input.close();
    }
}
