package chapter_8;

import java.util.Scanner;

public class MarkovMatrix {

    public static boolean isMarkovMatrix(double[][] m) {
        int size = m.length;

        // Check all elements are positive
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (m[i][j] < 0)
                    return false;

        // Check each column sums to 1
        for (int j = 0; j < size; j++) {
            double sum = 0;
            for (int i = 0; i < size; i++) {
                sum += m[i][j];
            }
            if (Math.abs(sum - 1.0) > 1e-6) // tolerance for rounding errors
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = input.nextDouble();

        if (isMarkovMatrix(m)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }

        input.close();
    }
}

