package chapter_8;

import java.util.Scanner;

public class ColumnSum {
    
    // Method to sum a column
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLS = 4;
        double[][] matrix = new double[ROWS][COLS];

        // Prompt user to enter the matrix
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Print sum of each column
        for (int col = 0; col < COLS; col++) {
            double sum = sumColumn(matrix, col);
            System.out.printf("Sum of the elements at column %d is %.1f\n", col, sum);
        }

        input.close();
    }
}

