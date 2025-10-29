package chapter_8;

import java.util.Scanner;

public class LocateLargest {

    public static int[] locateLargest(double[][] a) {
        int maxRow = 0;
        int maxCol = 0;
        double max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new int[]{maxRow, maxCol};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input array dimensions
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                array[i][j] = input.nextDouble();

        int[] location = locateLargest(array);
        System.out.printf("The location of the largest element is at (%d, %d)\n",
                          location[0], location[1]);

        input.close();
    }
}

