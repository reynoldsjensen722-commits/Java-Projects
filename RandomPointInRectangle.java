package chapter_3;
import java.util.Random;

public class RandomPointInRectangle {
    public static void main(String[] args) {
        Random rand = new Random();

        // Rectangle centered at 0,0 with width 100 and height 200
        double x = -50 + rand.nextDouble() * 100;   // in range [-50, 50]
        double y = -100 + rand.nextDouble() * 200;  // in range [-100, 100]

        System.out.printf("Random coordinate inside the rectangle: (%.2f, %.2f)%n", x, y);
    }
}
