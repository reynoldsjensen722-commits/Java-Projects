package chapter_8;

import java.util.Scanner;

public class SudokuValidator {

    public static boolean isValidSudoku(int[][] grid) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            if (!isValidGroup(grid[i])) return false;
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            int[] col = new int[9];
            for (int i = 0; i < 9; i++) {
                col[i] = grid[i][j];
            }
            if (!isValidGroup(col)) return false;
        }

        // Check 3×3 boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                int[] box = new int[9];
                int k = 0;
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        box[k++] = grid[i][j];
                    }
                }
                if (!isValidGroup(box)) return false;
            }
        }

        return true;
    }

    public static boolean isValidGroup(int[] group) {
        boolean[] seen = new boolean[9]; // index 0 → value 1

        for (int num : group) {
            if (num < 1 || num > 9 || seen[num - 1]) return false;
            seen[num - 1] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] grid = new int[9][9];

        System.out.println("Enter a 9-by-9 Sudoku puzzle solution:");
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        boolean isValid = isValidSudoku(grid);
        System.out.println(isValid ? "Valid solution" : "Invalid solution");

        input.close();
    }
}

