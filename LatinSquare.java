package chapter_8;

import java.util.Scanner;

public class LatinSquare {

    public static boolean isLatinSquare(char[][] square) {
        int n = square.length;

        // Valid characters: A to A+n-1
        for (int i = 0; i < n; i++) {
            boolean[] seenRow = new boolean[n];
            boolean[] seenCol = new boolean[n];

            for (int j = 0; j < n; j++) {
                char rowChar = square[i][j];
                char colChar = square[j][i];

                if (rowChar < 'A' || rowChar >= 'A' + n ||
                    colChar < 'A' || colChar >= 'A' + n)
                    return false;

                if (seenRow[rowChar - 'A'] || seenCol[colChar - 'A'])
                    return false;

                seenRow[rowChar - 'A'] = true;
                seenCol[colChar - 'A'] = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        input.nextLine(); // consume newline

        char[][] square = new char[n][n];

        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        for (int i = 0; i < n; i++) {
            String[] line = input.nextLine().trim().split("\\s+");
            if (line.length != n) {
                System.out.println("Invalid input: each row must have " + n + " letters.");
                return;
            }

            for (int j = 0; j < n; j++) {
                square[i][j] = line[j].charAt(0);
                input.close();
            }
        }

        if (isLatinSquare(square)) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("Wrong input: the letters must be from A to " + (char)('A' + n - 1));
        }

       
    }
}

