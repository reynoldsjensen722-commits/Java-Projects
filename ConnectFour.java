package chapter_8;

import java.util.Scanner;

public class ConnectFour {

    public static final int ROWS = 6;
    public static final int COLS = 7;

    public static void printBoard(char[][] board) {
        for (int i = 0; i < ROWS; i++) {
            System.out.print("|");
            for (int j = 0; j < COLS; j++) {
                System.out.print((board[i][j] == ' ' ? " " : board[i][j]) + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static boolean dropDisc(char[][] board, int col, char disc) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == ' ') {
                board[i][col] = disc;
                return true;
            }
        }
        return false; // column is full
    }

    public static boolean checkWin(char[][] board, char disc) {
        // Horizontal
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j <= COLS - 4; j++)
                if (board[i][j] == disc && board[i][j + 1] == disc &&
                    board[i][j + 2] == disc && board[i][j + 3] == disc)
                    return true;

        // Vertical
        for (int j = 0; j < COLS; j++)
            for (int i = 0; i <= ROWS - 4; i++)
                if (board[i][j] == disc && board[i + 1][j] == disc &&
                    board[i + 2][j] == disc && board[i + 3][j] == disc)
                    return true;

        // Diagonal ↘
        for (int i = 0; i <= ROWS - 4; i++)
            for (int j = 0; j <= COLS - 4; j++)
                if (board[i][j] == disc && board[i + 1][j + 1] == disc &&
                    board[i + 2][j + 2] == disc && board[i + 3][j + 3] == disc)
                    return true;

        // Diagonal ↙
        for (int i = 0; i <= ROWS - 4; i++)
            for (int j = 3; j < COLS; j++)
                if (board[i][j] == disc && board[i + 1][j - 1] == disc &&
                    board[i + 2][j - 2] == disc && board[i + 3][j - 3] == disc)
                    return true;

        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int j = 0; j < COLS; j++)
            if (board[0][j] == ' ') return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = new char[ROWS][COLS];

        // Fill board with spaces
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLS; j++)
                board[i][j] = ' ';

        char currentPlayer = 'R';
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(board);
            System.out.print("Drop a " + (currentPlayer == 'R' ? "red" : "yellow") +
                             " disk at column (0–6): ");
            int col = input.nextInt();

            if (col < 0 || col >= COLS || !dropDisc(board, col, currentPlayer)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println((currentPlayer == 'R' ? "Red" : "Yellow") + " player won!");
                gameOver = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("Draw. Board is full!");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'R') ? 'Y' : 'R';
            }
        }

        input.close();
    }
}

