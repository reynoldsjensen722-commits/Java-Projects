package chapter_8;

import java.util.Scanner;

public class ConsecutiveFour {

    public static boolean isConsecutiveFour(int[][] values) {
        int rows = values.length;
        int cols = values[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int num = values[i][j];

                // Horizontal →
                if (j + 3 < cols &&
                    num == values[i][j + 1] &&
                    num == values[i][j + 2] &&
                    num == values[i][j + 3]) return true;

                // Vertical ↓
                if (i + 3 < rows &&
                    num == values[i + 1][j] &&
                    num == values[i + 2][j] &&
                    num == values[i + 3][j]) return true;

                // Diagonal ↘
                if (i + 3 < rows && j + 3 < cols &&
                    num == values[i + 1][j + 1] &&
                    num == values[i + 2][j + 2] &&
                    num == values[i + 3][j + 3]) return true;

                // Diagonal ↙
                if (i + 3 < rows && j - 3 >= 0 &&
                    num == values[i + 1][j - 1] &&
                    num == values[i + 2][j - 2] &&
                    num == values[i + 3][j - 3]) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of rows and columns: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] values = new int[rows][cols];
        System.out.println("Enter the values:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                values[i][j] = input.nextInt();

        // Check pattern
        boolean result = isConsecutiveFour(values);
        System.out.println(result);

        input.close();
    }
}

