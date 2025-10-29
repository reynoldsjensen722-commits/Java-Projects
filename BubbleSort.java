package chapter_7;

import java.util.Scanner;

public class BubbleSort {

    // Bubble sort method for double array
    public static void bubbleSort(double[] array) {
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimization: stop if no swap occurred
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 double numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        bubbleSort(numbers);

        System.out.print("Sorted numbers: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }

        input.close();
    }
}

