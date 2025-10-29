package chapter_3;
import java.util.Scanner;

public class FindCoordinatesQuadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x and y coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x == 0 && y == 0)
            System.out.println("Point is at the origin");
        else if (x == 0)
            System.out.println("Point is on the y-axis");
        else if (y == 0)
            System.out.println("Point is on the x-axis");
        else if (x > 0 && y > 0)
            System.out.println("Point is in Quadrant I");
        else if (x < 0 && y > 0)
            System.out.println("Point is in Quadrant II");
        else if (x < 0 && y < 0)
            System.out.println("Point is in Quadrant III");
        else
            System.out.println("Point is in Quadrant IV");

        input.close();
    }
}
