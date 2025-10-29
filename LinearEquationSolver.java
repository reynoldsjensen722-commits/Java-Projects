package chapter_8;

import java.util.Scanner;

public class LinearEquationSolver {

    public static double[] linearEquation(double[][] a, double[] b) {
        double det = a[0][0] * a[1][1] - a[0][1] * a[1][0];

        if (det == 0) return null; // No solution

        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / det;
        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / det;

        return new double[]{x, y};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] a = new double[2][2];
        double[] b = new double[2];

        System.out.print("Enter a00, a01, a10, a11: ");
        a[0][0] = input.nextDouble();
        a[0][1] = input.nextDouble();
        a[1][0] = input.nextDouble();
        a[1][1] = input.nextDouble();

        System.out.print("Enter b0 and b1: ");
        b[0] = input.nextDouble();
        b[1] = input.nextDouble();

        double[] result = linearEquation(a, b);

        if (result == null) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.printf("x is %.3f and y is %.3f\n", result[0], result[1]);
        }

        input.close();
    }
}

