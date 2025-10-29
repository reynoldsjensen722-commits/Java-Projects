package chapter_11;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for triangle sides
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();

        // Input for color and filled
        System.out.print("Enter color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Create triangle object
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display information
        System.out.println("\n" + triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        input.close();
    }
}

