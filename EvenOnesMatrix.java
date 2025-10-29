package chapter_8;

import java.util.Random;

public class EvenOnesMatrix {

    public static void main(String[] args) {
        final int SIZE = 6;
        int[][] matrix = new int[SIZE][SIZE];
        Random rand = new Random();

        // Step 1: Fill and print matrix
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = rand.nextInt(2); // 0 or 1
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Step 2: Check rows
        for (int i = 0; i < SIZE; i++) {
            int count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count % 2 != 0) {
                System.out.println("Not every row has an even number of 1s.");
                return;
            }
        }

        // Step 3: Check columns
        for (int j = 0; j < SIZE; j++) {
            int count = 0;
            for (int i = 0; i < SIZE; i++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count % 2 != 0) {
                System.out.println("Not every column has an even number of 1s.");
                return;
            }
        }

        // Step 4: All pass
        System.out.println("Every row and column has an even number of 1s.");
    }
}

