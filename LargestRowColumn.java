package chapter_8;

import java.util.Random;

public class LargestRowColumn {

    public static void main(String[] args) {
        int SIZE = 4;
        int[][] matrix = new int[SIZE][SIZE];
        Random rand = new Random();

        // Fill matrix with random 0s and 1s
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = rand.nextInt(2); // 0 or 1
            }
        }

        // Print matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val);
            }
            System.out.println();
        }

        // Find largest row
        int maxRow = 0;
        int maxRowCount = 0;
        for (int i = 0; i < SIZE; i++) {
            int count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxRowCount) {
                maxRow = i;
                maxRowCount = count;
            }
        }

        // Find largest column
        int maxCol = 0;
        int maxColCount = 0;
        for (int j = 0; j < SIZE; j++) {
            int count = 0;
            for (int i = 0; i < SIZE; i++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxColCount) {
                maxCol = j;
                maxColCount = count;
            }
        }

        // Display results
        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }


}
