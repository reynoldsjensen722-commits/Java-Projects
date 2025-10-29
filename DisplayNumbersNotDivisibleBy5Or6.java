package chapter_5;

public class DisplayNumbersNotDivisibleBy5Or6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 5 != 0 && i % 6 != 0) {
                System.out.printf("%4d", i);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        if (count % 10 != 0) System.out.println();
    }
}
