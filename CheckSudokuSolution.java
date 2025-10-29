package chapter_8;

import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        int[][] grid = readASolution();
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    public static int[][] readASolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        input.close();
        return grid;
    }

    public static boolean isValid(int[][] grid) {
        // Check each row
        for (int i = 0; i < 9; i++) {
            if (!is1To9(grid[i])) return false;
        }

        // Check each column
        for (int j = 0; j < 9; j++) {
            int[] column = new int[9];
            for (int i = 0; i < 9; i++) {
                column[i] = grid[i][j];
            }
            if (!is1To9(column)) return false;
        }

        // Check each 3×3 subgrid
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                int[] block = new int[9];
                int index = 0;
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        block[index++] = grid[i][j];
                    }
                }
                if (!is1To9(block)) return false;
            }
        }

        return true; // all checks passed
    }

    private static boolean is1To9(int[] values) {
        boolean[] seen = new boolean[9];
        for (int val : values) {
            if (val < 1 || val > 9) return false;
            if (seen[val - 1]) return false; // duplicate
            seen[val - 1] = true;
        }
        return true;
    }
}

