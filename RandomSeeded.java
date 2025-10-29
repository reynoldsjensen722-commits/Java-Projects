package chapter_9;

import java.util.Random;

public class RandomSeeded {
    public static void main(String[] args) {
        Random rand = new Random(1000);

        System.out.println("50 Random Integers (0–99) with Seed 1000:");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%3d", rand.nextInt(100));

            if (i % 10 == 0) {
                System.out.println(); // new line every 10 numbers
            } else {
                System.out.print(" ");
            }
        }
    }
}

