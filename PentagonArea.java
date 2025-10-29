
package chapter_6;

import java.util.Scanner;

public class PentagonArea {

    // Method to calculate the area of a regular pentagon
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }

    // Main method to get user input and display area
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the pentagon: ");
        double side = input.nextDouble();

        double pentagonArea = area(side);

        System.out.printf("The area of the pentagon is %.4f\n", pentagonArea);

        input.close();
    }
}
