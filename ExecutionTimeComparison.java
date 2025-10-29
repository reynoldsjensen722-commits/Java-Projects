package chapter_7;

import java.util.Arrays;
import java.util.Random;

public class ExecutionTimeComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // Binary Search (iterative)
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < arr[mid])
                high = mid - 1;
            else if (key > arr[mid])
                low = mid + 1;
            else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = new int[100_000];
        Random rand = new Random();

        // Fill array with random integers between 1 and 1,000,000
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1_000_000) + 1;
        }

        // Random key
        int key = numbers[rand.nextInt(numbers.length)];

        // Measure Linear Search
        long startLinear = System.nanoTime();
        int linearResult = linearSearch(numbers, key);
        long endLinear = System.nanoTime();
        long timeLinear = endLinear - startLinear;

        // Sort array for Binary Search
        Arrays.sort(numbers);

        // Measure Binary Search
        long startBinary = System.nanoTime();
        int binaryResult = binarySearch(numbers, key);
        long endBinary = System.nanoTime();
        long timeBinary = endBinary - startBinary;

        // Results
        System.out.println("Key: " + key);
        System.out.println("Linear Search found at index: " + linearResult);
        System.out.println("Execution time (Linear): " + timeLinear + " ns");
        System.out.println("Binary Search found at index: " + binaryResult);
        System.out.println("Execution time (Binary): " + timeBinary + " ns");
    }
}

