package chapter_5;

public class SmallestNSquareOver12000 {
    public static void main(String[] args) {
        int n = 0;
        while (n * n <= 12000) n++;
        System.out.println("Smallest n such that n^2 > 12000 is " + n);
        System.out.println("Check: " + n + "^2 = " + (n * n));
    }
}
