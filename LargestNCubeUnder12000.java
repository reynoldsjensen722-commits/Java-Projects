package chapter_5;

public class LargestNCubeUnder12000 {
    public static void main(String[] args) {
        int n = 0;
        while ((n + 1) * (n + 1) * (n + 1) < 12000) n++;
        System.out.println("Largest n such that n^3 < 12000 is " + n);
        System.out.println("Check: " + n + "^3 = " + (n * n * n));
    }
}
