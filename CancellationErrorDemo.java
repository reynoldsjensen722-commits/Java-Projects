package chapter_5;

public class CancellationErrorDemo {
    public static void main(String[] args) {
        double sumLeftToRight = 0.0;
        double sumRightToLeft = 0.0;

        for (int i = 1; i <= 50000; i++) {
            sumLeftToRight += 1.0 / i;
        }
        for (int i = 50000; i >= 1; i--) {
            sumRightToLeft += 1.0 / i;
        }

        System.out.println("Sum left to right: " + sumLeftToRight);
        System.out.println("Sum right to left: " + sumRightToLeft);
    }
}
