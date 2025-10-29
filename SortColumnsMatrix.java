package chapter_8;

import java.util.Arrays;
import java.util.Scanner;

public class SortColumnsMatrix {

    public static double[][] sortColumns(double[][] m) {
        int rows = m.length;
        int cols = m[0].length;
        double[][] sorted = new double[rows][cols];

        // Copy original matrix
        for (int i = 0; i < rows; i++)
            sorted[i] = m[i].clone();

        // Sort each column
        for (int j = 0; j < cols; j++) {
            double[] col = new double[rows];

            // Extract column
            for (int i = 0; i < rows; i++) {
                col[i] = sorted[i][j];
            }

            Arrays.sort(col);

            // Place back
            for (int i = 0; i < rows; i++) {
                sorted[i][j] = col[i];
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = input.nextDouble();

        double[][] sorted = sortColumns(matrix);
        System.out.println("\nThe column-sorted array is");
        for (double[] row : sorted) {
            for (double val : row) {
                System.out.printf("%.3f ", val);
            }
            System.out.println();
        }
        input.close();
    }
}
