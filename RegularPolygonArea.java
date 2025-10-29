package chapter_6;

import java.util.Scanner;

public class RegularPolygonArea {

    // Method to calculate area of regular polygon
    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    // Main method to get input and display area
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the length of each side: ");
        double side = input.nextDouble();

        double polygonArea = area(n, side);

        System.out.printf("The area of the regular polygon is %.4f\n", polygonArea);

        input.close();
    }
}

