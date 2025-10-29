package chapter_8;

import java.util.Scanner;

public class FindFlippedCell {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SIZE = 6;
        int[][] matrix = new int[SIZE][SIZE];

        System.out.println("Enter a 6-by-6 matrix row by row:");
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                matrix[i][j] = input.nextInt();

        int flippedRow = -1, flippedCol = -1;

        // Step 1: Check rows
        for (int i = 0; i < SIZE; i++) {
            int count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count % 2 != 0) {
                flippedRow = i;
                break;
            }
        }

        // Step 2: Check columns
        for (int j = 0; j < SIZE; j++) {
            int count = 0;
            for (int i = 0; i < SIZE; i++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count % 2 != 0) {
                flippedCol = j;
                break;
            }
        }

        if (flippedRow != -1 && flippedCol != -1) {
            System.out.printf("The flipped cell is at (%d, %d)\n", flippedRow, flippedCol);
        } else {
            System.out.println("No flipped cell detected. All rows and columns are even.");
        }

        input.close();
    }
}

