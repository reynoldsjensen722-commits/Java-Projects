package chapter_7;

import java.util.*;

public class BeanMachine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of balls: ");
        int balls = input.nextInt();
        System.out.print("Enter number of slots: ");
        int slotsCount = input.nextInt();

        int[] slots = new int[slotsCount];

        // Drop balls
        for (int b = 0; b < balls; b++) {
            int rightCount = 0;
            StringBuilder path = new StringBuilder();

            for (int i = 0; i < slotsCount - 1; i++) {
                if (rand.nextBoolean()) {
                    path.append('R');
                    rightCount++;
                } else {
                    path.append('L');
                }
            }

            System.out.println(path);
            slots[rightCount]++;
        }

        // Display histogram
        int max = Arrays.stream(slots).max().getAsInt();
        for (int i = max; i > 0; i--) {
            for (int slot : slots) {
                System.out.print((slot >= i ? "O" : " ") + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

