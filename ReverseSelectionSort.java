package chapter_7;

import java.util.Scanner;

public class ReverseSelectionSort {

    /** Revised selection sort: push largest to the end */
    public static void selectionSort(double[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int maxIndex = 0;

            // Find index of the largest element in [0, i]
            for (int j = 1; j <= i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap max with the last element in this pass
            double temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 double numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        selectionSort(numbers);

        System.out.print("Sorted numbers: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
