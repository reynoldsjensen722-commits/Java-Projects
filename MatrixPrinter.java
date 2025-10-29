package chapter_6;

import java.util.Scanner;

public class MatrixPrinter {

    // Method to print an n x n matrix of random 0s and 2s
    public static void printMatrix(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int value = Math.random() < 0.5 ? 0 : 2; // Randomly 0 or 2
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n (matrix size): ");
        int n = input.nextInt();

        System.out.println("Generated " + n + "x" + n + " Matrix:");
        printMatrix(n);

        input.close();
    }
}

