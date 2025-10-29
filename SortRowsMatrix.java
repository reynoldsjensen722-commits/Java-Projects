package chapter_8;

import java.util.Arrays;
import java.util.Scanner;

public class SortRowsMatrix {

    public static double[][] sortRows(double[][] m) {
        double[][] sorted = new double[m.length][m[0].length];

        for (int i = 0; i < m.length; i++) {
            sorted[i] = m[i].clone();     // copy row
            Arrays.sort(sorted[i]);      // sort row
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

        double[][] sorted = sortRows(matrix);

        System.out.println("\nThe row-sorted array is");
        for (double[] row : sorted) {
            for (double val : row) {
                System.out.printf("%.3f ", val);
            }
            System.out.println();
        }

        input.close();
    }
}

