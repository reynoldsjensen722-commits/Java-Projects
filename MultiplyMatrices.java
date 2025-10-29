package chapter_8;

import java.util.Scanner;

public class MultiplyMatrices {

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int size = a.length;
        double[][] result = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double sum = 0;
                for (int k = 0; k < size; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void printMatrices(double[][] a, double[][] b, double[][] c) {
        for (int i = 0; i < a.length; i++) {
            // matrix A
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4.1f ", a[i][j]);
            }

            System.out.print(i == 1 ? "  *   " : "      ");

            // matrix B
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%4.1f ", b[i][j]);
            }

            System.out.print(i == 1 ? "  =   " : "      ");

            // matrix C
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%4.1f ", c[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.print("Enter matrix1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] result = multiplyMatrix(matrix1, matrix2);

        System.out.println("The multiplication of the matrices is");
        printMatrices(matrix1, matrix2, result);

        input.close();
    }
}
