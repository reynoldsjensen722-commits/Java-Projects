package chapter_7;

import java.util.Scanner;

public class StatsDeviation {

    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double sum = 0;
        for (double val : x) {
            sum += val;
        }
        return sum / x.length;
    }

    /** Compute the standard deviation of double values */
    public static double deviation(double[] x) {
        double mean = mean(x);
        double sumSquaredDiffs = 0;

        for (double val : x) {
            sumSquaredDiffs += Math.pow(val - mean, 2);
        }

        return Math.sqrt(sumSquaredDiffs / (x.length - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        double avg = mean(numbers);
        double stdDev = deviation(numbers);

        System.out.printf("The mean is %.2f\n", avg);
        System.out.printf("The standard deviation is %.5f\n", stdDev);

        input.close();
    }
}

