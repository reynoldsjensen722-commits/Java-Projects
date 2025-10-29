package chapter_9;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (eq.isSolvable()) {
            System.out.printf("x = %.2f, y = %.2f\n", eq.getX(), eq.getY());
        } else {
            System.out.println("The equation has no solution.");
        }

        input.close();
    }
}

