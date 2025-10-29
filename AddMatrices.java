package chapter_8;

import java.util.Scanner;

public class AddMatrices {

    // Method to add two matrices
    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] c = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    // Helper to print matrix nicely
    public static void printMatrices(double[][] a, double[][] b, double[][] c) {
        for (int i = 0; i < a.length; i++) {
            // Print matrix a
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4.1f ", a[i][j]);
            }

            // Print + or whitespace
            System.out.print(i == 1 ? "  +   " : "      ");

            // Print matrix b
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%4.1f ", b[i][j]);
            }

            // Print = or whitespace
            System.out.print(i == 1 ? "  =   " : "      ");

            // Print matrix c
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%4.1f ", c[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        System.out.print("Enter matrix1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = input.nextDouble();
            }
        }

        double[][] result = addMatrix(a, b);
        System.out.println("The matrices are added as follows:");
        printMatrices(a, b, result);

        input.close();
    }
}

