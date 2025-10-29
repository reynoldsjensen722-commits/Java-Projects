package chapter_8;

import java.util.Scanner;

public class TicTacToe {

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] == ' ' ? "  | " : board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean isWin(char[][] board, char player) {
        // Rows, columns, diagonals
        for (int i = 0; i < 3; i++)
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public static boolean isDraw(char[][] board) {
        for (char[] row : board)
            for (char cell : row)
                if (cell == ' ') return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = new char[3][3];

        // Initialize board with spaces
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';

        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard(board);
            System.out.printf("Enter a row (0, 1, or 2) for player %c: ", currentPlayer);
            int row = input.nextInt();
            System.out.printf("Enter a column (0, 1, or 2) for player %c: ", currentPlayer);
            int col = input.nextInt();

            // Check if cell is empty
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;

                if (isWin(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println(currentPlayer + " player won");
                    gameEnded = true;
                } else if (isDraw(board)) {
                    printBoard(board);
                    System.out.println("The game is a draw");
                    gameEnded = true;
                } else {
                    // Switch player
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }

            } else {
                System.out.println("Cell is already occupied, try again!");
            }
        }

        input.close();
    }
}

