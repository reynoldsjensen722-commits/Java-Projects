package chapter_8;

import java.util.Scanner;

public class LargestBlock {

    public static int[] findLargestBlock(int[][] m) {
        int n = m.length;
        int[][] dp = new int[n][n];

        int maxSize = 0;
        int maxRow = 0, maxCol = 0;

        // Fill dp based on recurrence
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] == 1) {
                    if (i == 0 || j == 0)
                        dp[i][j] = 1; // edge cells
                    else
                        dp[i][j] = Math.min(Math.min(
                            dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;

                    if (dp[i][j] > maxSize) {
                        maxSize = dp[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }
        }

        return new int[]{maxRow - maxSize + 1, maxCol - maxSize + 1, maxSize};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = input.nextInt();

        int[] result = findLargestBlock(matrix);
        System.out.printf("The maximum square submatrix is at (%d, %d) with size %d\n",
                          result[0], result[1], result[2]);

        input.close();
    }
}

