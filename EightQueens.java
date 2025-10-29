package chapter_7;

public class EightQueens {

    static final int SIZE = 8;
    static int[][] board = new int[SIZE][SIZE];

    public static void main(String[] args) {
        if (solve(0)) {
            printBoard();
        } else {
            System.out.println("No solution found.");
        }
    }

    public static boolean solve(int row) {
        if (row == SIZE) return true;

        for (int col = 0; col < SIZE; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                if (solve(row + 1)) return true;
                board[row][col] = 0; // backtrack
            }
        }
        return false;
    }

    public static boolean isSafe(int row, int col) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < SIZE; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    public static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 1)
                    System.out.print("|Q");
                else
                    System.out.print("| ");
            }
            System.out.println("|");
        }
    }
}
