package chapter_8;

import java.util.Arrays;

public class Sort2DArray {

    public static void sort(int[][] m) {
        Arrays.sort(m, (a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return a[i] - b[i]; // primary and secondary sort
                }
            }
            return 0; // rows are identical
        });
    }
    public static void main(String[] args) {
        int[][] m = {
            {4, 2},
            {1, 7},
            {4, 5},
            {1, 2},
            {1, 1},
            {4, 1}
        };

        System.out.println("Before sorting:");
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }

        sort(m);

        System.out.println("\nAfter sorting:");
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}


