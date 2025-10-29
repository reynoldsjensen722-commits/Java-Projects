package chapter_7;

import java.util.Random;

public class CountSingleDigits {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] counts = new int[10];

        // Generate 100 random digits and count them
        for (int i = 0; i < 100; i++) {
            int digit = rand.nextInt(10); // 0 to 9
            counts[digit]++;
        }

        // Display results
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
}

