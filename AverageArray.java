package chapter_7;

import java.util.Scanner;

public class AverageArray {

    // Overloaded method for int[]
    public static double average(int[] array) {
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
        return (double) sum / array.length;
    }
    // Overloaded method for double[]
    public static double average(double[] array) {
        double sum = 0;
        for (double val : array) {
            sum += val;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read 10 integers
        int[] intArray = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            intArray[i] = input.nextInt();
        }

        // Display average of integers
        System.out.println("Average of integers: " + average(intArray));

        // Read 10 doubles
        double[] doubleArray = new double[10];
        System.out.print("Enter 10 double values: ");
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = input.nextDouble();
        }

        // Display average of doubles
        System.out.println("Average of doubles: " + average(doubleArray));

        input.close();
    }
}
