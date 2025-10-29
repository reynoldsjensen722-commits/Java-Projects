package chapter_7;

import java.util.Scanner;

public class IndexOfMinimum {

    // Method to find index of smallest element
    public static int indexOfSmallestElement(double[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        int minIndex = indexOfSmallestElement(numbers);
        System.out.println("The index of the smallest element is " + minIndex);

        input.close();
    }
}

