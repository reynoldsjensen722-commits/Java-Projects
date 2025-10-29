package chapter_8;

import java.util.Arrays;
import java.util.Random;

public class ShuffleMatrix {

    public static void shuffle(int[][] m) {
        Random rand = new Random();

        for (int i = m.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // 0 to i
            // Swap row i and j
            int[] temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] m = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8},
            {9, 10}
        };

        System.out.println("Before shuffle:");
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }

        shuffle(m);

        System.out.println("\nAfter shuffle:");
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}

