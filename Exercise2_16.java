package chapter_2;

import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double s = input.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * s * s;
        System.out.println("The area of the hexagon is " + area);

        input.close();
    }
}