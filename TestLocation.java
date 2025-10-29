package chapter_9;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] matrix = new double[rows][cols];
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = input.nextDouble();

        Location loc = Location.locateLargest(matrix);

        System.out.printf("The location of the largest element is %.1f at (%d, %d)\n",
                          loc.maxValue, loc.row, loc.column);

        input.close();
    }
}
