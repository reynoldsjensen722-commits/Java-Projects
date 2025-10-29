package chapter_5;
import java.util.Scanner;

public class Statistics {
    // Read n numbers; print mean and sample standard deviation
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = input.nextInt();

        double sum = 0.0, sumSq = 0.0;
        for (int i = 0; i < n; i++) {
            double v = input.nextDouble();
            sum += v;
            sumSq += v * v;
        }
        double mean = sum / n;
        double variance = (sumSq - n * mean * mean) / (n - 1); // sample variance
        double stddev = Math.sqrt(variance);

        System.out.printf("Mean = %.6f, StdDev = %.6f%n", mean, stddev);
        input.close();
    }
}

