package chapter_7;

import java.util.Random;


public class RandomChooser {

    public static int getRandom(int start, int end, int... exclude) {
        Random rand = new Random();
        int r;
        boolean isExcluded;

        do {
            r = rand.nextInt(end - start + 1) + start;
            isExcluded = false;
            for (int ex : exclude) {
                if (r == ex) {
                    isExcluded = true;
                    break;
                }
            }
        } while (isExcluded);

        return r;
    }

    public static void main(String[] args) {
        // Call 45 times
        for (int i = 1; i <= 45; i++) {
            int randNum = getRandom(1, 100, 4, 8, 95, 93);
            System.out.printf("%4d", randNum);

            if (i % 15 == 0) {
                System.out.println();
            }
        }
    }
}

