package chapter_13;

import java.util.Scanner;

public class GeometricObjectTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.print("Enter the color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(s1, s2, s3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println("\n" + triangle);
        System.out.printf("Area: %.2f\n", triangle.getArea());
        System.out.printf("Perimeter: %.2f\n", triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
