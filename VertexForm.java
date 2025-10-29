package chapter_13;

import java.util.Scanner;

public class VertexForm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();

        RationalBig h = new RationalBig(-b, 2 * a);
        RationalBig k = new RationalBig(4 * a * c - b * b, 4 * a);

        System.out.println("h is " + h);
        System.out.println("k is " + k);
    }
}

