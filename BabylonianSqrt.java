package chapter_6;

import java.util.Scanner;

public class BabylonianSqrt {

    // Method to compute square root using Babylonian method
    public static double sqrt(long n) {
        double guess = n / 2.0;
        double epsilon = 0.0001;

        while (Math.abs(guess * guess - n) > epsilon) {
            guess = (guess + n / guess) / 2.0;
        }

        return guess;
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double value = input.nextDouble();

        if (value <= 0) {
            System.out.println("Value must be positive.");
        } else {
            long intValue = (long) value;
            double result = sqrt(intValue);
            System.out.printf("Estimated square root of %d is %.5f\n", intValue, result);
        }

        input.close();
    }
}

