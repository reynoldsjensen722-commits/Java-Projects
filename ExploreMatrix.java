package chapter_8;

import java.util.Scanner;
import java.util.Random;

public class ExploreMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the size for the matrix: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        // Fill matrix with 0s and 1s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(2); // 0 or 1
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // Check rows
        for (int i = 0; i < n; i++) {
            boolean allZero = true, allOne = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) allZero = false;
                if (matrix[i][j] != 1) allOne = false;
            }
            if (allZero) System.out.println("All 0s on row " + i);
            else if (allOne) System.out.println("All 1s on row " + i);
        }

        // Check columns
        boolean columnFound = false;
        for (int j = 0; j < n; j++) {
            boolean allZero = true, allOne = true;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] != 0) allZero = false;
                if (matrix[i][j] != 1) allOne = false;
            }
            if (allZero) {
                System.out.println("All 0s on column " + j);
                columnFound = true;
            } else if (allOne) {
                System.out.println("All 1s on column " + j);
                columnFound = true;
            }
        }
        if (!columnFound) System.out.println("No same numbers on a column");

        // Check major diagonal
        boolean majorZero = true, majorOne = true;
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] != 0) majorZero = false;
            if (matrix[i][i] != 1) majorOne = false;
        }
        if (majorZero)
            System.out.println("All 0s on the major diagonal");
        else if (majorOne)
            System.out.println("All 1s on the major diagonal");
        else
            System.out.println("No same numbers on the major diagonal");

        // Check sub-diagonal
        boolean subZero = true, subOne = true;
        for (int i = 0; i < n; i++) {
            if (matrix[i][n - 1 - i] != 0) subZero = false;
            if (matrix[i][n - 1 - i] != 1) subOne = false;
        }
        if (subZero)
            System.out.println("All 0s on the sub-diagonal");
        else if (subOne)
            System.out.println("All 1s on the sub-diagonal");
        else
            System.out.println("No same numbers on the sub-diagonal");

        input.close();
    }
}

