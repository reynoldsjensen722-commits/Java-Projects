package chapter_3;
import java.util.Scanner;

public class RectangleOverlap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // rectangle 1 center x y width height
        System.out.print("Enter r1’s center x y width height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        // rectangle 2 center x y width height
        System.out.print("Enter r2’s center x y width height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        boolean r2Inside =
            Math.abs(x2 - x1) <= (w1 - w2) / 2.0 &&
            Math.abs(y2 - y1) <= (h1 - h2) / 2.0;

        boolean overlap =
            Math.abs(x2 - x1) <= (w1 + w2) / 2.0 &&
            Math.abs(y2 - y1) <= (h1 + h2) / 2.0;

        if (r2Inside)
            System.out.println("r2 is inside r1");
        else if (overlap)
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");

        input.close();
    }
}
