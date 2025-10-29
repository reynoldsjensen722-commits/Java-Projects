package chapter_7;

/*
 * Author: Jensen Reynolds
 * Class: CS 2
 * Professor: Taylor
 * Date: [Insert Date Here]
 * Description: This program implements selection sort to sort an array of doubles.
 */

public class SelectionSort {
    /** The method for sorting the numbers */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        double[] numbers = {3.5, 2.1, 5.7, 1.2};
        selectionSort(numbers);

        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}
