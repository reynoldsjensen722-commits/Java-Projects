package chapter_9;

public class TestStopWatch {
    public static void main(String[] args) {
        final int SIZE = 100_000;
        int[] array = new int[SIZE];

        // Fill array with random numbers
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int)(Math.random() * SIZE);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        // Selection sort
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        stopwatch.stop();

        System.out.println("Time taken to sort 100,000 elements with selection sort: " +
                stopwatch.getElapsedTime() + " milliseconds");
    }
}

