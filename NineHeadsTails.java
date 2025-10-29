package chapter_8;

import java.util.Scanner;

public class NineHeadsTails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Read number
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();

        // Step 2: Convert to 9-bit binary string
        String binary = String.format("%9s", Integer.toBinaryString(number)).replace(' ', '0');

        // Step 3: Fill 3x3 matrix with H and T
        char[][] matrix = new char[3][3];
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = binary.charAt(index++) == '0' ? 'H' : 'T';
            }
        }

        // Step 4: Print matrix
        for (char[] row : matrix) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

