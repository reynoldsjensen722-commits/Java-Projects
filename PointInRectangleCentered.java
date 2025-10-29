package chapter_3;
import java.util.Scanner;

public class PointInRectangleCentered {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Rectangle centered at (0, 0) with width 10 and height 5
        System.out.print("Enter a point (x y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean inside = Math.abs(x) <= 10 / 2.0 && Math.abs(y) <= 5 / 2.0;

        System.out.println("Point (" + x + ", " + y + ") is " + (inside ? "" : "not ") + "in the rectangle");

        input.close();
    }
}
