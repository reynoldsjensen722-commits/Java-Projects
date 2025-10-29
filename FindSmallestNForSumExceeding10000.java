package chapter_5;

public class FindSmallestNForSumExceeding10000 {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (sum <= 10000) {
            n++;
            sum += n;
        }
        System.out.println("Smallest n such that 1+2+...+n > 10000 is " + n);
        System.out.println("Sum = " + sum);
    }
}
